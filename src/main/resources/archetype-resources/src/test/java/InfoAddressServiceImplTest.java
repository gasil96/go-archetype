package ${package};

import ${package}.clients.BrazilianZipCodeClient;
import ${package}.clients.dtos.BrazilianZipCodeResponseDTO;
import ${package}.dtos.InfoAddressDTO;
import ${package}.exceptions.BusinessException;
import ${package}.services.InfoAddressServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * TODO - Test of Service Info Address, later delete this comment.
 * */
@RunWith(MockitoJUnitRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class InfoAddressServiceImplTest {

	private static final String ZIP_CODE = "66820000";
	private static final String PUBLIC_PLACE = "Rod. Augusto Montenegro";
	private static final String ZIP_CODE_MASK = "66820-000";
	private static final String UF = "PA";
	private static final String STATE = "Pará";

	@InjectMocks
	private InfoAddressServiceImpl infoAddressService;

	@Mock
	private ModelMapper modelMapper;

	@Mock
	private BrazilianZipCodeClient brazilianZipCodeClient;

	@Test
	public void getInfoAddressWithSucces() {
		BrazilianZipCodeResponseDTO brazilianZipCodeResponseDTO = createBrazilianZipCodeResponseDTO();
		InfoAddressDTO infoAddressDTO = createInfoAddressDTO();

		when(brazilianZipCodeClient.getInfos(ZIP_CODE)).thenReturn(brazilianZipCodeResponseDTO);
		when(modelMapper.map(brazilianZipCodeResponseDTO, InfoAddressDTO.class)).thenReturn(infoAddressDTO);

		InfoAddressDTO result = infoAddressService.getInfoAddressBrazilian(ZIP_CODE);

		assertEquals(PUBLIC_PLACE, result.getAddress());
		assertEquals(STATE, result.getState());
		assertEquals(ZIP_CODE_MASK, result.getZipCode());
	}

	@Test(expected = BusinessException.class)
	public void getInfoAddressWithBussinesException() {
		when(brazilianZipCodeClient.getInfos(ZIP_CODE)).thenThrow(new BusinessException(""));

		infoAddressService.getInfoAddressBrazilian(ZIP_CODE);
	}

	private InfoAddressDTO createInfoAddressDTO() {
		return InfoAddressDTO.builder().zipCode(ZIP_CODE_MASK).address(PUBLIC_PLACE).state(STATE).build();
	}

	private BrazilianZipCodeResponseDTO createBrazilianZipCodeResponseDTO() {
		return BrazilianZipCodeResponseDTO.builder().cep(ZIP_CODE_MASK)
				.logradouro(PUBLIC_PLACE).uf(UF).build();
	}

}

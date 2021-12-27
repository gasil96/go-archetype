package ${package};

import ${package}.clients.dtos.BrazilianZipCodeResponseDTO;
import ${package}.dtos.InfoAddressDTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * TODO - Converter Test, later delete this comment.
 * */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BrazilianZipCodeResponseDTOToInfoAddressDTOTest {

	private static final String UF = "PA";
	private static final String LOGRADOURO = "Augusto Montenegro";
	private static final String COMPLEMENTO = "Lado B";
	private static final String CEP = "66820000";
	private static final String BAIRRO = "Tenoné";
	private static final String LOCALIDADE = "Belém";
	private static final String PARA = "Pará";

	@Autowired
	private ModelMapper mapper;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getCurrentDateFormatted() {
		BrazilianZipCodeResponseDTO dto = createBrazilianZipCode();
		InfoAddressDTO result = mapper.map(dto, InfoAddressDTO.class);

		assertEquals(LOGRADOURO.concat(", ").concat(COMPLEMENTO), result.getAddress());
		assertEquals(CEP, result.getZipCode());
		assertEquals(LOCALIDADE, result.getCity());
		assertEquals(PARA, result.getState());
	}

	private BrazilianZipCodeResponseDTO createBrazilianZipCode() {
		return BrazilianZipCodeResponseDTO.builder()
				.uf(UF)
				.logradouro(LOGRADOURO)
				.bairro(BAIRRO)
				.cep(CEP)
				.complemento(COMPLEMENTO)
				.localidade(LOCALIDADE)
				.build();
	}

}

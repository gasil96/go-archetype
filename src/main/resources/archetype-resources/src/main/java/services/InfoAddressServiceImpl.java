package ${package}.services;

import ${package}.clients.BrazilianZipCodeClient;
import ${package}.clients.dtos.BrazilianZipCodeResponseDTO;
import ${package}.dtos.InfoAddressDTO;
import ${package}.exceptions.BusinessException;
import ${package}.constants.ErroCodes;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO - This class must be removed if it is not going to be used in this microsservice, later delete this comment.
 * */
@Slf4j
@Service
public class InfoAddressServiceImpl implements InfoAddressService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private BrazilianZipCodeClient brazilianZipCodeClient;

	public InfoAddressDTO getInfoAddressBrazilian(String zipCode) {
		BrazilianZipCodeResponseDTO response;

		try {
			response = brazilianZipCodeClient.getInfos(zipCode);
		} catch (Exception e) {
			log.error("InfoAddressServiceImpl:InfoAddressServiceImpl(zipCode: {}) - error: Failed in client", zipCode, e);
			throw new BusinessException(ErroCodes.FEIGN_FAILED.getMessage());
		}
		InfoAddressDTO result = modelMapper.map(response, InfoAddressDTO.class);

		log.debug("InfoAddressServiceImpl:InfoAddressServiceImpl(zipCode: {}) - output: {}", zipCode, result);
		return result;
	}
}

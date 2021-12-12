package ${package}.services;

import ${package}.clients.BrazilianZipCodeClient;
import ${package}.clients.dtos.BrazilianZipCodeResponseDTO;
import ${package}.dtos.InfoAddressDTO;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InfoAddressServiceImpl implements InfoAddressService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private BrazilianZipCodeClient brazilianZipCodeClient;

	@Override
	public InfoAddressDTO getInfoAddress(String zipCode) {
		BrazilianZipCodeResponseDTO response = null;

		try {
			response = brazilianZipCodeClient.getInfos(zipCode);
		} catch (FeignException e) {
			log.error("InfoAddressServiceImpl:InfoAddressServiceImpl({}) - error: Failed in client", zipCode, e);
		}
		InfoAddressDTO result = modelMapper.map(response, InfoAddressDTO.class);

		log.debug("InfoAddressServiceImpl:InfoAddressServiceImpl({}) - output: {}", zipCode, result);
		return result;
	}
}

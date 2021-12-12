package ${package}.clients;

import ${package}.clients.dtos.BrazilianZipCodeResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * TODO - Example interface for clients of integrations
 * TODO - This class must be removed if it is not going to be used in this microsservice, later delete this comment
 * */
@FeignClient(name = "${integrations.viacep.name}", url = "${integrations.viacep.url}")
public interface BrazilianZipCodeClient {

	@GetMapping("/ws/{cep}/json/")
	BrazilianZipCodeResponseDTO getInfos(@PathVariable("cep") String zipCode);

}

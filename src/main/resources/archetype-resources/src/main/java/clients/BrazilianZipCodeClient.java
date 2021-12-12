package ${package}.clients;

import ${package}.clients.dtos.BrazilianZipCodeResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${integrations.viacep.name}", url = "${integrations.viacep.url}")
public interface BrazilianZipCodeClient {

	@GetMapping("/ws/{cep}/json/")
	BrazilianZipCodeResponseDTO getInfos(@PathVariable("cep") String zipCode);

}

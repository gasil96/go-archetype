package ${package}.controllers;

import ${package}.dtos.InfoAddressDTO;
import ${package}.services.InfoAddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/zip-code/")
public class BrazilianZipCodeController {

	@Autowired
	private InfoAddressService infoAddressService;

	@GetMapping("/address/{zipCode}")
	public ResponseEntity<InfoAddressDTO> getInfoAddress(@PathVariable("zipCode") String zipCode) {
		InfoAddressDTO result = infoAddressService.getInfoAddress(zipCode);

		log.debug("BraziliamZipCodeController.getInfoAddress(zipCode: {}) - output: {}", zipCode, result);
		return ResponseEntity.ok().body(result);
	}

}

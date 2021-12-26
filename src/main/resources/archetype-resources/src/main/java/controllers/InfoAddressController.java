package ${package}.controllers;

import ${package}.dtos.InfoAddressDTO;
import ${package}.services.InfoAddressService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO - Example class for controller (ever use swagger annotations).
 * TODO - This class must be removed if it is not going to be used in this microsservice, later delete this comment
 * */
@Tag(name = "Adresses", description = "Access to address information")
@Slf4j
@RestController
@RequestMapping("/address/")
public class InfoAddressController {

	@Autowired
	private InfoAddressService infoAddressService;

	@Operation(summary = "getInfoAddress - Brazilian")
	@GetMapping("/v1/info/{zipCode}")
	public ResponseEntity<InfoAddressDTO> getInfoAddressBrazilian(@PathVariable("zipCode") String zipCode) {
		InfoAddressDTO result = infoAddressService.getInfoAddressBrazilian(zipCode);

		log.debug("InfoAddressController.getInfoAddress(zipCode: {}) - output: {}", zipCode, result);
		return ResponseEntity.ok().body(result);
	}

}

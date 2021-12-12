package ${package}.configurations;

import ${package}.converters.BrazilianZipCodeResponseDTOToInfoAddressDTO;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	/**
	 * TODO - Add here ever new custom converter for model mapper, later delete this comment
	 * */
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.addConverter(new BrazilianZipCodeResponseDTOToInfoAddressDTO());
		return modelMapper;
	}

}
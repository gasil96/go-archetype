package ${package}.converters;

import ${package}.clients.dtos.BrazilianZipCodeResponseDTO;
import ${package}.constants.ApplicationConstants;
import ${package}.constants.BrazilianUF;
import ${package}.dtos.InfoAddressDTO;
import org.apache.commons.lang3.StringUtils;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

/**
 * TODO - Example class custom converters for model mapper.
 * TODO - This class must be removed if it is not going to be used in this microsservice, later delete this comment
 * */
public class BrazilianZipCodeResponseDTOToInfoAddressDTO implements Converter<BrazilianZipCodeResponseDTO, InfoAddressDTO> {

	@Override
	public InfoAddressDTO convert(MappingContext<BrazilianZipCodeResponseDTO, InfoAddressDTO> context) {
		BrazilianZipCodeResponseDTO source = context.getSource();
		InfoAddressDTO target = new InfoAddressDTO();

		target.setAddress(String.format(ApplicationConstants.ADDRESS_FULL_INFO, source.getLogradouro(),
				StringUtils.isNotBlank(source.getComplemento()) ? source.getComplemento() : StringUtils.EMPTY));
		target.setCep(source.getCep());
		target.setCity(source.getLocalidade());
		target.setState(BrazilianUF.fromUf(source.getUf()).getState());

		return target;
	}

}

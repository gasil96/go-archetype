package ${package}.services;

import ${package}.dtos.InfoAddressDTO;

/**
 * TODO - Example interface for service implamentations.
 * TODO - This class must be removed if it is not going to be used in this microsservice, later delete this comment
 * */
public interface InfoAddressService {

	InfoAddressDTO getInfoAddress(String zipCode);

}

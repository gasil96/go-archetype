package ${package}.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * TODO - Example class for DTO (ever use lombok annotations).
 * TODO - This class must be removed if it is not going to be used in this microsservice, later delete this comment
 * */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InfoAddressDTO implements Serializable {

	private String cep;
	private String address;
	private String city;
	private String state;

}

package ${package}.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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

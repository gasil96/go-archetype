package ${package}.clients.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * TODO - Example for dtos clients
 * TODO - This class must be removed if it is not going to be used in this microsservice, later delete this comment
 * */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BrazilianZipCodeResponseDTO implements Serializable {

	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;

}

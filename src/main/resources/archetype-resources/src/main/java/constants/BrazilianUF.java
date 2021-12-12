package ${package}.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * TODO - Example class for DTO (ever use lombok annotations).
 * TODO - This class must be removed if it is not going to be used in this microsservice, later delete this comment
 * */
@Getter
@AllArgsConstructor
public enum BrazilianUF {

	AM("Amazonas", "AM", "Manaus"),
	AL("Alagoas", "AL", "Maceió"),
	AC("Acre", "AC", "Rio Branco"),
	AP("Amapá", "AP", "Macapá"),
	BA("Bahia", "BA", "Salvador"),
	PA("Pará", "PA", "Belém"),
	MT("Mato Grosso", "MT", "Cuiabá"),
	MG("Minas Gerais", "MG", "Belo Horizonte"),
	MS("Mato Grosso do Sul", "MS", "Campo Grande"),
	GO("Goiás", "GO", "Goiânia"),
	MA("Maranhão", "MA", "São Luís"),
	RS("Rio Grande do Sul", "RS", "Porto Alegre"),
	TO("Tocantins", "TO", "Palmas"),
	PI("Piauí", "PI", "Teresina"),
	SP("São Paulo", "SP", "São Paulo"),
	RO("Rondônia", "RO", "Porto Velho"),
	RR("Roraima", "RR", "Boa Vista"),
	PR("Paraná", "PR", "Curitiba"),
	CE("Ceará", "CE", "Fortaleza"),
	PE("Pernambuco", "PE", "Recife"),
	SC("Santa Catarina", "SC", "Florianópolis"),
	PB("Paraíba", "PB", "João Pessoa"),
	RN("Rio Grande do Norte", "RN", "Natal"),
	ES("Espírito Santo", "ES", "Vitória"),
	RJ("Rio de Janeiro", "RJ", "Rio de Janeiro"),
	SE("Sergipe", "SE", "Aracaju"),
	DF("Distrito Federal", "DF", "Brasília");

	private final String state;
	private final String uf;
	private final String capital;

	public static BrazilianUF fromUf(final String uf) {
		for (final BrazilianUF brazilianUf : BrazilianUF.values()) {
			if (brazilianUf.uf.equalsIgnoreCase(uf)) {
				return brazilianUf;
			}
		}

		throw new IllegalArgumentException(ErroCodes.UF_NOT_VALID.getMessage());
	}

}
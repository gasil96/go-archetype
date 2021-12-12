package ${package}.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErroCodesConstants {

	FEIGN_FAILED("Failed to access recourse with feing client.");

	private final String message;
}

package ${package}.configurations.handler;

import ${package}.constants.ErroCodes;
import ${package}.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * TODO - Class for custom exceptions hadnler (add a new method every time you create a custom exception), later delete this comment
 * */
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex) {
		ExceptionResponseBody body = new ExceptionResponseBody(HttpStatus.INTERNAL_SERVER_ERROR.toString(),
				ErroCodes.INTERNAL_SERVER_ERROR.getMessage(), ex.getMessage());

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public final ResponseEntity<Object> handleAllExceptions(IllegalArgumentException ex) {
		ExceptionResponseBody body = new ExceptionResponseBody(HttpStatus.BAD_REQUEST.toString(), ErroCodes.INTERNAL_SERVER_ERROR.getMessage(),
				ex.getMessage());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
	}

	@ExceptionHandler(BusinessException.class)
	public final ResponseEntity<Object> handleBusinessException(BusinessException ex) {
		ExceptionResponseBody body = new ExceptionResponseBody(HttpStatus.BAD_REQUEST.toString(), ErroCodes.INTERNAL_SERVER_ERROR.getMessage(),
				ex.getMessage());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
	}

}

package ${package}.exceptions;

import java.io.Serializable;

/**
 * TODO - Example class for custom exceptions, later delete this comment
 * */
public class BusinessException extends RuntimeException implements Serializable {

	public BusinessException(String msg) {
		super(msg);
	}

}

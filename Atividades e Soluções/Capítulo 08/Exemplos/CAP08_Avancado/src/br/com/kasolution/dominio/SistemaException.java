package br.com.kasolution.dominio;

public class SistemaException extends Exception {

	public SistemaException() {
		super();
	}

	public SistemaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SistemaException(String message, Throwable cause) {
		super(message, cause);
	}

	public SistemaException(String message) {
		super(message);
	}

	public SistemaException(Throwable cause) {
		super(cause);
	}
	
}

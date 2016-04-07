package goeuro.app;

public class AplicationException extends Exception {

	private static final long serialVersionUID = 1L;

	public AplicationException() {
		super();
	}

	public AplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public AplicationException(String message) {
		super(message);
	}

	public AplicationException(Throwable cause) {
		super(cause);
	}

}

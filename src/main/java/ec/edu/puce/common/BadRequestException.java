package ec.edu.puce.common;

public class BadRequestException extends ApiException {
	private static final long serialVersionUID = 1L;

	public BadRequestException(String message) {
		super(message);
	}
}


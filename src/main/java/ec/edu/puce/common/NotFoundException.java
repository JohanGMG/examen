package ec.edu.puce.common;

public class NotFoundException extends ApiException {
	private static final long serialVersionUID = 1L;

	public NotFoundException(String message) {
		super(message);
	}
}


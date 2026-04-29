package ca.vetClinic.domain.exception;

public class NotFoundException extends RuntimeException {
	public NotFoundException(String message) {
		super(message + " has not been found");
	}
}

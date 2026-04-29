package ca.vetClinic.domain.exception;

public class UserNameNotFoundException extends RuntimeException {
	public UserNameNotFoundException(String message) {

		super("The " + message + " has not been found");
	}
}

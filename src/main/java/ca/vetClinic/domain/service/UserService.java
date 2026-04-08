package ca.vetClinic.domain.service;

import ca.vetClinic.domain.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
	List<User> findAll();

	User findById(int theId);

	User save(User theEmployee);

	void deleteById(UUID id);
}

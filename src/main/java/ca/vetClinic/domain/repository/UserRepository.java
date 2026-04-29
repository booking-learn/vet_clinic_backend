package ca.vetClinic.domain.repository;

import ca.vetClinic.domain.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
	List<User> findAll();

	User findById(UUID id);
	Optional<User> findByEmail(String email);
	void save(User user);

	void delete(UUID id);
}

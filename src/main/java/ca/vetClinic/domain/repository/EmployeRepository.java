package ca.vetClinic.domain.repository;

import ca.vetClinic.domain.model.Employe;
import ca.vetClinic.domain.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeRepository {
	List<Employe> findAll();

	Employe findById(UUID id);

	Optional<Employe> findByEmail(String email);
	void save(Employe employe);

	void delete(UUID id);
}

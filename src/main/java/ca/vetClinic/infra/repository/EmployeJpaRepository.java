package ca.vetClinic.infra.repository;

import ca.vetClinic.domain.model.Employe;
import ca.vetClinic.infra.entity.EmployeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EmployeJpaRepository extends JpaRepository<EmployeEntity, UUID> {
	Optional<EmployeEntity> findByEmail(String email);
}

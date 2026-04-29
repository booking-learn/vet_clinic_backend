package ca.vetClinic.infra.repository;

import ca.vetClinic.domain.exception.NotFoundException;
import ca.vetClinic.domain.model.Employe;
import ca.vetClinic.domain.repository.EmployeRepository;
import ca.vetClinic.infra.mapper.EmployeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class EmployeRepositoryImpl implements EmployeRepository {
	EmployeJpaRepository jpaRepository;
	EmployeMapper mapper;

	@Override
	public List<Employe> findAll() {
		return jpaRepository.findAll().stream().map(mapper::toDomain).toList();
	}

	@Override
	public Employe findById(UUID id) {
		return jpaRepository.findById(id).map(mapper::toDomain).orElseThrow(() -> new NotFoundException("id"));
	}

	@Override
	public Optional<Employe> findByEmail(String email) {
		return jpaRepository.findByEmail(email).map(mapper::toDomain);
	}

	@Override
	public void save(Employe employe) {
		jpaRepository.save(mapper.toEntity(employe));
	}

	@Override
	public void delete(UUID id) {
		jpaRepository.deleteById(id);
	}
}

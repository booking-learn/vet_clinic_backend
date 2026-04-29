package ca.vetClinic.infra.mapper;

import ca.vetClinic.domain.model.Employe;
import ca.vetClinic.infra.entity.EmployeEntity;
import ca.vetClinic.infra.security.UserPrincipal;
import org.mapstruct.Mapper;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface EmployeMapper {
	Employe toDomain(EmployeEntity employeEntity);
	EmployeEntity toEntity(Employe employe);
	UserPrincipal toUserInformation(Optional<Employe> employe);
}

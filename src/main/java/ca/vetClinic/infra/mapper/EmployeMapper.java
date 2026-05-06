package ca.vetClinic.infra.mapper;

import ca.vetClinic.domain.model.Employe;
import ca.vetClinic.infra.entity.EmployeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeMapper {
	Employe toDomain(EmployeEntity employeEntity);
	EmployeEntity toEntity(Employe employe);
}

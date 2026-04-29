package ca.vetClinic.infra.mapper;

import ca.vetClinic.domain.model.User;
import ca.vetClinic.infra.entity.UserEntity;
import ca.vetClinic.infra.security.UserPrincipal;
import org.mapstruct.Mapper;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface UserMapper {
	User toDomain(UserEntity entity);
	UserEntity toEntity(User user);
	UserPrincipal toUserInformation(Optional<User> user);
}

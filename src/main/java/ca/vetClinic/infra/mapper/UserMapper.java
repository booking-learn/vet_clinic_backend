package ca.vetClinic.infra.mapper;

import ca.vetClinic.domain.model.User;
import ca.vetClinic.infra.entity.UserEntity;

public class UserMapper {

	public UserEntity toUserEntity(User user) {
		UserEntity userEntity = new UserEntity();
		userEntity.setId(user.getId());
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userEntity.setEmail(user.getEmail());
		userEntity.setPassword(user.getPassword());
		userEntity.setPhoneNumber(user.getPhoneNumber());
		userEntity.setUserCreatedAt(user.getUserCreatedAt());
		return userEntity;
	}
}

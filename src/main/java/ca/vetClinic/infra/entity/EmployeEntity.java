package ca.vetClinic.infra.entity;

import ca.vetClinic.domain.model.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "employee")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role", discriminatorType = DiscriminatorType.STRING)
public class EmployeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;
	private String phoneNumber;

	public EmployeEntity() {
	}

	public EmployeEntity(String firstName, String lastName, String email, String password, Role role,
			String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.role = role;
		this.phoneNumber = phoneNumber;
	}

}
package ca.vetClinic.infra.entity;

import ca.vetClinic.domain.model.EmployeRole;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("STAFF")
public class StaffMemberEntity extends EmployeEntity {

	@Enumerated(EnumType.STRING)
	private EmployeRole role;

	public StaffMemberEntity() {
	}

	public StaffMemberEntity(String firstName, String lastName, String email, EmployeRole role) {
		super(firstName, lastName, email);
		this.role = role;
	}

	public EmployeRole getRole() {
		return role;
	}
	public void setRole(EmployeRole role) {
		this.role = role;
	}
}
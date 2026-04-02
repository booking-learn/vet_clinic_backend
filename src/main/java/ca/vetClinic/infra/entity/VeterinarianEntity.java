package ca.vetClinic.infra.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("VETERINARIAN")
public class VeterinarianEntity extends EmployeEntity {

	private String specialty;

	public VeterinarianEntity() {
	}

	public VeterinarianEntity(String firstName, String lastName, String email, String specialty) {
		super(firstName, lastName, email);
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
}
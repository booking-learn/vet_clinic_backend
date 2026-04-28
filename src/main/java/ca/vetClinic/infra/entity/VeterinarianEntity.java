package ca.vetClinic.infra.entity;

import ca.vetClinic.domain.model.EmployeRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@DiscriminatorValue("VETERINARIAN")
public class VeterinarianEntity extends EmployeEntity {

	private String specialty;


	public VeterinarianEntity() {
	}


    public VeterinarianEntity(String firstName, String lastName, String email,String password, EmployeRole role , String specialty) {
		super(firstName, lastName, email,password,role);
		this.specialty = specialty;
	}

}
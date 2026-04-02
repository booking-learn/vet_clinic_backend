package ca.vetClinic.infra.entity;

import ca.vetClinic.domain.model.CareService;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "careOffering")
public class CareOffering {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String name;
	private String description;
	private double price;
	private int duration;
	@Enumerated(EnumType.STRING)
	private CareService careService;

	public CareOffering() {
	}
	public CareOffering(String name, String description, double price, int duration, CareService careService) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.duration = duration;
		this.careService = careService;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public CareService getCareService() {
		return careService;
	}

	public void setCareService(CareService careService) {
		this.careService = careService;
	}
}

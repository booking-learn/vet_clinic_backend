package ca.vetClinic.infra.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "service")
public class ServiceEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
	private String name;
	private String description;
	private double price;
	private int duration;

	public ServiceEntity() {
	}
	public ServiceEntity(String name, String description, double price, int duration) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.duration = duration;
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

}

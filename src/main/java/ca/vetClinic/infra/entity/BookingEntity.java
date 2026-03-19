package ca.vetClinic.infra.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "booking")
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID userId;
    private UUID serviceId;
    private UUID petId;
    private UUID veterinarianId;
    private UUID timeSlotId;
    private String status;
    private String notes;
    @CreationTimestamp
    private Instant bookingCreatedAt;

    public BookingEntity(UUID userId, UUID serviceId, UUID petId, UUID timeSlotId, String status, String notes) {
        this.userId = userId;
        this.serviceId = serviceId;
        this.petId = petId;
        this.timeSlotId = timeSlotId;
        this.status = status;
        this.notes = notes;
    }

    public UUID getTimeSlotId() {
        return timeSlotId;
    }

    public String getStatus() {
        return status;
    }

    public Instant getBookingCreatedAt() {
        return bookingCreatedAt;
    }

    public void setBookingCreatedAt(Instant bookingCreatedAt) {
        this.bookingCreatedAt = bookingCreatedAt;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTimeSlotId(UUID timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    public UUID getServiceId() {
        return serviceId;
    }

    public UUID getPetId() {
        return petId;
    }

    public UUID getVeterinarianId() {
        return veterinarianId;
    }

    public void setVeterinarianId(UUID veterinarianId) {
        this.veterinarianId = veterinarianId;
    }

    public void setPetId(UUID petId) {
        this.petId = petId;
    }

    public void setServiceId(UUID serviceId) {
        this.serviceId = serviceId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public BookingEntity() {
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
}

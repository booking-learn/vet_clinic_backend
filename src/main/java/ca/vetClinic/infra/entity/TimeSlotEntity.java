package ca.vetClinic.infra.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "timeSlot")
public class TimeSlotEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID vetenerianId;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDate date;
    private boolean available;

    public TimeSlotEntity() {}
    public TimeSlotEntity(UUID vetenerianId, LocalTime startTime, LocalTime endTime, LocalDate date, boolean available)
    {
        this.vetenerianId = vetenerianId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public UUID getVetenerianId() {
        return vetenerianId;
    }

    public void setVetenerianId(UUID vetenerianId) {
        this.vetenerianId = vetenerianId;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
}

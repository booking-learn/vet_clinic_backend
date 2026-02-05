package ca.reservation_backend.domain;

public class salle {
	private int id;
	private String name;
	private int capacity;
	private boolean available;

	public salle(int id, String name, int capacity) {
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.available = false;
	}

	public void makeAvailable() {
		this.available = true;
	}
	public void makeUnavailable() {
		this.available = false;
	}
	public boolean isAvailable() {
		return this.available;
	}
	public int getId() {
		return id;
	}
}

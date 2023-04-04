package model;

import java.util.ArrayList;
import java.util.List;

public class Room {
	
	private Integer bedNumbers;
	private Integer floorNumber;
	private Integer id;
	private List<Patient>patients;
	private Integer roomNumber;

	public Room() {
		patients = new ArrayList();
	}
	
	public Integer getBedNumbers() {
		return bedNumbers;
	}
	public void addPatient(Patient patient) {
		System.out.println("entro");
		patients.add(patient);
	}
	public void setBedNumbers(Integer bedNumbers) {
		this.bedNumbers = bedNumbers;
	}
	public Integer getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(Integer floorNumber) {
		this.floorNumber = floorNumber;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	@Override
	public String toString() {
		return "Room [bedNumbers=" + bedNumbers + ", floorNumber=" + floorNumber + ", id=" + id + ", patients="
				+ patients.toString() + ", roomNumber=" + roomNumber + "]";
	}
	
	
}

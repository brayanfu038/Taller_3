package model;

import java.util.ArrayList;
import java.util.List;

public class Colsanitas {
	
	List<Room>rooms;
	
	public Colsanitas() {
		rooms = new ArrayList();
	}
	public void createRoom(Integer id,Integer floorNumber,Integer roomNumber,Integer bedNumber) {
		Room room = new Room();
		room.setId(id);
		room.setFloorNumber(floorNumber);
		room.setRoomNumber(roomNumber);
		room.setBedNumbers(bedNumber);
		rooms.add(room);
	}
	public void createPatient(Integer roomNumber,String namePatient,String lastNamePatient,String contactPhoneNumber) {
		Patient patient = new Patient();
		patient.setFirstName(namePatient);
		patient.setLastName(lastNamePatient);
		patient.setContactPhoneNumber(contactPhoneNumber);
		patient.setStatus(new Status(true));
		this.addPatientToRoom(patient, roomNumber);
	}
	public void addPatientToRoom(Patient patient,Integer roomNumber) {
		for (int i = 0; i < rooms.size(); i++) {
			if(rooms.get(i).getRoomNumber().equals(roomNumber)) {
				rooms.get(i).addPatient(patient);
			}
		}
	}
	public void show() {
		for (int i = 0; i < rooms.size(); i++) {
			System.out.println(rooms.get(i).toString());
		}
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
}

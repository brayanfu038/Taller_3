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
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
}

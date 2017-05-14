package CW;

import java.io.Serializable;

public class Room implements Serializable{
	private String roomCusName;
	private int roomNum;
	
	public Room(){ 		
	}	
	public Room(String roomCusName, int roomNum) {
		super();
		this.roomCusName = roomCusName;
		this.roomNum = roomNum;
	}
	public String getRoomCusName() {
		return roomCusName;
	}
	public void setRoomCusName(String roomCusName) {
		this.roomCusName = roomCusName;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

}

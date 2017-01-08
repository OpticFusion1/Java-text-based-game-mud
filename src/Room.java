import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Room {
	String name;
	//String desc;
	String[] NextRooms;
	String[] DoorsOpenStatus;
  Teacher teacher;
	Student student;
	Book b;
	Key k;
	Sfinxen sfix;




	/**
	 * The directions one could walk in a room.
	 */
	public enum Direction {NORTH, SOUTH, EAST, WEST};

	//=======================================
	//Contstructors
	//=======================================

	/**
	 * Constucts a new Room.
	 */
	public Room() {
	this.NextRooms = new String[4];
	this.DoorsOpenStatus = new String[4];
	}

	/**
	 * Constucts a new Room.
	 * @param name The room name
	 */
	public Room(String name){
	this.name= name;
	this.NextRooms = new String[4];
	this.DoorsOpenStatus = new String[4];

	}



//=============================
//Getters
//=============================

	/**
	 * @return the name of the room
	 */
	public String getName(){
		return this.name;
	}

	/**
	 * @return the array of the names of the rooms to the north, east, south and west of the room.
	 */
	public String[] getNextRooms(){
		return this.NextRooms;
	}

	/**
	 * @return the teacher in this room.
	 */
	public Teacher getTeacher(){
		return this.teacher;
	}


	/**
	 * @return the sfinx.
	 */
	public Sfinxen returnSfinxen(){
		return this.sfix;
	}

	/**
	 * @return the student in this room.
	 */
	public Student getStudent(){
		return this.student;
	}


	/**
	 * @return the book of this room.
	 */
	public Book returnBookFromroom(){
		return this.b;
	}

	/**
	 * @return the key of this room.
	 */
	public Key getKeyfromRoom(){
		return this.k;
	}

	/**
	 * @return array of open status for the doors leading from this room.
	 */
	public String[] getDoorOpenStatus(){
		return this.DoorsOpenStatus;
	}


	/**
	 * Gets the open status for a door in a specific direction.
	 * @param dir the direction of the door we want to check the status for.
	 * @return the string represention of the open status; "True" (open) or "False" (closed)
	 */
	public String getDoorStatus(Direction dir){
		switch(dir){
			case NORTH:
			return this.DoorsOpenStatus[0];

			case EAST:
			return this.DoorsOpenStatus[1];

			case SOUTH:
			return this.DoorsOpenStatus[2];

			default:
			return this.DoorsOpenStatus[3];
			}
	}


//=================================
//Setters
//=================================

/**
 * Sets the name of the room to a specific string.
 * @param s the string that is the new name of the room.
 */
	public void setName(String s){
		this.name = s;
	}

	public void removeKey(){
		this.k = null;
	}

	public void removeBook(){
		this.b = null;
	}

// For test purposes
	public void setNextRooms(String s1, String s2, String s3, String s4){
		this.NextRooms[0] =s1;
		this.NextRooms[1] =s2;
		this.NextRooms[2] =s3;
		this.NextRooms[3] =s4;
	}

	public void setOpenStatuses(String s1, String s2, String s3, String s4){
		this.DoorsOpenStatus[0] =s1;
		this.DoorsOpenStatus[1] =s2;
		this.DoorsOpenStatus[2] =s3;
		this.DoorsOpenStatus[3] =s4;
	}

/*
	public void setRoom(String desc){
		this.desc= desc;
	}*/


	/**
	 * Sets the open status for a specific door
	 * @param dir the direction of the door thas is to be set to a new status
	 * @param status the new status, "True" or "False"
	 */
	public void setDoorStatus(Direction dir, String status){
		assert(status.equals("True") || status.equals("False"));
		switch(dir){
			case NORTH:
			this.DoorsOpenStatus[0] = status;

			case EAST:
			this.DoorsOpenStatus[1] = status;

			case SOUTH:
			this.DoorsOpenStatus[2] = status;

			default:
			this.DoorsOpenStatus[3] = status;
			}
	}
//==========================================




	/**
	 * Gets the Room name of a specific direction
	 * @param dir the direction of the room.
	 * @return the room name as a string.
	 */
	public String getDirection(Direction dir){
		switch(dir){
			case NORTH:
			return this.getNorth();

			case EAST:
			return this.getEast();

			case SOUTH:
			return this.getSouth();

			default:
			return this.getWest();
			}
	}

//================================

	/**
	 * @return the room name of the room to the north of this room.
	 */
	public String getNorth(){
		return this.NextRooms[0];
	}

	/**
	 * @return the room name of the room to the east of this room.
	 */
	public String getEast(){
		return this.NextRooms[1];
	}

	/**
	 * @return the room name of the room to the south of this room.
	 */
	public String getSouth(){
		return this.NextRooms[2];
	}

	/**
	 * @return the room name of the room to the west of this room.
	 */
	public String getWest(){
			return this.NextRooms[3];
	}

//======================================

	/**
	 * Checks the open status for a specific door and returns the boolean representation.
	 * @param dir the direction of the room that is checked.
	 * @return the boolan representation of the room open status.
	 */
	public boolean isOpen(Direction dir){
		if (getDoorStatus(dir).equals("True")){
			return true;
		}
		else {
			return false;
		}
	}


//=============================================


	/**
	 * Gets the rooms next to the current room, and uppdate array NextRooms.
	 * If there is no room in one direction, the room name will be represented by "X"
	 * @param arr array of strings that describes a room.
	 */
	public void updateNextRooms(String[] arr){
		this.NextRooms[0] = arr[1];
		this.NextRooms[1] = arr [2];
		this.NextRooms[2] = arr [3];
		this.NextRooms[3]= arr [4];
	}

	/**
	 * Gets the open status for the rooms next to this room, and updates array DoorsOpenStatus.
	 * @param arr array of strings that describes a room.
	 */
	public void updateDoorStatus(String[] arr){
		this.DoorsOpenStatus[0] = arr[5];
		this.DoorsOpenStatus[1] = arr [6];
		this.DoorsOpenStatus[2] = arr [7];
		this.DoorsOpenStatus[3]= arr [8];

	}


//======================================
//Adding things
//=======================================

	/**
	 * Adds a ranomized teacher to the room.
	 * There i
	 * @param arr array of strings that describes a room.
	 */
	public void addRandomTeacher(ArrayList<Teacher> arr){
		Random randomGenerator = new Random();
		int probability = 70;
		int randomInt= randomGenerator.nextInt(100);
		if (randomInt< probability){
			int index = randomGenerator.nextInt(arr.size());
			this.teacher = arr.get(index);
		}
		else {
			this.teacher = new Teacher("X");
		}
	}


	/**
	 * Adds a student to the room.
	 * @param s the student to be added.
		 */
	public void addRandomStudent(Student s){
		this.student = s;
	}
	/**
	 * Adds a key to the room.
	 * @param k the key to be added.
		 */
	public void addRandomKey(Key k){
		this.k = k;
	}

	/**
	 * Adds the sfinx to the room.
	 * @param sf the sfinx.
		 */
	public void addSfinxen(Sfinxen sf){
		this.sfix = sf;
	}

	/**
	 * Adds a book to the room.
	 * @param b the key to be added.
		 */
	public void addBookToRoom(Book b){
		this.b = b;
	}

//=========================================

	/**
	 * Check if the sfinx is in the room.
	 * @return true if sfinx is in the room.
		 */
	public boolean hasSfinxen(){
		if(!this.sfix.returnSfinxName().equals("null")){
			return true;
		}
		return false;
	}


	/**
	 * Gets the oposite direction.
	 * @param dir the direction to get the opposite direction from
	 */
	private Direction oppositeDirection(Direction dir){
		switch(dir){
			case NORTH:
			return Direction.SOUTH;

			case EAST:
			return Direction.WEST;

			case SOUTH:
			return Direction.NORTH;

			default:
			return Direction.EAST;
			}
	}


	/**
	 * Unlocks a door by changing its open status.
	 * @param dir the direction of the door that will we unlocked
	 * @param nextRoom the room on the other side of the door.
	 */
	public void unlockDoor(Direction dir, Room nextRoom){
	//this.changeOpenstatus(direction, nextRoom);
	this.setDoorStatus(dir, "True");
	nextRoom.setDoorStatus(oppositeDirection(dir), "True");
	}


	/**
	 * Prints out the people and things in the room.
	 */
	public void printRoomInfo() {
	System.out.println("\nYou look around in the room.");
	if (!this.getTeacher().getTeachername().equals("X")) {
		System.out.println("There is a teacher in the room: " + this.getTeacher().getTeachername());
	}
	else {
	System.out.println("There is no techer in the room");
	}
	System.out.println("There is a student in the room: " + this.getStudent().getName() + "\n");

	if (this.getKeyfromRoom() != null) {
		System.out.println("There is a key in this room!");
	}
	if (this.returnBookFromroom() != null) {
		System.out.println("There is a book in this room! The book is: " + this.returnBookFromroom().returnName());
	}

	}




	public static void main(String [] args) throws IOException {








	}


}

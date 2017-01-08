
import java.io.IOException;
import java.util.ArrayList;


public class RoomTests {

Room room;
Room room2;

  private RoomTests(){
    this.room = new Room();
    this.room2 = new Room();

  }

  private void setUp(){
    this.room.setNextRooms("Rum 1", "Rum 2", "X", "Rum 3");
    this.room.setOpenStatuses("True", "False", "X", "True");

    this.room2.setNextRooms("Rum 1", "Rum 2", "X", "Rum 3");
    this.room2.setOpenStatuses("True", "False", "X", "False");
  }


  private void newRoomTest(){
    Room room1 = new Room();
    assert(!room1.equals(null));
    Room room2 = new Room("NiceRoom");
    assert(!room2.equals(null));
    assert((room2.getName()).equals("NiceRoom"));
  }

  private void getNextTest(){
    assert((this.room.getNextRooms()[0]).equals("Rum 1"));
  }

  private void getDoorStatusTest(){
    assert((this.room.getDoorStatus(Room.Direction.NORTH)).equals("True"));
    assert((this.room.getDoorStatus(Room.Direction.EAST)).equals("False"));
    assert((this.room.getDoorStatus(Room.Direction.SOUTH)).equals("X"));
    assert((this.room.getDoorStatus(Room.Direction.WEST)).equals("True"));

  }

  private void setDoorStatusTest(){
    this.room.setDoorStatus(Room.Direction.NORTH, "False");
    assert((this.room.getDoorStatus(Room.Direction.NORTH)).equals("False"));

    this.room.setDoorStatus(Room.Direction.EAST, "True");
    assert((this.room.getDoorStatus(Room.Direction.EAST)).equals("True"));

    this.room.setDoorStatus(Room.Direction.SOUTH, "True");
    assert((this.room.getDoorStatus(Room.Direction.SOUTH)).equals("True"));

    this.room.setDoorStatus(Room.Direction.WEST, "False");
    assert((this.room.getDoorStatus(Room.Direction.WEST)).equals("False"));

    this.setUp();

  }


  private void getDirectionTest(){
    assert(this.room.getDirection(Room.Direction.NORTH).equals("Rum 1"));
    assert(this.room.getDirection(Room.Direction.EAST).equals("Rum 2"));
    assert(this.room.getDirection(Room.Direction.SOUTH).equals("X"));
    assert(this.room.getDirection(Room.Direction.WEST).equals("Rum 3"));
  }

  private void isOpenTest(){
    assert(this.room.isOpen(Room.Direction.NORTH));
    assert(!this.room.isOpen(Room.Direction.EAST));
    assert(!this.room.isOpen(Room.Direction.SOUTH));
    assert(this.room.isOpen(Room.Direction.WEST));
  }

  private void updateNextRoomsTest(){
    String[] arr = {"Other stuff", "Nytt1", "Nytt2", "Nytt3", "Nytt4"};
    this.room.updateNextRooms(arr);
    assert(this.room.NextRooms[0].equals("Nytt1"));
    this.setUp();
  }


  private void updateDoorStatusTest(){
    String[] arr = {"", "", "", "", "", "False", "True", "True", "False"};
    this.room.updateDoorStatus(arr);
    assert(this.room.DoorsOpenStatus[0].equals("False"));
    assert(this.room.DoorsOpenStatus[3].equals("False"));

    this.setUp();
  }

  private void addTeacherTest(){
    ArrayList<Teacher> arr = new ArrayList<Teacher>();
    Teacher t1= new Teacher("t1");
    Teacher t2= new Teacher("t2");
    arr.add(t1);
    arr.add(t2);
    this.room.addRandomTeacher(arr);
    String name = this.room.getTeacher().getTeachername();
    assert(name.equals("t1") || name.equals("t2") || name.equals("X"));
  }

  private void addStudentTest(){
    Student s = new Student("Kiddo");
    this.room.addRandomStudent(s);
    String name = this.room.student.getName();
    assert(name.equals("Kiddo"));
  }

  private void unlockDoorTest(){
    this.room.unlockDoor(Room.Direction.EAST, this.room2);
    assert(this.room.isOpen(Room.Direction.EAST));
    assert(this.room2.isOpen(Room.Direction.WEST));
  }


  public static void main(String [] args) throws IOException {
    RoomTests test= new RoomTests();
    test.setUp();
    test.newRoomTest();
    test.getNextTest();
    test.getDoorStatusTest();
    test.setDoorStatusTest();
    test.getDirectionTest();
    test.isOpenTest();
    test.updateNextRoomsTest();
    test.updateDoorStatusTest();
    test.addTeacherTest();
    test.addStudentTest();
    test.unlockDoorTest();





  	}

}


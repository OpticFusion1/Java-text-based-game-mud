import java.io.IOException;
import java.util.Scanner;


public class Main {

//borrowed from http://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java
	public static boolean isNumber(String str){
	    for (char c : str.toCharArray()){
	        if (!Character.isDigit(c)) return false;
	    }
	    return true;
	}

	private boolean quitAction(){

	  do
	    {
		  Scanner scan = new Scanner (System.in);
	      System.out.println("Do you want to quit? [Y/N]");
	      String input = scan.nextLine();
	      if (input.equals("Y")) return true;
	      if (input.equals("N")) return false;

	      System.out.println("Only Y or N are valid answers!");
	    }while(true);

	}


	private void printOptions(){
		System.out.println("\nList of game command: ");
	    System.out.println("Check (room) ");
		System.out.println("Talk: ");
		System.out.println("Trade: ");
		System.out.println("Go: ");
		System.out.println("Unlock: ");
		System.out.println("Print (inventory) : ");
		System.out.println("Pick up: ");
		System.out.println("Drop: ");
		System.out.println("Courses: ");
		System.out.println("Graduate: ");
		System.out.println("Exit: ");
	}

private void go(Avatar avatar) throws IOException {
	Scanner scanGo = new Scanner (System.in);
	System.out.println("What direction?");
	String answer = scanGo.nextLine();
	String upp = answer.toUpperCase();
	while(!(upp.equals("NORTH") || upp.equals("EAST") || upp.equals("SOUTH") || upp.equals("WEST"))){
	System.out.println("Try again");
	answer = scanGo.nextLine();
	upp = answer.toUpperCase();
	}
	Room.Direction dir = Room.Direction.valueOf(answer.toUpperCase());
	avatar.changeRoom(dir);
	System.out.println("\nYou are now in room: " + avatar.returnCurrentRoom().getName() + "\n");
}

private void unlock(Avatar avatar) throws IOException {
	Scanner scan = new Scanner (System.in);
	System.out.println("In what direction is the door that you want to unlock?");
	String answer = scan.nextLine();
	String upp = answer.toUpperCase();
	while(!(upp.equals("NORTH") || upp.equals("EAST") || upp.equals("SOUTH") || upp.equals("WEST"))){
	System.out.println("Try again");
	answer = scan.nextLine();
	upp = answer.toUpperCase();
	}
  Room.Direction dir = Room.Direction.valueOf(answer.toUpperCase());
	avatar.unlockDoor(dir);


}


private void talk(Avatar avatar) {
	Scanner scanTalk = new Scanner (System.in);
	System.out.println("Who do you want to talk to?");
	String name = scanTalk.nextLine();
	Student s = avatar.returnCurrentRoom().getStudent();
	Teacher t = avatar.returnCurrentRoom().getTeacher();
	String teacherName = t.getTeachername();
	String studentName = s.getName();

	if (name.equals(teacherName)){
		avatar.getQuestionfromTeacher();
	}
	else if (name.equals(studentName)){
		avatar.talkTootherStudent(avatar, s);
	}
	else {
		System.out.println("There is no person in the room with that name.");
	}
 //scanTalk.close();
}



private void trade(Avatar avatar) {
	Scanner scanTrade = new Scanner (System.in);
	System.out.println("Who do you want to trade with");
	String name = scanTrade.nextLine();
	Student student = avatar.returnCurrentRoom().getStudent();

  if (name.equals(student.getName())){
	 avatar.interactWithStudent(avatar, student);
	}
	else {
		System.out.println("There is no person in the room with that name.");
	}

}

private PlayerItem chooseObject(Avatar avatar){
	Scanner scan= new Scanner (System.in);
	System.out.println("What kind of item do you want to pick up?");
	String item = scan.nextLine();
	PlayerItem it = null;
	if ((item.toUpperCase()).equals("KEY")){
	//System.out.println("Im here!");
	 it = avatar.currentRoom.getKeyfromRoom();
	 //System.out.println(it.returnKeyName());

	}
	else if ((item.toUpperCase()).equals("BOOK"))	{
	 it = avatar.currentRoom.returnBookFromroom();
	}
	return it;
}

private void pickUp(Avatar avatar) {
	PlayerItem item = chooseObject(avatar);
	if (item != null) {
	 avatar.getInventory().addObject(item);
	 	if (item instanceof Key){
			avatar.currentRoom.removeKey();
		}
		else{
			avatar.currentRoom.removeBook();
		}
	}
	else {
		System.out.println("There is no such item in the room.");
	}
}


private void drop(Avatar avatar) {
	if (avatar.getInventory().isEmpy()){
		System.out.println("There is no item to drop.");
	}
	else{
		avatar.getInventory().printBag();
		Scanner scan = new Scanner (System.in);
		System.out.println("Choose item to drop: (0 for cancel)");
		String line = scan.nextLine();
		while (!isNumber(line)){
			System.out.println("Not a number.");
			line = scan.nextLine();
			}
			int index = Integer.parseInt(line);
			while (index > avatar.getInventory().bagSize() || index < 0){
				System.out.println("Try again");
				line = scan.nextLine();
				while (!isNumber(line)){
					System.out.println("Not a number.");
					line = scan.nextLine();
					}
				index = Integer.parseInt(line);
			}
			if (index == 0){
			}
			else {
				avatar.getInventory().dropItem(index-1);
			}
		}
}

	private void eventLoop(Avatar avatar) throws IOException {
		boolean cont = false;
		Scanner scan = new Scanner (System.in);
		while(!cont){
			printOptions();
			String readline = scan.nextLine().toUpperCase();
			switch(readline){
			case "CHECK":
				avatar.currentRoom.printRoomInfo();
				break;
			case "TALK":
				this.talk(avatar);
				break;
			case "TRADE":
			  this.trade(avatar);
				break;
			case "GO":
				this.go(avatar);
				break;
			case "UNLOCK":
				this.unlock(avatar);
				break;
			case "PRINT":
				avatar.getInventory().printBag();
				break;
			case "PICK UP":
				this.pickUp(avatar);
				break;
			case "DROP":
				this.drop(avatar);
				break;
			case "COURSES":
				avatar.printAllCourseInfo();
				break;
				//Maybe not here
			case "GRADUATE":
				avatar.graduate();
				break;
			case "EXIT":
				cont = quitAction();
				break;
			default:
				System.out.println("\nInvalid command");
			}

		}
		System.out.println("Bye! ");



	}




public static void main(String [] args) throws IOException {
	String teacherFile = "C:/Users/Maria/Documents/Java/maria.lindqvist.9430/Inlupp4/teacher.text";
	String bookFile ="C:/Users/Maria/Documents/Java/maria.lindqvist.9430/Inlupp4/book.text";
	String roomFile = "C:/Users/Maria/Documents/Java/maria.lindqvist.9430/Inlupp4/sr.text";
	World w = new World();
	w.createWorld(teacherFile, bookFile, roomFile);
	Room r = w.getRoomFromName("Room 1357");
	Avatar a = new Avatar(r,w);
	Main main = new Main();
	main.eventLoop(a);

}

}

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;
import junit.framework.*;
import static org.junit.Assert.*;

public class Testavatar {
	String teacherFile = "../Javaparttwo/teacher.text";
	String bookFile ="../Javaparttwo/book.text";
	String roomFile = "../Javaparttwo/sr.text";
	
  @Test
public void testCurrentRoom() throws IOException{
	Room r = new Room();
	r.setName("Room 5");
	Avatar a = new Avatar(); 
	a.setNewRoom(r); 
	assertNotNull(r); 
	assertNotNull(a); 
	assertEquals(a.currentRoom, r); 
	assertEquals(a.currentRoom, r); 
}
  
@Test 
public void testavator() throws IOException{
	
	World w = new World();
	w.createWorld(teacherFile, bookFile, roomFile);
	Room r = w.getRoomFromName("Room 1357");
	Avatar a = new Avatar(r,w);
	assertNotNull(w); 
	assertNotNull(a);
}
	
/* Test unFinished course */
public void testUnfinishedCourse() throws IOException{
	World w = new World();
	w.createWorld(teacherFile, bookFile, roomFile);
	Room r = w.getRoomFromName("Room 1357");
	Avatar a = new Avatar(r,w);
	assertNotNull(w); 
	assertNotNull(a);
	
	Book b = new Book("Book1", "Jone", 2009, 1); 
	Book b2 = new Book("Book2", "David",2016, 12); 
	Book b3 = new Book("Book3", "Jone", 2015, 10); 
	Book b4 = new Book("Book4", "Jone", 2014, 7); 
	/*create course 
	 * */
	Course c = new Course("Biology",b, 10,"Which is reptile ?", "Cat", "Dog", "Snake"); 
	Course c2 = new Course("Math", b2, 6," 2 +2 ?", "1", "10", "4"); 
	Course c3 = new Course("Physics",b3, 8,"What is velocity ?", "Motion", "acceleration", "The speed of something in a given direction."); 
	Course c4 = new Course("Computer",b, 5,"Which mouse?", "rat", "Screen", "An input device"); 
	/* Test the course are null or not*/
	assertNotNull(c); 
	assertNotNull(c2); 
	assertNotNull(c3); 
	assertNotNull(c4); 
	/* add the course to the unfinished course*/
	a.unfinishedCourse.add(c); 
	a.unfinishedCourse.add(c2); 
	a.unfinishedCourse.add(c3); 
	a.unfinishedCourse.add(c4); 
	 /*check the number of unfinished course size*/
	assertEquals(a.unfinishedCourse.size(), 4);  
	/*check the return course is not null*/
	assertNotNull(a.returnunFinishedCourse(c));
	/*check the course existed in unfinished course list*/
	assertTrue(a.isCourseExistedInunFinishedCourse(c));
}
	
	 /* create course for finished course list
	 * */
	
@Test 
public void testFinishedCourse() throws IOException{
	World w = new World();
	w.createWorld(teacherFile, bookFile, roomFile);
	Room r = w.getRoomFromName("Room 1357");
	Avatar a = new Avatar(r,w);
	assertNotNull(w); 
	assertNotNull(a);
	Book b10 = new Book("Book10", "Jone", 2009, 1); 
	Book b11 = new Book("Boo11", "David",2016, 12); 
	Book b12 = new Book("Book12", "Jone", 2015, 10); 
	Book b14 = new Book("Book14", "Jone", 2014, 7); 
	
	Course c10 = new Course("Sport",b10, 10,"what is footboll ?", "Cat", "Dog", "Game"); 
	Course c11 = new Course("News", b11, 6,"what is BBC?", "number", "10", "News media"); 
	Course c12 = new Course("Music",b12, 8,"What is Kizomba ?", "Motion", "acceleration", "Danse"); 
	Course c14 = new Course("Medicen",b14, 5,"Which lung?", "rat", "Screen", "respiratory organ"); 
	
	/*add course to finished course list*/
	
	a.finishedCourse.add(c10);  
	a.finishedCourse.add(c11);  
	a.finishedCourse.add(c12);  
	a.finishedCourse.add(c14);  
	 /*check the number of finished course size*/
	assertEquals(a.finishedCourse.size(), 4);  
	/*check the return course is not null*/
	assertNotNull(a.returnFinishedCourse(c10)); 
	/*check the course existed in unfinished course list*/
	assertNotNull(a.returnFinishedCourse(c10));
	/*check the course existed in unfinished course list*/
	assertEquals(a.calcualteHp(), 29); 
	
}



	
	
}

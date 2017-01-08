import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;
import junit.framework.*;
import static org.junit.Assert.*;

public class Testcourse {
	
	/*create world from text file*/
	Book b = new Book("Book1", "Jone", 2009, 1); 
	Book b2 = new Book("Book2", "David",2016, 12); 
	Book b3 = new Book("Book3", "Jone", 2015, 10); 
	Book b4 = new Book("Book4", "Jone", 2014, 7); 
	
	/*create course for test*/
	Course c = new Course("Biology",b, 10,"Which is reptile ?", "Cat", "Dog", "Snake");   
	Course c2 = new Course("Math", b2, 6," 2 +2 ?", "1", "10", "4"); 
	Course c3 = new Course("Physics",b3, 8,"What is velocity ?", "Motion", "acceleration", "The speed of something in a given direction."); 
	Course c4 = new Course("Computer",b4, 5,"Which mouse?", "rat", "Screen", "An input device"); 
	

@Test 
/* Test object is not null*/
public void TestcourseObject(){
	
	assertNotNull(c);
	assertNotNull(c2); 
	assertNotNull(c3); 
	assertNotNull(c4); 
	
}	

@Test 
/* To check question and answer*/
public void TestcourseQuestion(){
	
	assertEquals(c.returnAlternativeOne(), "Cat"); 
	assertEquals(c.returnAlternativeTwo(), "Dog"); 
	assertEquals(c.returnAnswer(), "Snake"); 
	assertNotSame(c.returnAnswer(), ""); 
}
@Test
	
	/*test the course book*/
public void Testcoursebook(){
	assertEquals(c4.returncourseBook(), b4); 
	assertNotSame(c4.returncourseBook(), b); 
}
	
@Test 	
	/*test course name*/
public void testCourseName(){
	assertEquals(c3.returnCourseName(), "Physics"); 
	assertNotSame(c4.returnCourseName(), "Physics"); 
	assertNotSame(c4.returnCourseName(), " "); 
}
@Test
/*Test course Hp*/

public void testCourseHp(){
	assertEquals(c2.returnHp(), 6); 
	assertNotSame(c4.returnHp(), 6); 	

}
	
}

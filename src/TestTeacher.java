import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.io.IOException;
import org.junit.Test;
import junit.framework.*;
import static org.junit.Assert.*;


public class TestTeacher {
	Book b = new Book("Book1", "Jone", 2009, 1); 
	Book b2 = new Book("Book2", "David",2016, 12); 
	Course c = new Course("Biology",b, 10,"Which is reptile ?", "Cat", "Dog", "Snake"); 
	Course c2 = new Course("Math", b2, 6," 2 +2 ?", "1", "10", "4"); 
	Teacher one = new Teacher("David", c); 
	Teacher two = new Teacher("Sam", c2); 
	
@Test 
/*test object equality*/
public void testEquality(){
	assertNotSame(one, two); 
	assertEquals(one, one); 
}

@Test 
/*test teacher name*/
public void testTeachername(){
	assertEquals(one.name, "David"); 
	assertNotSame(one.name, "Sam"); 
}

@Test 
/*test which course the teacher teach*/
public void Testteacercourse(){
	assertEquals(one.course, c); 
	assertNotSame(two.course, c); 
}
	
}

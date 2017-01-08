import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;
import junit.framework.*;
import static org.junit.Assert.*;

public class TestBook {
	/* create book objects for test*/
	Book b = new Book("Book1", "Jone", 2009, 1); 
	Book b2 = new Book("Book2", "David",2016, 12); 
@Test 

/*Test book name */
public void TestBook(){
	
	assertEquals(b.bookName,"Book1"); 
	assertNotSame(b.bookName,"");
}
@Test 
/*Test book author */
public void testauthor(){
	assertEquals(b.author,"Jone"); 
	assertNotSame(b.author,"");
}

@Test 
/*Test book year of published */
public void testYearOfpublish(){
	assertEquals(b.yearofPublished,2009); 
	assertNotSame(b.yearofPublished,2007);
	assertNotSame(b.yearofPublished,"");
}
	

@Test 
/*Test book edition */
public void testEdition(){
	assertEquals(b.edition,1);
	assertNotSame(b.edition,15);
	assertNotSame(b.edition, "");
}
	

@Test 
/*Test equality of object*/
public void testObjectEquality(){
	assertEquals(b,b);
    assertNotSame(b, b2);
    assertNotSame(b, ""); 
    assertNotSame("", b2);
}	
		

@Test 
/*Test check if two instance of object are the same or not*/
public void testinstanceOfobject(){
	assertTrue(b instanceof Book);  
}	
	

}

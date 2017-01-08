import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;
import junit.framework.*;
import static org.junit.Assert.*;

public class Testbag {
	Bag bag = new Bag(); 
	String teacherFile = "../Javaparttwo/teacher.text";
	String bookFile ="../Javaparttwo/book.text";
	String roomFile = "../Javaparttwo/sr.text";
	
@Test 
/*add object to bag */
public void addObjectBag() throws IOException {
	World w = new World();
	w.createWorld(teacherFile, bookFile, roomFile);
	Book b = w.randomBook(); 
	Key k = w.randomcreateKey(); 
	bag.addObject(b); 
	bag.addObject(k); 
	assertEquals(bag.size, 3); 
	
}

@Test 
/*drop object from bag*/
public void dropObject() throws IOException{
	World w = new World();
	w.createWorld(teacherFile, bookFile, roomFile);
	Book b = w.randomBook(); 
	Key k = w.randomcreateKey(); 
	bag.addObject(b); 
	bag.addObject(k); 
	assertEquals(bag.size, 3);
    assertFalse(bag.isEmpy()); 
    assertFalse(bag.BagIsFull()); 
    bag.dropObject(b); 
    bag.dropObject(k); 
    assertEquals(bag.size, 0);
    assertTrue(bag.isEmpy());  // check the bug is empty  after drop 
    assertFalse(bag.BagIsFull());  // check the bug is full
}


@Test 
/*drop any any key from bag*/
public void dropAnykey() throws IOException{
	World w = new World();
	w.createWorld(teacherFile, bookFile, roomFile);
	Book b = w.randomBook(); 
	Key k1 = w.randomcreateKey(); 
	Key k2 = w.randomcreateKey(); 
	Key k3 = w.randomcreateKey(); 
	Key k4 = w.randomcreateKey(); 
	bag.addObject(b);  // add book
	bag.addObject(k1); // add key 
	bag.addObject(k2); 
	bag.addObject(k3); 
	bag.addObject(k4); 
	
	assertEquals(bag.size, 6);
    assertFalse(bag.isEmpy()); 
    bag.dropAnyKey();  // drop any key 
    bag.dropAnyKey(); // drop key 
    bag.dropAnyKey(); 
    assertEquals(bag.size, 3);
    assertFalse(bag.isEmpy()); 
}

@Test 
/*drop object type in the bag*/
public void checkObjectType() throws IOException{
	World w = new World();
	w.createWorld(teacherFile, bookFile, roomFile);
	Book b = w.randomBook(); 
	Book b2 = w.randomBook();
	Book b3 = w.randomBook(); 
	Key k1 = w.randomcreateKey(); 
	Key k2 = w.randomcreateKey(); 
	Key k3 = w.randomcreateKey(); 
	Key k4 = w.randomcreateKey(); 
	bag.addObject(b);
	bag.addObject(b2);
	bag.addObject(b3); // add book
	bag.addObject(k1); // add key 
	bag.addObject(k2); 
	bag.addObject(k3); 
	bag.addObject(k4); 
	assertEquals(bag.size, 10);
    assertFalse(bag.isEmpy()); 
    assertTrue(bag.BagIsFull());
    assertTrue(bag.returnIndexitem(0) instanceof Book);
    assertFalse(bag.returnIndexitem(0) instanceof Key);
    assertTrue(bag.returnIndexitem(4) instanceof Key);
    assertFalse(bag.returnIndexitem(4) instanceof Book);
}

}

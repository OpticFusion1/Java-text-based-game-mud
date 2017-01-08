import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;
import junit.framework.*;
import static org.junit.Assert.*;

public class TestKey {
Key k = new Key("keyone"); 
@Test
/*test the object is not null*/
public void tesNotNull(){
	assertNotNull(k); 

}
@Test 
/*test return key is the same or not the same*/
public void returnKey(){
	assertEquals(k.returnKeyName(), "keyone");
	assertNotSame(k.returnKeyName(), "one");
	assertNotSame(k.returnKeyName(), "");
}


@Test 
/*Test instance of the key */
public void checkInstance(){
	assertTrue(k instanceof Key); 
}
	
	
}

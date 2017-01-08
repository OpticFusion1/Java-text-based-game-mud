import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import java.io.IOException;
import org.junit.Test;
import junit.framework.*;
import static org.junit.Assert.*;


public class TestSfinxen {
	Sfinxen sfinxen = new Sfinxen("sfinxen"); 
@Test 
/* test the object is not null*/
public void testsfinxen(){

assertNotNull(sfinxen); 
}


@Test
/* test expected name is equal to actual name*/
public void testsfinxenName(){

	assertEquals(sfinxen.name, "sfinxen");
	assertNotSame(sfinxen.name, "");
}


}

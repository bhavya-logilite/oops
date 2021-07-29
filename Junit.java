package junti_tester;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junit {

	@Test
	public void testSetup() {
	      String str= "I am done with Junit setup";
	      assertEquals("I am done with Junit setup",str);
	}

}

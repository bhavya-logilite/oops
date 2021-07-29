package junti_tester;
import static org.junit.Assert.*;
import org.junit.Test;
public class Junit4AssertionTest{
	   @Test
    	public  void testAssert(){
		   String str1 = "Junit";
		   String str2= "Junit";
		   String str3= "Test";
		   String str4= "Test";
		   String str5= null;
		   int var1 = 1;
		   int var2 = 2;
		   int arr1[] = {1,2,3};
		   int arr2[] = {1,2,3};
		   assertEquals(str1,str2);
		   assertSame(str3,str4);
		   assertNotSame(str4,str5);
		   assertNotNull(str1);
		   assertNull(str5);
		   assertTrue(var1 < var2);
		   assertArrayEquals(arr1, arr2);
	   }
    	
}

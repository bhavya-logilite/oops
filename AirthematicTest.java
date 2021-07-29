package junti_tester;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AirthematicTest {
	public String message = "bhavya";
	JUnitMessage1 junitMessage = new JUnitMessage1(message);
	@Test(expected = ArithmeticException.class)
	public void testJunitMessage(){

		System.out.println("Junit Message is printing ");
		junitMessage.printMessage();
	}
	@Test
	public void testJunitHiMessage(){ 
		message="Hi!" + message;
		System.out.println("Junit Message is printing ");
		assertEquals(message, junitMessage.printHiMessage());
	}		
}

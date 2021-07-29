package junti_tester;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class Parameters {
	private int num1;
	private int num2;
	private int expectedresult;
	private Airthematic arithematic;
	public Parameters(int num1, int num2, int expectedresult) {
	super();
	this.num1 = num1;
	this.num2 = num2;
	this.expectedresult = expectedresult;
	}
	@Before
	public void initialize() {
		arithematic = new Airthematic();
	}
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Objects[][] {{1,2,3},{11,22,33},
				{111,222,333},{10,9,19},{100,9,109}});
	}
	@Test
	public void testParameters() {
		System.out.println("Sum of number = :" + expectedresult);
		assertEquals(expectedresult, arithematic.sum(num1,num2));
	}
	
		
}



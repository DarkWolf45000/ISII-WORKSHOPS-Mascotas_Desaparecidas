package ec.edu.espol.workshops.second;

import static org.junit.Assert.*;

import org.junit.Test;
public class clienteTest {

	@Test
	public void test() {
		CarInsurance c = new CarInsurance(18, "m", false, true);
		int output = c.calculateInsurance();
		assertEquals(2000, output);
	}
	
	@Test
	public void segundoTest() {
		CarInsurance c = new CarInsurance(18, "F", false, true);
		int output = c.calculateInsurance();
		assertEquals(300, output);
	}
	
	@Test
	public void tercerTest() {
		CarInsurance c = new CarInsurance(50, "F", false, true);
		int output = c.calculateInsurance();
		assertEquals(200, output);
	}
}

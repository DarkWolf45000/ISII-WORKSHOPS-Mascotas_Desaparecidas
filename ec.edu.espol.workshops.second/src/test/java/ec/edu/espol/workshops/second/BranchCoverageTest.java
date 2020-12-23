  package ec.edu.espol.workshops.second;
import static org.junit.Assert.*;

import org.junit.Test;

public class BranchCoverageTest {

  @Test
  public void test_id_1() {
    CarInsurance c = new CarInsurance(90, "m", false, false);
    int output = c.calculateInsurance();
    assertEquals(-1, output);
  }
  
  @Test
  public void test_id_2() {
    CarInsurance c = new CarInsurance(30, "m", false, false);
    int output = c.calculateInsurance();
    assertEquals(-1, output);
  }
  
  @Test
  public void test_id_3() {
    CarInsurance c = new CarInsurance(20, "m", false, true);
    int output = c.calculateInsurance();
    assertEquals(2000, output);
  }
  
  @Test
  public void test_id_4() {
    CarInsurance c = new CarInsurance(20, "f", false, true);
    int output = c.calculateInsurance();
    assertEquals(300, output);
  }

}

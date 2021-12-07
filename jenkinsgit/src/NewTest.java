import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("This is Test1");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is After class");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is After class");
  }

}

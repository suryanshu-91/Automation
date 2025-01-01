package TestNg001;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test01 {
  @Test
  public void f() {
	  System.out.println("Test cases");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("2");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("3");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("4");
  }

}

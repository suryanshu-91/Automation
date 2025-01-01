package TestNg001;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test00 {
  @Test(dataProvider = "dp")
  public void Login (Integer n, String s) {
	  System.out.println("We right testcase");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("2");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("3");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("4");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("5");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("6");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("7");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("8");
  }

}

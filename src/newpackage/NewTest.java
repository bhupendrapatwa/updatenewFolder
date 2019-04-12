package newpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
WebDriver driver;
  @Test
  public void f() {
    driver.get("https://www.javatpoint.com/");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\609028160\\eclipse-workspace\\newUpdatedTestNG\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

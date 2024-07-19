package staragile.Assignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.TestNG.Demos.LoginOHRM;

public class Assign2_POC {
	WebDriver driver;
	LoginOHRM ohrm1;
  @Test
  public void login() 
  {
	  ohrm1.loginAdmin("admin", "admin123");
	  ohrm1.clickPIM();
	  ohrm1.clickAddBtn();
	  ohrm1.enterFirstname("Pujitha");
	  ohrm1.enterLastname("Nalubolu");
	  ohrm1.clickCeateLoginDetails();
	  ohrm1.enterUsername("puji");
	  ohrm1.enterPassword("Sweety22dec$");
	  ohrm1.enterConfirmpwd("Sweety22dec$");
	  ohrm1.clickSaveBtn();
	  ohrm1.Logout();
  }
  @BeforeTest
  public void beforeMethod()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  ohrm1=new LoginOHRM(driver);
	  
	  driver.close();
  }

}



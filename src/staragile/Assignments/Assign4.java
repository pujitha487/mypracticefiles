package staragile.Assignments;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign4 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		JavascriptExecutor js;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,550)", " ");
		
		// To validate the functionality of registration form
		// Enter Firstname
		driver.findElement(By.id("firstName")).sendKeys("Pujitha");
		// Enter Lastname
		driver.findElement(By.id("lastName")).sendKeys("Nalubolu");
		// Enter Email id
		driver.findElement(By.id("userEmail")).sendKeys("pujitha.sweety31@gmail.com");
		// Select the Radiobutton
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		
		//Enter Mobile Number
		driver.findElement(By.id("userNumber")).sendKeys("9703692811");
		// Enter Date of Birth
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement dplist=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select month=new Select(dplist);
		month.selectByVisibleText("July");
		Thread.sleep(2000);
		WebElement dplist1=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select year=new Select(dplist1);
		year.selectByValue("1991");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]")).click();
		// Enter Subjects
		js.executeScript("window.scrollBy(0,350)", " ");
		WebElement sub=driver.findElement(By.id("subjectsInput"));
		sub.sendKeys("e");
		sub.sendKeys(Keys.ENTER);
		sub.sendKeys("m");
		sub.sendKeys(Keys.ENTER);
		// Select radio buttons
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
		//Thread.sleep(2000);
		//WebElement picup=driver.findElement(By.id("uploadPicture"));
		js.executeScript("arguments[0].click()", driver.findElement(By.id("uploadPicture")));
	    Robot rbt=new Robot();
		//Thread.sleep(2000);
		for(int i=1;i<=8;i++)
		{
			
			Thread.sleep(2000);
			rbt.keyPress(KeyEvent.VK_TAB);
		}
		    Thread.sleep(2000);
		    rbt.keyPress(KeyEvent.VK_DOWN);
		    Thread.sleep(2000);
		    rbt.keyPress(KeyEvent.VK_ENTER);
		    
		    
		    Thread.sleep(2000);
		    rbt.keyPress(KeyEvent.VK_TAB);
		    for(int j=1;j<=8;j++)
		    {
		    	Thread.sleep(2000);
		    	rbt.keyPress(KeyEvent.VK_DOWN);	 
		    }
		        Thread.sleep(2000);
		     
		        rbt.keyPress(KeyEvent.VK_ENTER);
		 // Enter Current Address
		 driver.findElement(By.id("currentAddress")).sendKeys("Sathyavathi Nagar,Kovur");
		 js.executeScript("window.scrollBy(0,250)", " ");
		 //Enter State and City
		 WebElement state=driver.findElement(By.id("react-select-3-input"));
		 state.sendKeys("u");
		 state.sendKeys(Keys.ENTER);
		 WebElement city=driver.findElement(By.id("react-select-4-input"));
		 city.sendKeys("l");
		 city.sendKeys(Keys.ENTER);
		 driver.findElement(By.id("submit")).click();
		
		    


		 
		 driver.close();
		

	}

}

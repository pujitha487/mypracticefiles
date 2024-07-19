package staragile.Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assign5 {

	public static void main(String[] args) throws IOException {
	  WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://istqb.in/s");
      File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileHandler.copy(ss, new File("C:\\Users\\User\\Desktop\\ISTQB.jpeg"));
      
      driver.close();
	}

}






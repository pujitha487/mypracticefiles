package staragile.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Assign3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://staragile.melimu.com/login/index.php?id=1&code=Star%20Agile");
		driver.findElement(By.name("username")).sendKeys("pujitha.sweety31@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sweety22dec$");
		driver.findElement(By.id("loginbtn")).click();
		
		// Handle dropdown list
		Thread.sleep(2000);
		//WebElement dplist=//*
		int i=1;
		WebElement dplist=driver.findElement(By.id("mySingleSelect"));
		Select course=new Select(dplist);
		List<WebElement>courselist=course.getOptions();
		for(WebElement cl : courselist)
		{
			System.out.println(i +"."+cl.getText());
			i++;
		}
		
		driver.close();
		
		

	}

}

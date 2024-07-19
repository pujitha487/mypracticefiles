package staragile.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.rediff.com/");
		
		// Click on the specified link
		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.close();

	}

}

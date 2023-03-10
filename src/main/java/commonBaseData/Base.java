package commonBaseData;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 //WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 
		 
		 driver.get("https://www.rugartisan.com/");
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/butoon")).click();
		 //driver.findElement(By.xpath("//*[@id=\"action-allow-cookies\"]/button")).click();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}


package PDPSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import commonBaseData.Base;

public class Testing_the_payment extends Base{
	
	@Test
	public void Testing_the_payment_Test() throws InterruptedException {
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='SHOP THE COLLECTION']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='product-name']//a[@href='https://www.rugartisan.co.uk/handtufted-rectangle-purewool-jack.html']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='widthCmRug']")).sendKeys("400");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='lengthCmRug']")).sendKeys("450");
		
		Thread.sleep(3000);/*/
	}

}

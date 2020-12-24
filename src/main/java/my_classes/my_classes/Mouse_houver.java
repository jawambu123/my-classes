package my_classes.my_classes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mouse_houver {
@Test
	public void Mouse_houver() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\njewa\\eclipse-workspace\\my_classes\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		WebElement deals = driver.findElement(By.xpath("//*[@id=\"l5\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(deals).build().perform();
		Thread.sleep(3000);
		WebElement tv_deals= driver.findElement(By.xpath("//span[contains(text(),' TV Deals')]"));
		action.moveToElement(tv_deals).build().perform();
		Thread.sleep(3000);
		WebElement tv_home= driver.findElement(By.xpath("//span[contains(text(),'View all TV Deals for Business')]"));
		action.moveToElement(tv_home).build().perform();
		tv_home.click();
		//how to scroll up and  down;
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("scroll(0,200)");
		Thread.sleep(3000);
		js.executeScript("scroll(0,600)");
		Thread.sleep(3000);
		js.executeScript("scroll(0,800)");
		
		
		
		
		
		
	}

}

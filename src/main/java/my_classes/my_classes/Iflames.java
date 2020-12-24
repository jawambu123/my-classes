package my_classes.my_classes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iflames {
@Test
	public void Iflames() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\njewa\\eclipse-workspace\\my_classes\\drivers\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://docs.oracle.com/javase/8/docs/api/");
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		Driver.switchTo().frame(0);
		Driver.findElement(By.linkText("java.awt.color")).click();
		Thread.sleep(3000);
		
		Driver.switchTo().defaultContent();
		
		Driver.switchTo().frame("packageFrame");
		Driver.findElement(By.linkText("ICC_ColorSpace")).click();	
		
		
		
		
		
		
		

	}

}

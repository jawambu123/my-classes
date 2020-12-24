package my_classes.my_classes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_ups_alerts {

	@Test
	public void alertss_popups() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\njewa\\eclipse-workspace\\my_classes\\drivers\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(3000);
		
		System.out.println(Driver.switchTo().alert().getText());
		Driver.switchTo().alert().accept();		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

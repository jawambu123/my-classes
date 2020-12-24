package my_classes.my_classes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_downs {
@Test
	public void facebk_dropdown() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\njewa\\eclipse-workspace\\my_classes\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		WebElement month_dropdown = driver.findElement(By.xpath("//select [@id=\"month\"]"));
		Select month = new Select(month_dropdown);

		month.selectByValue("4");

		WebElement day_dropdown = driver.findElement(By.id("day"));
		Select day = new Select(day_dropdown);
		day.selectByValue("24");

		WebElement date_dd = driver.findElement(By.name("birthday_day"));
		Select date = new Select(date_dd);
		date.selectByValue("29");

		WebElement year_dd = driver.findElement(By.name("birthday_year"));
		Select year = new Select(year_dd);
		year.selectByValue("1968");

	}

}

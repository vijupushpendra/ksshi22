package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1 {
	@Test
	public void validLogin() throws InterruptedException 
	{  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");  
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		System.out.println("1");
	}
}

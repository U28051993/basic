package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.findElement(By.name("email")).sendKeys("y.shub.64@gmail.com");

	}

}
 
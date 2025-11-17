package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	public static void main(String[] args) {
		System.out.println("start");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		System.out.println("User Login Successfully");

		try {
			Thread.sleep(3000); // just for demo purposes (replace with WebDriverWait later)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='Admin']")).click();
		System.out.println("User clicked on Admin");

		try {
			Thread.sleep(3000); // just for demo purposes (replace with WebDriverWait later)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//button[text()=' Add ']")).click();

		System.out.println("User click on Add");

		try {
			Thread.sleep(3000); // just for demo purposes (replace with WebDriverWait later)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Select role = new Select(driver.findElement(By.className("oxd-select-text oxd-select-text--active")));
		role.selectByIndex(1);
		System.out.println("User select Admin");

	}
}

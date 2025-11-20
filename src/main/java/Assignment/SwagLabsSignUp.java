package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));

		System.out.println("---Start the Process---");

		driver.findElement(By.id("//input[@id='user-name']")).sendKeys(args);
		System.out.println("Username done");

		driver.findElement(By.id("//input[@id='password'])")).sendKeys(args);
		System.out.println("Password done");

		driver.findElement(By.id("//input[@id='login-button']")).click();
		System.out.println("User sign up succesfully");

		System.out.println("---Assignment Done---");

	}

}

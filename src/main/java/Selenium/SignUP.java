package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUP {

	public static void main(String[] args) {
		System.out.println();
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

		driver.findElement(By.linkText("New user? Signup")).click();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("name")).sendKeys("shubham");

		String email = "y.shub.64" + System.currentTimeMillis() + "@gmail.com";
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys("shubham");
		driver.findElement(By.className("form-check-input")).click();
		driver.findElement(By.id("gender1"));

		WebElement stateDropDown = driver.findElement(By.name("state"));
		Select state = new Select(stateDropDown);
		state.selectByIndex(2);

		Select hobbies = new Select(driver.findElement(By.id("hobbies")));
		hobbies.selectByContainsVisibleText("Playing");

		WebElement signupButton = driver.findElement(By.className("submit-btn"));
		if (signupButton.isEnabled()) {

			signupButton.click();
		} else {
			System.out.println("Failed");

		}

	}

}

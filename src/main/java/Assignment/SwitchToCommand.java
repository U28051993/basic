package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToCommand {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();
		System.out.println("Please find the alert text ---" + text);

		if (text.equals("I am a JS Alert"))

		{
			System.out.println("Text is verified");
		}

		else {

			System.out.println("Incorect_text");
		}

		alert.accept();

	}

}

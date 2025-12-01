package Class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCommand {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		String parent_window = driver.getWindowHandle();

		System.out.println("This is the parent window");

		List<WebElement> Social_button = driver
				.findElements(By.xpath("//div[@id='login_container']//div[@class='social-btns']//a"));
		for (WebElement ele : Social_button) {

			ele.click();

		}

	}

}

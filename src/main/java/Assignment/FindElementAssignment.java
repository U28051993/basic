package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementAssignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.findElement(By.linkText("New user? Signup")).click();
		int dropdown = driver.findElements(By.xpath("//select")).size();

		if (dropdown == 2) {

			System.out.println("Number of dropdown " + dropdown);

		} else {

			System.out.println("Not verified");
		}

		int radio_button = driver.findElements(By.xpath("//input[@type='radio']")).size();

		if (radio_button == 2) {

			System.out.println("Number of dropdown " + radio_button);

		} else {

			System.out.println("Not verified");
		}

		int checkbox = driver.findElements(By.xpath("//input[@type='checkbox']")).size();

		if (checkbox > 5) {

			System.out.println("Number of dropdown " + checkbox);

		} else {

			System.out.println("Not verified");
		}

		int state = driver.findElements(By.xpath("//select[@name='state']//option")).size();

		if (state > 5) {

			System.out.println("Number of dropdown " + state);

		} else {

			System.out.println("Not verified");
		}

		Select select = new Select(driver.findElement(By.xpath("//select[@id='state']")));

		List<WebElement> options = select.getOptions();

		boolean found = false;

		for (WebElement option : options) {

			if (option.getText().equals("Goa")) {

				found = true;
				break;
			}
		}

		if (found == true) {

			System.out.println("Goa is here");
		} else {

			System.out.println("Goa is not here");
		}

	}

}

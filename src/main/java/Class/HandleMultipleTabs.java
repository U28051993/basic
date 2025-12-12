package Class;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleTabs {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		List<WebElement> Social_button = driver
				.findElements(By.xpath("//div[@id='login_container']//div[@class='social-btns']//a"));

		System.out.println("Total Social Button " + Social_button.size());

		for (WebElement ele : Social_button) {

			ele.click();
		}

		Set<String> all_windows = driver.getWindowHandles();
		System.out.println(all_windows);
		
		

		List<String> all_windows_List = new ArrayList<String>(all_windows);
		driver.switchTo().window(all_windows_List.get(1));	

	}
}

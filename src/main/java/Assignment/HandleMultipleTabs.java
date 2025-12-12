package Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HandleMultipleTabs {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("https://freelance-learn-automation.vercel.app/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@email.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

		Actions action = new Actions(driver);
		WebElement manage = driver.findElement(By.xpath("//span[text()='Manage']"));

		action.moveToElement(manage).perform();

		Thread.sleep(2000);

		WebElement manage_menu = driver.findElement(By.xpath("//a[@href='/category/manage']"));
		action.moveToElement(manage_menu).click().perform();

		String parent_window = driver.getWindowHandle();

		System.out.println(parent_window);

		Set<String> category_window = driver.getWindowHandles();

		List<String> category_window_list = new ArrayList<String>(category_window);

		driver.switchTo().window(category_window_list.get(1));

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("//button[text()='Add New Category ']")).click();

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("shubham");
		alert.accept();

		driver.switchTo().window(parent_window);

		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();

		driver.findElement(By.linkText("New user? Signup")).click();

		List<WebElement> checkbox = driver.findElements(By.xpath("//label[normalize-space()='shubham']"));

		for (WebElement ele : checkbox) {

			String label = ele.getText();

			// if (ele.getText().equals("shubham")){

			if (label.equals("shubham")) {

				System.out.println("Found");
				break;
			}

			else {
				System.out.println("Not Found");
			}

		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300);");

		driver.findElement(By.xpath("//a[normalize-space(text())='Already a user? Login']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@email.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

		WebElement re_manage = driver.findElement(By.xpath("//span[text()='Manage']"));

		action.moveToElement(re_manage).perform();

		Thread.sleep(2000);

		WebElement re_manage_menu = driver.findElement(By.xpath("//a[@href='/category/manage']"));
		action.moveToElement(re_manage_menu).click().perform();

		Set<String> re_category_window = driver.getWindowHandles();
		List<String> re_category_window_list = new ArrayList<String>(re_category_window);

		driver.switchTo().window(re_category_window_list.get(1));
		driver.findElement(By.xpath("//button[text()='Delete ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'modal-content')]//button[contains(text(),'Delete')]"))
				.click();

		driver.switchTo().window(parent_window);

		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();

	}
}

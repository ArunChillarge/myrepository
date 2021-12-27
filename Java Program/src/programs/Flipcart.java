package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\java workspace\\Java Program\\path\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		
		WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics'"));
		
		Actions actions = new Actions(driver);
		
		Thread.sleep(3000);
		actions.moveToElement(electronics).build().perform();
		
		Thread.sleep(3000);
		actions.contextClick(electronics).build().perform();
		
		Thread.sleep(3000);
		actions.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
	}

}

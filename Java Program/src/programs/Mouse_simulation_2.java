package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_simulation_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\java workspace\\Java Program\\path\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//switching frame
		
		List<WebElement> allframElements = driver.findElements(By.tagName("iframe"));
		
		System.out.println("total frame available on webpage" + allframElements.size());
		
		
		for (int i = 0; i < allframElements.size(); i++) {
			
			driver.switchTo().frame(i);
if (driver.findElement(By.id("draggable")).isDisplayed()
		&&driver.findElement(By.id("droppable")).isDisplayed()) {

	Thread.sleep(3000);
	Actions actions = new Actions(driver);
	actions.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();;
	System.out.println("element found in " +(i+1)+ "frame");


}

		}
	}

}

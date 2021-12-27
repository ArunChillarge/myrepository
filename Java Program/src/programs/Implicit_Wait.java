package programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\java workspace\\Java Program\\path\\driver\\chromedriver (2).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//introducing implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("how stuff works");
				
		//how to handle auto suggestion
		WebElement allsuggestion = driver.findElement(By.xpath("//div[@class='aajZCb']//div[2]//ul[1]"));
		List<WebElement> allsearch = allsuggestion.findElements(By.xpath("//li"));
		System.out.println("total auto suggeston displayed:"+ allsearch.size());
		
		for (int i = 0; i < allsearch.size(); i++) {
			String allsuggestionlist = allsearch.get(i).getText();
			
			String finlresult = "how stuff works quiz";
			
			if (allsuggestionlist.equalsIgnoreCase(finlresult)) {
				allsearch.get(i).click();
				System.out.println("you have clicked on :"+ finlresult);
				break;
				
			}
					}
			
	}

}

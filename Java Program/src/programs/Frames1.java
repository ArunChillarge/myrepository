package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\java workspace\\Java Program\\path\\driver\\chromedriver.exe");
		
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://paytm.com/");
		Thread.sleep(3000);
		
		//find out total number of frames present on web page
		
		int totalframes = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("totaframes");
		
		//go inside each frame and check which frame has our elements
		
		for (int i = 0; i < totalframes; i++) {

			driver.switchTo().frame(i);
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[contains(Text(),'watch video')]")).click();
	
			
		}
		
		
	}

}

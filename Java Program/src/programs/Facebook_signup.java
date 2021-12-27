package programs;

import org.openqa.selenium.By; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook_signup {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\java workspace\\Eclipse 2019\\Java Program\\Driver\\chromedriver (3).exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com/"); 
	
		
		driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']")).click();
		
		driver.quit();
	}

}

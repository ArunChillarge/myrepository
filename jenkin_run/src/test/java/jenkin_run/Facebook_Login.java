package jenkin_run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\java workspace\\Eclipse 2021\\jenkin_run\\Driver\\chromedriver (3).exe");
		
		 
		WebDriver driver = new ChromeDriver();


		driver.get("http://www.facebook.com/"); 


		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("XYZ");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id]")).click();
		
		

	}

}

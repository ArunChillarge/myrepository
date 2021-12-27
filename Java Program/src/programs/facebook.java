package programs;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","E:\\java workspace\\Eclipse 2019\\Java Program\\Driver\\chromedriver (3).exe");
		
		 
		WebDriver driver = new ChromeDriver();


		driver.get("http://www.facebook.com/"); 


		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("XYZ");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id]")).click();
		
		
		/*Select sell =new Select(driver.findElement(By.xpath("//select[@id='SELECTOR_7']")));
		sell.selectByIndex(3);
		Select sell2 = new Select(driver.findElement(By.xpath("//select[@id='SELECTOR_8']")));
		sell2.selectByIndex(3);
		*/




			}

		}

	



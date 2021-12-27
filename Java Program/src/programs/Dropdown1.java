package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\java workspace\\Java Program\\path\\driver\\chromedriver (2).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/"); 
		driver.findElement(By.xpath("//*[@data-testid = 'open-registration-form-button']")).click();
		Thread.sleep(3000);
	/*	
		//1st way - not recommend but mostly used in industry 
		List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total dropdown values are :-"+ birthmonth.size());
		birthmonth.get(1).click();//August
		Thread.sleep(3000);
		System.out.println(birthmonth.get(1).isEnabled());
		//driver.quit();
		
		//2nd way -recommended
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		//will use select class constructor
		Select month = new Select(bm); //parameterized constructor
		//select by visible text 
		month.selectByVisibleText("Apr");
		//select by value
		Thread.sleep(3000);
		month.selectByValue("12");
		//select by index
		Thread.sleep(3000);
		month.selectByIndex(10);
		//get current selected from url
		Thread.sleep(3000);
		System.out.println(month.getFirstSelectedOption().getText());
		//driver.quit();
		*/
		//3rd way - will store all dropdown values in a list
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bm); //parameterized constructor
		List<WebElement> dropdown = month.getOptions();
		System.out.println("Total dropdown values are :-" + dropdown.size());;
		for (int i = 0; i < dropdown.size(); i++) {
			String dropdownvalue = dropdown.get(i).getText();
			if (dropdownvalue.equalsIgnoreCase("Aug")) {
				dropdown.get(i).click();
			}
			}
		//driver.quit();		
	
		//4th way - checking the dropdown is supporting multiple selection or not
		//System.out.println(month.isMultiple());//false
		month.selectByIndex(2);
		month.selectByIndex(5);
		month.selectByVisibleText("Dec");
		//deselecting the selected value
		//month.deselectByIndex(2);
		//month.deselectByIndex(5);
		//month.deselectByVisibleText("Dec");
		//month.deselectAll();
		//driver.quit();
	
		//5th way sendkeys 
		bm.sendKeys("Feb");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='month']"));
		driver.quit();
		
	}

}

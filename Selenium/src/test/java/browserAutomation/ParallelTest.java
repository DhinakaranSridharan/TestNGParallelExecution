package browserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class ParallelTest {

	
	@Test
	@Parameters({"TestName"})
	public void launchApplication0(String TestName) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		WebElement searchField = driver.findElement(By.xpath("//textarea[@title='Search']"));
		searchField.sendKeys(TestName);
		//To view value has been entered into the application or not
		Thread.sleep(2000);
		driver.quit();
	
	}
	
	
	@Test
	@Parameters({"TestName"})
	public void launchApplication1(String TestName) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		WebElement searchField = driver.findElement(By.xpath("//textarea[@title='Search']"));
		searchField.sendKeys(TestName);
		//To view value has been entered into the application or not
		Thread.sleep(2000);
		driver.quit();
	
	}
	
	@Test
	@Parameters({"TestName"})
	public void launchApplication2(String TestName)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		WebElement searchField = driver.findElement(By.xpath("//textarea[@title='Search']"));
		//To view value has been entered into the application or not
		searchField.sendKeys(TestName);
		driver.quit();
	
	}
	@Test
	@Parameters({"TestName"})
	public void launchApplication3(String TestName) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		WebElement searchField = driver.findElement(By.xpath("//textarea[@title='Search']"));
		searchField.sendKeys(TestName);
		//To view value has been entered into the application or not
		Thread.sleep(2000);
		driver.quit();
	
	}

}

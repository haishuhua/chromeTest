package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenChrome {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/xiaoyi/Downloads/selenium/chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new InternetExplorerDriver();
		driver.get("http://dev.workstride.net/login");
		System.out.println(driver.getTitle());
		// WebElement submit = driver.findElement(By.id("lst-ib"));
	     //   submit.submit();
		/*WebElement inputElement = driver.findElement(By.id("lst-ib"));
		inputElement.clear();
		inputElement.sendKeys("Times"); 
		WebElement submit = driver.findElement(By.id("btnK"));
		submit.submit();*/
		
		WebElement companyId = driver.findElement(By.id("companyId"));
		companyId.sendKeys("477"); 
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("support@workstride.com"); 
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("demo9494"); 
		WebElement submit = driver.findElement(By.id("loginSubmit"));
		submit.submit();
		
		
		
	}
}
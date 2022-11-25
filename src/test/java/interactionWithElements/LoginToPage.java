package interactionWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToPage {
	
	public static String browser = "chrome"; // External configuration - XLS, CSV (to be done)
	public static WebDriver driver;

	public static void main(String[] args) {
		
		if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("https://test.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("team.seavus@partner-prod.com.vlocitysbx");
		driver.findElement(By.name("pw")).sendKeys("seavusQA123!");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"input-104\"]")).sendKeys("test");
		//System.out.println(driver.findElement(By.id("user-name")).getAttribute("class"));
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getCssValue("text-transform"));
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getSize());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getLocation());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getTagName());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isDisplayed());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isEnabled());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isSelected());

		//driver.quit();	

	}

}

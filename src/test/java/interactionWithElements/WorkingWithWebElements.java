package interactionWithElements;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkingWithWebElements {
	
	public static String browser = "chrome"; // External configuration - XLS, CSV (to be done)
	public static WebDriver driver;

	public static void main(String[] args) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("TestingTestingTesting");
		//driver.findElement(By.id("user-name")).clear();
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

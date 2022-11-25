package interactionWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public static String browser = "chrome"; // External configuration - XLS, CSV (to be done)
	public static WebDriver driver;
	
	public static void LoginMethod() {
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
		
		
	}

}

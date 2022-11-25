package interactionWithElements;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PriceBook extends Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		Login.LoginMethod();
		
		FileInputStream f = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyFile\\Locators.properties");
		Properties p = new Properties();
		p.load(f);		
		
		//List all entries for the Standard Price Book
        Thread.sleep(5000);
        driver.findElement(By.xpath(p.getProperty("app_button"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(p.getProperty("search_item"))).click();
        driver.findElement(By.xpath(p.getProperty("send_text"))).sendKeys("Price Books");
        Thread.sleep(4000);
        driver.findElement(By.xpath(p.getProperty("select_pricebook"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(p.getProperty("standard_price_book"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(p.getProperty("related"))).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(p.getProperty("view_all"))).click();
		

	}

}

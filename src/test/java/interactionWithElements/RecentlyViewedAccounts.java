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

public class RecentlyViewedAccounts extends Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		Login.LoginMethod();

		FileInputStream f = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyFile\\Locators.properties");
		Properties p = new Properties();
		p.load(f);

		//Edit existing Account
        Thread.sleep(4000);
        driver.findElement(By.xpath(p.getProperty("app_button"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(p.getProperty("search_item"))).click();
        driver.findElement(By.xpath(p.getProperty("send_text"))).sendKeys("Accounts");
        Thread.sleep(3000);
        driver.findElement(By.xpath(p.getProperty("select_accounts"))).click();   
        Thread.sleep(3000);
        driver.findElement(By.xpath(p.getProperty("title"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(p.getProperty("edit_btn"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(p.getProperty("update_field"))).clear();
        driver.findElement(By.xpath(p.getProperty("update_field"))).sendKeys("www.test.seavus2");
        Thread.sleep(5000);
        driver.findElement(By.xpath(p.getProperty("save_edit"))).click();		

        
        

	}

}

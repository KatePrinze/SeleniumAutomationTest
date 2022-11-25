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

public class CreateResidentialAccount extends Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		Login.LoginMethod();

		FileInputStream f = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyFile\\Locators.properties");
		Properties p = new Properties();
		p.load(f);

		//Create Business Account
        Thread.sleep(7000);
        driver.findElement(By.xpath(p.getProperty("app_button"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(p.getProperty("search_item"))).click();
        driver.findElement(By.xpath(p.getProperty("send_text"))).sendKeys("Accounts");
        Thread.sleep(3000);
        driver.findElement(By.xpath(p.getProperty("select_accounts"))).click();
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[2]/ul/li[1]/a")).click(); //New button
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class=\"modal-body scrollable slds-modal__content slds-p-around--medium\"]/div/div/div[1]/div/div/div[1]/fieldset/div[1]/div[11]/label/div[1]/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class=\"modal-body scrollable slds-modal__content slds-p-around--medium\"]/div/div/div[2]/div/button[2]/span")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@name=\"Name\"]")).sendKeys("KA_AccountRes_160922");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name=\"Phone\"]")).sendKeys("123456");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"input-281\"]")).sendKeys("street1");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"input-282\"]")).sendKeys("1000");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"input-283\"]")).sendKeys("Skopje");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"input-285\"]")).sendKeys("Macedonia");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name=\"Same_as_Billing_Address__c\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@name=\"SaveEdit\"]")).click();
        
	}

}

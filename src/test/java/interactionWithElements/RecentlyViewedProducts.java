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

public class RecentlyViewedProducts extends Login {


	public static void main(String[] args) throws InterruptedException, IOException {
		Login.LoginMethod();
		
		//read from property file
		FileInputStream f = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyFile\\Locators.properties");
		Properties p = new Properties();
		p.load(f);
		
		//Create Product
		Thread.sleep(7000);
		driver.findElement(By.xpath(p.getProperty("app_button"))).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(p.getProperty("search_item"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(p.getProperty("send_text"))).sendKeys("Products");
        Thread.sleep(3000);
        driver.findElement(By.xpath(p.getProperty("select_products"))).click();
        
        //Create Product New
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@title=\"New\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@title=\"BASE Product Spec Type\"]")).click(); //dropdown
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@data-interactive-lib-uid=\"4\"]")).sendKeys("KA_Product_2510_01");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@data-interactive-lib-uid=\"3\"]")).sendKeys("KA_ProductCode_2510_01");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@data-interactive-lib-uid=\"10\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@title=\"Residential\"]")).click(); //dropdown
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@data-interactive-lib-uid=\"11\"]")).click(); //checkbox
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@title=\"Save\"]")).click();
        
        //Create Product Old
        //Thread.sleep(5000);	
        //driver.findElement(By.xpath(p.getProperty("create_new_button"))).click();
        //Thread.sleep(9000);
        //driver.findElements(By.tagName("iframe"));
        //driver.switchTo().frame(0);
        //Thread.sleep(10000);
        //driver.findElement(By.xpath(p.getProperty("product_name"))).sendKeys("TestKA1908_02");
        //Thread.sleep(5000);
        //driver.findElement(By.xpath(p.getProperty("product_code"))).sendKeys("CodeKA1908_02");
        //Thread.sleep(5000);
        //driver.findElement(By.xpath(p.getProperty("checkbox1"))).click();         //checkbox
        //Thread.sleep(5000);
        //driver.findElement(By.xpath(p.getProperty("main_dropdown1"))).click();    //dropdown
        //Thread.sleep(5000);
        //driver.findElement(By.xpath(p.getProperty("type_dropdown"))).click();     //dropdown
        //Thread.sleep(5000);
        //driver.findElement(By.xpath(p.getProperty("done_btn"))).click();
        
        // //*[@id="field-undefined"]/div[1]/div/div/vlocity-checkbox/div/div/div[1]/span/label[@for="vlocity-checkbox-0"]/span[1]
        // /html/body/span[1]/div/vlocity-product-console/div[1]/vlocity-pc-new-product/div/vlocity-pc-field-layout/vlocity-pc-layout-section[1]/div[2]/div[2]/vlocity-pc-layout-section-element[2]/div/div[1]/vlocity-combobox/div/div/div/div/div[1]/input
        //  //*[@id="listbox-id-1"]/ul/li[3]/div/span[2]/span[@title="Service"]
        //driver.findElement(By.xpath("//one-app-launcher-header[@class='slds-icon-waffle_container']//button[@class='slds-button slds-show']")).click();
        //driver.findElement(By.xpath("//input[@placeholder='Search apps and items...']")).click(); 
        //driver.findElement(By.xpath("//input[@placeholder='Search apps and items...']")).sendKeys("Products"); 
        //driver.findElement(By.xpath("//*[@id='Product2']/div/lightning-formatted-rich-text/span/p/b")).click();
        

       //driver.findElement(By.xpath("//*[@class='forceActionLink']/div[@title=\"Create New Product\"]")).click();
       //driver.findElement(By.xpath("//input[@type='text'][@tabindex='1']")).sendKeys("TestKA");
       //driver.findElement(By.xpath("//input[@type='text'][@tabindex='2']")).sendKeys("CodeKA");
       // driver.findElement(By.xpath("//button[text()='Done']")).click();

	}

}

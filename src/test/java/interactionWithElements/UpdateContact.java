package interactionWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateContact extends Login {

	public static void main(String[] args) throws InterruptedException {
		Login.LoginMethod();
		
        Thread.sleep(6000);
        driver.findElement(By.xpath("//one-app-launcher-header[@class='slds-icon-waffle_container']//button[@class='slds-button slds-show']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@placeholder='Search apps and items...']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search apps and items...']")).sendKeys("Contacts");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"Contact\"]/div/lightning-formatted-rich-text/span/p/b")).click(); 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title=\"Angjelkoska\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@name=\"Edit\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@name=\"salutation\"]")).click();  //Dropdown
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@title=\"Mrs.\"]")).click();          //Dropdown
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@name=\"SaveEdit\"]")).click();
        
        //Task for Dropdown

	}

}

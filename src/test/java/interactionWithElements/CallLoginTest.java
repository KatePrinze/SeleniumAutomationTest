package interactionWithElements;

import org.openqa.selenium.By;

public class CallLoginTest extends Login {

	public static void main(String[] args) throws InterruptedException {
		
		Login.LoginMethod();
		
		driver.navigate().to("https://seavus-testing-vlocity--vlocitysbx.lightning.force.com/lightning/o/Product2/list?filterName=Recent");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@title='Create New Product']")).click();
		

		
	}

}

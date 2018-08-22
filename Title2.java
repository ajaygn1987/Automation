package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Title2 {
	
		WebDriver driver;
		@BeforeTest	
		 public void Login() {
			System.setProperty("webdriver.chrome.driver","D:\\Ajay\\Downloads\\chromedriver_win32\\New folder\\chromedriver.exe");
			driver=new ChromeDriver();		
			driver.get("https://www.yatra.com/");
			driver.manage().window().maximize();
		 }
		@AfterTest
		 public void Logout() {
			driver.quit();	 
		 }
		@Test(priority=1)
		public void SelectDate() throws InterruptedException {
			driver.findElement(By.className("BE_flight_arrival_date")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'25')]")).click();
			Thread.sleep(2000);
		}
	
		}



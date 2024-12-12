package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		
		//syntax for to launch the browser.
		ChromeDriver driver = new ChromeDriver();
		//to get  the website url.
		driver.get("https://www.facebook.com/");
		
		//this is comment for page screen is maximize.
		driver.manage().window().maximize();
		
		//to get the page title.
		String title = driver.getTitle();
		System.out.println(title);
		
		// find element from the web page for automate the browser.
		driver.findElement(By.id("email")).sendKeys("maha2k03lakshmi@gmail.com");
		
		//it is a java weight.it's used to take some time for enter the data.
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).sendKeys("test@1211");
		
		//.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//this is used for close  the automate web browser.
		driver.close();
        
		}

}

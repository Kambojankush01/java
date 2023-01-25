package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankush\\eclipse-workspace\\Java practice\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// Launch google web page
		driver.navigate().to("http:\\www.google.com");
		
		//capture title of webpage and print
		
		String title = driver.getTitle();		
		System.out.println("Page Title : "+title);
		
		
		// Capture url of the webpage
		
		System.out.println("URL : "+driver.getCurrentUrl());
		
		// Capture Page source
		System.out.println("Page source : "+driver.getPageSource());
		
	}

}

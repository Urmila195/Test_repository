package main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		driver.get("https://qatest2.angular.nimbustest.xyz/login");
		System.out.println(driver.getTitle());
		
	}

}



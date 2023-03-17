package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Simple {
public static void main(String[] args) {
//	System.setProperty("webdriver.gecko.driver",
//			"C:\\Users\\Reyan\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
//	System.setProperty("webdriver.gecko.driver",
//			"C:\\Users\\Reyan\\eclipse-workspace\\SeleniumPractice\\Driver\\geckodriver.exe");
//	System.setProperty("webdriver.gecko.driver",
//			"C:\\Users\\Reyan\\eclipse-workspace\\SeleniumPractice\\Driver\\msedgedriver.exe");
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\Reyan\\eclipse-workspace\\SeleniumPractice\\Driver\\msedgedriver.exe");
	//WebDriver driver = new ChromeDriver();
	//WebDriver driver = new FirefoxDriver();
	//WebDriver driver = new EdgeDriver();
	WebDriver driver = new InternetExplorerDriver();
	driver.get("https://www.facebook.com/");

}
}

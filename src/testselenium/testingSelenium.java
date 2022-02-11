package testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://transfotechacademy.com/");

	}

}

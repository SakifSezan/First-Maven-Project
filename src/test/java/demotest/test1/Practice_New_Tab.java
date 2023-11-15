package demotest.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_New_Tab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.booking.com/");
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoblaze.com/index.html");
		Thread.sleep(3000);
		
		
		driver.close();
		

	}

}

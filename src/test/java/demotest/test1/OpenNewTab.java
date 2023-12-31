package demotest.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com/");
        driver.manage().window().maximize();
       
        driver.get("https://www.google.com/");
        System.out.println("first page " + driver.getTitle());
        
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com/");
        Thread.sleep(5000);
         
         System.out.println("second tab " + driver.getTitle());
         
         Set <String> windowhandles = driver.getWindowHandles();
         List<String> handles = new ArrayList<String>();
         handles.addAll(windowhandles);
         
         driver.close(); 
         driver.switchTo().window(handles.get(0));
         System.out.println("first page " + driver.getTitle());
         
         
         
         
        
	}

}

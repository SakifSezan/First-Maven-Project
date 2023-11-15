package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("Webdriver.chrome.diver", "C:\\WebDrivers\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.selenium.dev/");
		driver.get("https://www.nexttechitc.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(500, 1000);
		
		TakesScreenshot TS = (TakesScreenshot)driver;
		File file = TS.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./screenshots/Image1.png"));
		
		Thread.sleep(2000);
		
		driver.quit();
 
	}

}

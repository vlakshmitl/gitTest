package sampleTest1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest1 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wd.get("https://www.google.com/");
		
//		TakesScreenshot - I
//		WebDriver - I
		
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		//  D:\Divya\New folder\Selenium244\C2_WebDriverTest\screenshot
		//FileUtils // appache //1.0, 2.0
		FileHandler.copy(src, new File("C:\\Users\\vembarasan\\eclipse-workspace\\gitTest\\Screenshot\\google.png"));

		
	}
	public void loginTest() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wd.get("https://www.google.com/");
		
//		TakesScreenshot - I
//		WebDriver - I
		
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		//  D:\Divya\New folder\Selenium244\C2_WebDriverTest\screenshot
		//FileUtils // appache //1.0, 2.0
		FileHandler.copy(src, new File("C:\\Users\\vembarasan\\eclipse-workspace\\gitTest\\Screenshot\\google.png"));
	
	}

}

package Testing.Automation;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{		
		@Test
		public void sample() throws InterruptedException {
        System.out.println( "Hello World! == This is rajeev practice" );
        System.setProperty("webdriver.chrome.driver", "E:\\Program Files\\ChromeDriver\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.google.co.in/");
        Thread.sleep(1000);
        d.quit();
        
		}
}

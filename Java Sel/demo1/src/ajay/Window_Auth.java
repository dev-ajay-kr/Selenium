package ajay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Auth{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selDats\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic auth" );
		driver.manage().window().maximize();
	}
}

package ajay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Tooltip_Message {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selDats\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https:www.google.co.in");
		driver.get("http://localhost:5000/easytesting");
		WebElement Tooltip=driver.findElement(By.xpath("/html/body/div[1]/a"));
	
	}
}
	
	

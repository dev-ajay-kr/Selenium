package ajay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Tooltip_Message {
	- public static void main(String args[]) throws InterruptedException {
		System.setPropertyrwebdriver.chrome.drivern, "C:\\Selenium\\driver\\chromedriver win32\\chromedriver.exe'
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:5000/easytesting");
		String Tooltip=driver.findElement(By.xpath("/html/body/div[1]/a") .getAttribute("title");
		System.out.print(Tooltip+" Test case Passed");
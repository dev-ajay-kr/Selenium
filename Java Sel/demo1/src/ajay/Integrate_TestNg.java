01 package ajay;
02
03 import org.openqa.selenium.By;
04 import org.openqa.selenium.WebDriver;
05 import org.openqa.selenium.chrome.ChromeDriver;
//06 import org.testng.annotations.BeforeClass;
//07 import org.testng.annotations.Test;
08
09 public class Integrate_TestNg _with_ selenium {
10 WebDriver driver;
11
12 @BeforeClass
13 public void setUp() {
14 System.setProperty (“ webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver win32\\chromedriver.exe");
15 driver=new ChromeDriver();
16 }
17
18 @Test
19 public void TestMethod1(){
20
21 driver.get("https://www.google.com/");
22 System.out.println("Test Case 1 Passed");
23 }
24
25- @Test(dependsOnMethods={"TestMethod1"})
26 public void TestMethod2(){ “);
27 System.out.println(driver.getTitle());
28 System.out.println("Test Case 2 Passed");
29 }
30
31- @Test(dependsOnMethods={"TestMethod1"})
32 public void TestMethod3(){
33 driver.findElement(By.name("q")).sendKeys("Selenium");
34 System.out.println("Test Case 3 Passed");
35 }
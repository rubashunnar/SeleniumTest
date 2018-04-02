package najah.edu;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestFacebookWithJUnit {

	static WebDriver driver;

	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.gecko.driver","gecko\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void test() {
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("shunnar.ruba@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("52fitness");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).submit();
	}
}

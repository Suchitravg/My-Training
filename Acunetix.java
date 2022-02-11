import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Acunetix {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Suchitra\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testphp.vulnweb.com/login.php");
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		System.out.println("Sucessfully opened" + driver.getCurrentUrl());
		// login
		String user = Acunetix.getusername(driver);
		String pass = Acunetix.getpassword(driver);

		driver.findElement(By.xpath("//input[@name='uname']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='login']")).click();
		driver.findElement(By.name("urname")).clear();
		driver.findElement(By.name("urname")).sendKeys("Alex Adam");
		driver.findElement(By.name("ucc")).clear();
		driver.findElement(By.name("ucc")).sendKeys("9087-7654-5432");
		driver.findElement(By.cssSelector("input[name='uemail']")).clear();
		driver.findElement(By.cssSelector("input[name='uemail']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@name='uphone']")).clear();
		driver.findElement(By.xpath("//input[@name='uphone']")).sendKeys("9876543210");
		driver.findElement(By.tagName("textarea")).clear();
		driver.findElement(By.tagName("textarea")).sendKeys("Abx street,TVM");
		driver.findElement(By.cssSelector("input[value='update']")).click();

		// logout
		driver.findElement(By.xpath("(//a[normalize-space()='Logout test'])[1]")).click();
		// Assert

		Assert.assertEquals(driver.getTitle(), "logout");
		Assert.assertEquals(driver.getCurrentUrl(), "http://testphp.vulnweb.com/logout.php");
		
		 driver.close();

	}

	// credentials using function
	public static String getpassword(WebDriver driver) {
		driver.get("http://testphp.vulnweb.com/login.php");
		String paswwd = driver.findElement(By.cssSelector("font[color='red']")).getText();
		return paswwd;

	}

	public static String getusername(WebDriver driver) {
		driver.get("http://testphp.vulnweb.com/login.php");
		String username = driver.findElement(By.cssSelector("font[color='red']")).getText();
		return username;

	}

}

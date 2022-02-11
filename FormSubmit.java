import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormSubmit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Suchitra\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.id("validationCustom01")).sendKeys("Alex");
		driver.findElement(By.id("validationCustom02")).sendKeys("Adam");
		Thread.sleep(2000);
		driver.findElement(By.id("validationCustomUsername")).sendKeys("axcu");
		driver.findElement(By.id("validationCustom03")).sendKeys("TVM");
		driver.findElement(By.id("validationCustom04")).sendKeys("Kerala");
		driver.findElement(By.id("validationCustom05")).sendKeys("695014");
		Thread.sleep(2000);
		driver.findElement(By.id("invalidCheck")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}

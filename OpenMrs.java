import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMrs {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Suchitra\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");

		driver.findElement(By.cssSelector("input#username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Admin123");
		driver.findElement(By.id("Inpatient Ward")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).click();

		//driver.findElement(By.id("fr2372-field")).click();
		driver.findElement(By.name("givenName")).sendKeys("ALex");
		driver.findElement(By.name("familyName")).sendKeys("Adam");
		driver.findElement(By.cssSelector("button#next-button")).click();

	}
}
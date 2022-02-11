import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Suchitra\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.findElement(By.cssSelector(".select2-selection.select2-selection--multiple")).sendKeys(Keys.ENTER);
		Select countries=new Select(driver.findElement(By.xpath("(//select[@name='states[]'])[1]")));
		countries.selectByVisibleText("Arizona");
		countries.selectByVisibleText("California");
		countries.selectByVisibleText("Hawaii");
		Thread.sleep(2000);
		//countries.deselectByValue("AZ");
		countries.deselectAll();

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		{

			System.setProperty("webdriver.chrome.driver", "F:\\Suchitra\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
			driver.findElement(By.cssSelector("#inlineRadio2")).click();
			driver.findElement(By.cssSelector("#button-one")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='inlineRadio21']")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@id='inlineRadio23'])[1]")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='button-two']")).click();
			
			driver.findElements(By.cssSelector("input[type='radio']")).size();
			System.out.println(driver.findElements(By.cssSelector("input[type='radio']")).size());
			//Thread.sleep(2000);
			driver.close();
		}

	}
}

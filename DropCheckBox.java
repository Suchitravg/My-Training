import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropCheckBox {

	public static void main(String[] args) throws InterruptedException {
		{

			System.setProperty("webdriver.chrome.driver", "F:\\\\Suchitra\\\\Selenium\\\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
			driver.findElement(By.id("gridCheck")).click();
			driver.findElement(By.id("gridCheck")).isSelected();
			System.out.println(driver.findElement(By.id("gridCheck")).isSelected());

			driver.findElement(By.id("check-box-one")).click();
			driver.findElement(By.id("check-box-one")).isSelected();
			driver.findElement(By.id("check-box-two")).click();
			driver.findElement(By.id("check-box-two")).isSelected();
			System.out.println(driver.findElement(By.id("check-box-one")).isSelected());
			System.out.println(driver.findElement(By.id("check-box-two")).isSelected());
			driver.findElement(By.id("button-two")).click();
			
			driver.findElements(By.cssSelector("input[type='checkbox']")).size();
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			driver.close();

			Thread.sleep(2000);
			driver.get("https://selenium.obsqurazone.com/select-input.php");
			driver.findElement(By.id("single-input-field")).click();

		}

	}
}

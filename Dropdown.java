import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\\\Suchitra\\\\Selenium\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://selenium.obsqurazone.com/select-input.php");// get browser
		try {
			WebElement staticdropdown = driver.findElement(By.id("single-input-field"));
			Select dropdown = new Select(staticdropdown);
			dropdown.selectByIndex(1);
			System.out.println(dropdown.getFirstSelectedOption().getText());
			dropdown.selectByValue("Yellow");
			System.out.println(dropdown.getFirstSelectedOption().getText());
			dropdown.selectByVisibleText("Green");
			System.out.println(dropdown.getFirstSelectedOption().getText());
			// dropdown.selectByVisibleText("Greeeen");
			// System.out.println(dropdown.getFirstSelectedOption().getText());
		} catch (Exception Ex) {
			System.out.println("Test Failed");

		}

		// driver.close();
	}

}

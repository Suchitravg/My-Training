import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Booking {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Suchitra\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://www.booking.com/");
		driver.findElement(By.linkText("Flights")).click();
		Select Economy = new Select(driver.findElement(By.cssSelector(".css-1k0jlfl")));
		Economy.selectByValue("BUSINESS");
		driver.findElement(By.cssSelector("div[class='css-vvcyi3'] div div div")).click();
		driver.findElement(By.cssSelector(".css-153jucu")).click();
		driver.findElement(By.xpath("(//button[@class='css-153jucu'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='css-153jucu'])[2]")).click();
		Select Age = new Select(driver.findElement(By.xpath("(//select[@id='__bui-6'])")));
		Age.selectByValue("10");
		Select Age2 = new Select(driver.findElement(By.xpath("(//select[@id='__bui-7'])")));
		Age2.selectByValue("6");
		driver.findElement(By.cssSelector(".css-ya5gr9")).click();
		driver.findElement(By.cssSelector(".InputCheckbox-module__field___1mRcZ")).click();
		driver.findElement(By.xpath("//div[@class='css-195ievx-inputContainer'][1]")).click();
		driver.findElement(By.cssSelector(".css-1eii3rq")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("New Delhi");
		driver.findElement(By.cssSelector("input[class='css-bwf0ll']")).click();
		driver.findElement(By.cssSelector("input[class='css-bwf0ll']")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.className("css-g0pg3f-SearchboxInput")).click();
		driver.findElement(By.cssSelector("input[class='css-1tl2oa1']")).sendKeys("Cochin");
		driver.findElement(By.cssSelector("input[class='css-bwf0ll']")).click();
		driver.findElement(By.cssSelector("input[class='css-bwf0ll']")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.cssSelector("input[placeholder='Depart']")).click();
		driver.findElement(By.cssSelector("span[data-date-cell='2022-03-20']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Return']")).click();
		driver.findElement(By.cssSelector("span[data-date-cell='2022-03-31']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();

	}

}

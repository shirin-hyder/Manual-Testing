package TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ebay_Testing {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void url() {
		driver.get("https://www.ebay.com/");
	}
	
	@Test
	public void ebaytest() throws IOException {
		
		driver.manage().window().maximize(); // To maximize window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implict wait to over come "element not interactable" error
		Actions act = new Actions(driver);

		WebElement fashion = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[5]/a"));
		act.moveToElement(fashion);
		act.build().perform();
		
		WebElement womenaccessories = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/div[2]/div[1]/nav[2]/ul/li[2]/a"));
		womenaccessories.click();
		
		WebElement beltbuckles = driver.findElement(By.xpath("//*[@id=\"s0-17-12_2-0-1[0]-0-0\"]/ul/li[3]/a"));
		beltbuckles.click();
		
		WebElement brand = driver.findElement(By.xpath("//*[@id=\"s0-28_2-9-0-1[0]-0-0-6-8-4[2]-flyout\"]/button"));
		brand.click();
		
		WebElement Gucci = driver.findElement(By.xpath("//*[@id=\"s0-28_2-9-0-1[0]-0-0-6-8-4[2]-flyout\"]/div/ul/li[10]/a/span[2]"));
		Gucci.click();
		
		WebElement beltimage = driver.findElement(By.xpath("//*[@id=\"s0-28_1-9-0-1[0]-0-0\"]/ul/li[2]/div[1]/div[1]/div/a/div"));
		beltimage.click();
		
		//driver.getWindowHandle();
		driver.navigate().forward();

		// screenshot
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//photo.//belt1.png"));
		
	
		
	}

}

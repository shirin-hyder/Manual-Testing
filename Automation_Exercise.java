package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_Exercise {
	
	WebDriver driver;
	
	@BeforeTest
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			}
	
	
	@BeforeMethod
	public void url() {
		driver.get("https://automationexercise.com/");
	}
	
	@Test(enabled = false)
	public void test1() {
		
		driver.manage().window().maximize();
		
		//Sign up
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		signup.click();
		
		/* WebElement home = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a"));
		home.click(); */
		
		WebElement name = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
		name.sendKeys("samar");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
		email.sendKeys("samar123@gmail.com");
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
		btn.click();
		
		// creating account
		WebElement gender=driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
		gender.click();
		WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("samar719");
		
		// Choosing Day
		WebElement day = driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select daydrop = new Select(day);
		daydrop.selectByValue("21");
		
		//Choosing Month
		WebElement month = driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select monthdrop = new Select(month);
		monthdrop.selectByVisibleText("April");
		
		//Year
		WebElement year =driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select yeardrop = new Select(year);
		yeardrop.selectByIndex(15);
		
	
		
		WebElement newsltr = driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
		newsltr.click();
		WebElement spcloffers = driver.findElement(By.xpath("//*[@id=\"optin\"]"));
		spcloffers.click();
		
		// Address Information                              
		WebElement fname = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		fname.sendKeys("samar");
		WebElement lname = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		lname.sendKeys("samar mohammed");
		WebElement cmpnyname = driver.findElement(By.xpath("//*[@id=\"company\"]"));
		cmpnyname.sendKeys("Techolas Technologies");
		
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Techolas Technologies\n Palarivattom junction\n Vasudeva Complex\n Cochin\n");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Techolas Technologies\n Palarivattom junction\n Vasudeva Complex\n Cochin\n");
		//driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9632587415");
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
		mobile.sendKeys("8545895623");
		
		}
	
	@Test(enabled = false)
	public void login()  {
		
		driver.manage().window().maximize();

		WebElement signup = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		signup.click();
		
		WebElement email1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
		email1.sendKeys("samar123@gmail.com");
		WebElement pswrd = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));
		pswrd.sendKeys("samar719");
		WebElement logn = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
		logn.click();
		
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		logout.click();
	
		
		
	}
	
	@Test
	public void dlt() {
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		signup.click();
		
		WebElement email1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
		email1.sendKeys("samar123@gmail.com");
		WebElement pswrd = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));
		pswrd.sendKeys("samar719");
		WebElement logn = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
		logn.click();
		
		// Delete
		WebElement dlt = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
		dlt.click();
		
		WebElement dltcontinue = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
		dltcontinue.click();
	}

}

package build.com.Automation.lib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import build.com.Automation.utility.PropertyFile;

public class General extends Global {

	// Reusable methods
	
	public void openApplication(){
		
		String path = System.getProperty("user.dir");
		String driverpath = path + ".\\configPorperties\\chromedriver.exe"; 

		System.setProperty("webdriver.chrome.driver",driverpath );
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to(url);
		System.out.println("Application open successfully");
		System.out.println(driver.getTitle());
				
		}
	
	public void closeApplication(){
		driver.quit();
		System.out.println("Application Closed");
		}
	
	public void signUP() throws Exception{
		driver.findElement(By.linkText(link_signin)).click();
		property = new PropertyFile();
		property.getProperty();
		
		driver.findElement(By.id(txt_email)).sendKeys(email);
		driver.findElement(By.id(button_create)).click();
		driver.findElement(By.id(txt_firstname)).sendKeys(fn);
		driver.findElement(By.id(txt_lastname)).sendKeys(ln);
		driver.findElement(By.id(txt_password)).sendKeys(pwd);
		driver.findElement(By.id(txt_add1)).sendKeys(address1);
		driver.findElement(By.id(txt_city)).sendKeys(city);
		select = new Select(driver.findElement(By.id(txt_state)));
		select.selectByIndex(9);
		driver.findElement(By.id(txt_Zip)).sendKeys(zip);
		driver.findElement(By.id(txt_mobile)).sendKeys(mob);
		driver.findElement(By.id(txt_add_Alias)).sendKeys(add_alias);
		driver.findElement(By.id(button_submit)).click();
		System.out.println("New user registered successfully");
		driver.findElement(By.xpath(button_signout)).click();
		System.out.println("User signout");
		
		}
	
	public void login() throws Exception{
		driver.findElement(By.id(txt_login_email)).sendKeys(email);
		driver.findElement(By.id(txt_login_password)).sendKeys(pwd);
		driver.findElement(By.id(button_login_submit)).click();
		System.out.println("User login successfully");
		}
	
	public void addToCart() throws InterruptedException{
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(link_women)));
		element1.click();
		WebElement element2 = driver.findElement(By.xpath(list_product));
		action =new Actions(driver);
		action.moveToElement(element2).build().perform();
		driver.findElement(By.xpath(link_quickview)).click();
		WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		System.out.println("1");
		driver.findElement(By.xpath(button_plus)).click();
		driver.findElement(By.xpath(addtocart)).click();
		System.out.println("Two item added successfully to shopping cart");
		String MainWindow=driver.getWindowHandle();
		driver.switchTo().window(MainWindow);
		Thread.sleep(2000);
		fTotal = driver.findElement(By.xpath(total)).getText();
		System.out.println("Final total price:"+fTotal);
		
		
		}
	
	public void checkoutProcess(){
		
		driver.findElement(By.xpath(button_checkout1)).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(button_checkout2)).click();
		driver.findElement(By.xpath(button_checkout3)).click();
		driver.findElement(By.id(checkbox)).click();
		driver.findElement(By.xpath(button_checkout4)).click();
		driver.findElement(By.xpath(link_payment)).click();
		
		String amount = driver.findElement(By.id(text_amount)).getText();
		System.out.println(amount);
		Assert.assertEquals(amount, fTotal);
		System.out.println("Ordered amount verified");
		driver.findElement(By.xpath(button_orderSubmit)).click();
		System.out.println("Ordered submitted successfuly");
		
		}
	public void verifyTotalAmountOrder(){
		
		driver.findElement(By.xpath(link_profile)).click();
		
		driver.findElement(By.xpath(link_orderHistory)).click();
		
		String price = driver.findElement(By.xpath(txt_price)).getText();
		System.out.println("Price is:"+price);
		Assert.assertEquals(price, fTotal);
		System.out.println("Total Amount Of Order Verified");
	
		}
	
	}



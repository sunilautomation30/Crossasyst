package build.com.Automation.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import build.com.Automation.utility.PropertyFile;

public class Global  {

	//Variables
	
	public WebDriver driver;
	public Actions action;
	public Select select;
	public PropertyFile property;
	
	
		
	public String url = "http://automationpractice.com/index.php";
	public String fn ="test";
	public String ln = "testtest";
	public static String email = "";
	public String pwd = "test11@123";
	public String address1 = "Street12";
	public String city = "Miami";
	public String zip = "55664";
	public String mob = "1234567890";
	public String add_alias = "abcd";
	public static String fTotal ="";
	//Objects
	
	public String link_signin = "Sign in";
	public String txt_email = "email_create";
	public String button_create ="SubmitCreate";
	public String txt_firstname ="customer_firstname";
	public String txt_lastname = "customer_lastname";
	public String txt_password = "passwd";
	public String txt_add1 = "address1";
	public String txt_city = "city";
	public String txt_state ="id_state";
	public String txt_Zip = "postcode";
	public String txt_mobile ="phone_mobile";
	public String txt_add_Alias = "alias";
	public String button_submit = "submitAccount";
	public String button_signout ="//a[@class='logout']";
	public String txt_login_email ="email";
	public String txt_login_password = "passwd";
	public String button_login_submit = "SubmitLogin";
	public String link_women = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
	public String list_product = "(//ul[@class='product_list grid row']//li//img)[1]";
	public String link_quickview = "(//ul[@class='product_list grid row']//li//img[1]//parent::a//following-sibling::a/span)[1]";
	public String button_plus = "//p[@id='quantity_wanted_p']//a[2]";
	public String addtocart = "//button[@name='Submit']";
	public String total ="//*[@class='ajax_block_cart_total']";
	public String button_checkout1 = "//a[@class='btn btn-default button button-medium']";
	public String button_checkout2="//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]";
	public String button_checkout3 ="//button[@name='processAddress']";
	public String checkbox = "cgv";
	public String button_checkout4 = "//button[@name='processCarrier']";
	public String link_payment = "//a[@class='bankwire']";
	public String text_amount = "amount";
	public String button_orderSubmit = "//button[@class='button btn btn-default button-medium']";
	public String link_profile ="//a[@class='account']";
	public String link_orderHistory = "//span[contains(text(),'Order history and details')]";
	public String txt_price = "//span[@class='price']";
	

	}



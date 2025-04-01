package AutomationQA.Automationdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class saucedemo {
	@SuppressWarnings("deprecation")
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html"); 
		System.out.println("Verfying Scenario");
		
		// TC01-rss
        String pagetitle = driver.getTitle();
        Assert.assertEquals(pagetitle,"Swag Labs","Page Title not correct");
		// TC02
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("user-name"));
		Assert.assertTrue(username.isDisplayed(),"Username is not displayed");
		// TC03
	    driver.findElement(By.id("user-name")).sendKeys("HASAN");
	    String finame = driver.findElement(By.id("user-name")).getAttribute("value");
	    Assert.assertEquals(finame,"HASAN");
	    driver.findElement(By.id("password")).sendKeys("Marziya");
	    String liname = driver.findElement(By.id("password")).getAttribute("value");
	    Assert.assertEquals(liname,"Marziya");
		// TC04
	    driver.findElement(By.id("login-button")).click();
	    Assert.assertTrue(driver.findElement(By.id("login-button")).isEnabled(),"CTA is not clickable");
		// TC05
	    String errortext = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
	    String ET = "Epic sadface: Username and password do not match any user in this service";
	    Assert.assertEquals(errortext,ET,"Error text is not same");
		// TC06
	    driver.findElement(By.id("user-name")).clear();
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    String firname = driver.findElement(By.id("user-name")).getAttribute("value");
	    Assert.assertEquals(firname,"standard_user");
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    String lasname = driver.findElement(By.id("password")).getAttribute("value");
	    Assert.assertEquals(lasname,"secret_sauce");
		// TC07
	    Thread.sleep(2000);
	    Assert.assertTrue(driver.findElement(By.id("login-button")).isEnabled(),"CTA not clickable");
	    driver.findElement(By.id("login-button")).click();
		// TC08
	    String actualtitle = driver.getTitle();
	    String exptitle = "Swag Labs";
	    Assert.assertEquals(actualtitle,exptitle);
		// TC09
	    Assert.assertTrue(driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory '])[1]")).isEnabled(),"CTA not clickable");
	    driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory '])[1]")).click();
		// TC10
	    String c = driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
	    Assert.assertTrue(c.equals("1"));    
		// TC11 
	    driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory '])[2]")).click();
	    Assert.assertTrue(driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory '])[2]")).isEnabled(),"CTA nit clickable");
		// TC12
	    String d = driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
	    Assert.assertTrue(d.equals("2"));    
		// TC13 
	    driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).isDisplayed();
	    Assert.assertTrue(driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).isDisplayed(),"Remove CTA not displayed");
	    // TC14
	    Assert.assertTrue(driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).isEnabled(),"Remove CTA not displayed");
	    driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click(); 
		// TC15
	    String e = driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
	    Assert.assertTrue(e.equals("1"));    
		// TC16  
	    Assert.assertTrue(driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).isEnabled(),"CTA not clickable");
	    driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	    // TC17 
	    driver.getCurrentUrl().contains("cart");
	    Assert.assertTrue(driver.getCurrentUrl().contains("cart"), "URL does not contain 'cart'");  
		// TC18
		 driver.findElement(By.name("checkout")).isDisplayed();
		 Assert.assertTrue(driver.findElement(By.name("checkout")).isDisplayed(),"Checkout CTA not displayed");
		// TC19
		 Assert.assertTrue(driver.findElement(By.id("continue-shopping")).isEnabled(),"Contiue shooping CTA not clickable");
	     driver.findElement(By.id("continue-shopping")).click();
		 Thread.sleep(2000);
		// TC20
		 Assert.assertTrue(driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).isEnabled(),"CTA not clickable");
	    driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();	
	    // TC21
	    Assert.assertTrue(driver.findElement(By.name("checkout")).isEnabled(),"Checkout CTA not displayed");
	    driver.findElement(By.name("checkout")).click();
		// TC22
	    driver.getCurrentUrl().contains("checkout");
	    Assert.assertTrue(driver.getCurrentUrl().contains("checkout"), "URL does not contain 'checkout'");
	    Thread.sleep(2000); 
		// TC23
	    driver.findElement(By.id("first-name")).sendKeys("Hasan");
	    String fname = driver.findElement(By.id("first-name")).getAttribute("value");
	    Assert.assertEquals(fname,"Hasan");
		// TC24
	    driver.findElement(By.id("last-name")).sendKeys("Sardar");
	    String lname = driver.findElement(By.id("last-name")).getAttribute("value");
	    Assert.assertEquals(lname,"Sardar");
		// TC25
	    driver.findElement(By.id("postal-code")).sendKeys("11030");
	    String Zipcode = driver.findElement(By.id("postal-code")).getAttribute("value");
	    Assert.assertEquals(Zipcode,"11030");
		// TC26
	    Assert.assertTrue(driver.findElement(By.name("continue")).isEnabled(),"Continue CTA is not enable");
	    driver.findElement(By.name("continue")).click();
	    Thread.sleep(2000);
		// TC27
	    driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).isDisplayed();
	    Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).isDisplayed(),"Product backpack is not displaying");
		// TC28
	    Assert.assertTrue(driver.findElement(By.id("finish")).isEnabled(),"Element is not enable");
	    driver.findElement(By.id("finish")).click();
	    // TC29
	    String f = driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
	    Assert.assertEquals(f,"Thank you for your order!");
		// TC30 
	    driver.findElement(By.id("back-to-products")).isDisplayed();
	    Assert.assertTrue(driver.findElement(By.id("back-to-products")).isDisplayed(),"CTA Not Displayed");
	    System.out.println("Scenario verified");
	    driver.quit();
	}
	
}

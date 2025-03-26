public class saucedemo {
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 // TC01
           driver.get("https://www.saucedemo.com/inventory.html"); 
		System.out.println("Verfying Scenario");
		// TC02-TC03
		driver.manage().window().maximize();
	    driver.findElement(By.id("user-name")).sendKeys("HASAN");
	    driver.findElement(By.id("password")).sendKeys("Marziya");
		// TC04
	    driver.findElement(By.id("login-button")).click();
		// TC05
	    driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
	    driver.findElement(By.id("user-name")).clear();
		// TC06
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
		// TC07
	    Thread.sleep(2000);
	    driver.findElement(By.id("login-button")).click();
		// TC08
	    String actualtitle = driver.getTitle();
	    String exptitle = "Swag Labs";
	    Assert.assertEquals(actualtitle,exptitle);
		// TC09
	    driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory '])[1]")).click();
		// TC10
	   String c = driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
	   Assert.assertTrue(c.equals("1"));    
		// TC11 
	    driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory '])[2]")).click();
		// TC12
	    String d = driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
	    Assert.assertTrue(d.equals("2"));    
		// TC13 - TC14
	   driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
		// TC15
	   String e = driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
	   Assert.assertTrue(e.equals("1"));    
		// TC16-TC17     
	    driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	    driver.getCurrentUrl().contains("cart");
		// TC18
		 driver.findElement(By.name("checkout"));
		// TC19
	    driver.findElement(By.id("continue-shopping")).click();
	    Thread.sleep(2000);
		// TC20
	    driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		// TC21
	    driver.findElement(By.name("checkout")).click();
		//  TC22
	    driver.getCurrentUrl().contains("checkout");
	    Thread.sleep(2000); 
		// TC23
	    driver.findElement(By.id("first-name")).sendKeys("Hasan");
		// TC24
	    driver.findElement(By.id("last-name")).sendKeys("Sardar");
		// TC25
	    driver.findElement(By.id("postal-code")).sendKeys("11030");
		// TC26
	    driver.findElement(By.name("continue")).click();
	    Thread.sleep(2000);
		// TC27
	    driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
		// TC28
	    driver.findElement(By.id("finish")).click();
		// TC29
	    String f = driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
	    Assert.assertEquals(f,"Thank you for your order!");
		// TC30
	    driver.findElement(By.id("back-to-products"));
	    System.out.println("Scenario verified");
	    driver.quit();
	}
	
}

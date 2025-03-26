public class saucedemo {
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
driver.get("https://www.saucedemo.com/inventory.html");
		
		System.out.println("Verfying Scenario");
		
		driver.manage().window().maximize();
	    driver.findElement(By.id("user-name")).sendKeys("HASAN");
	    driver.findElement(By.id("password")).sendKeys("Marziya");
	    driver.findElement(By.id("login-button")).click();
	    driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
	    driver.findElement(By.id("user-name")).clear();
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    Thread.sleep(2000);
	    driver.findElement(By.id("login-button")).click();
	    String actualtitle = driver.getTitle();
	    String exptitle = "Swag Labs";
	    Assert.assertEquals(actualtitle,exptitle);
	 
	    driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory '])[1]")).click();
	   String c = driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
	   Assert.assertTrue(c.equals("1"));    
	    
	    driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory '])[2]")).click();
	    String d = driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
	    Assert.assertTrue(d.equals("2"));    
	   
	   driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
	   String e = driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
	   Assert.assertTrue(e.equals("1"));    
	       
	    driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	    driver.getCurrentUrl().contains("cart");
	    driver.findElement(By.id("continue-shopping")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	    driver.findElement(By.name("checkout")).click();
	    driver.getCurrentUrl().contains("checkout");
	    Thread.sleep(2000);
	    driver.findElement(By.id("first-name")).sendKeys("Hasan");
	    driver.findElement(By.id("last-name")).sendKeys("Sardar");
	    driver.findElement(By.id("postal-code")).sendKeys("11030");
	    driver.findElement(By.name("continue")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
	    driver.findElement(By.id("finish")).click();
	    String f = driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
	    Assert.assertEquals(f,"Thank you for your order!");
	    System.out.println("Scenario verified");
	    driver.quit();
	}
	
}

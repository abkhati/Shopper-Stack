package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ShopersStack {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeDriver cDriver = new ChromeDriver();
		cDriver.get("https://www.shoppersstack.com/");
		cDriver.manage().window().maximize();
		Thread.sleep(9000);
		
		cDriver.findElement(By.id("loginBtn")).click();
		Thread.sleep(2000);
		cDriver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();
		Thread.sleep(2000);
		cDriver.findElement(By.id("First Name")).click();
		cDriver.findElement(By.id("First Name")).sendKeys("Ram");
		Thread.sleep(2000);
		cDriver.findElement(By.id("Last Name")).click();
		cDriver.findElement(By.id("Last Name")).sendKeys("Suryawanshi");
		Thread.sleep(2000);
		cDriver.findElement(By.id("Male")).click();
		Thread.sleep(2000);
		cDriver.findElement(By.id("Phone Number")).click();
		cDriver.findElement(By.id("Phone Number")).sendKeys("9111111111");
		Thread.sleep(2000);
		cDriver.findElement(By.id("Email Address")).click();
		cDriver.findElement(By.id("Email Address")).sendKeys("sitaram@gmail.com");
		Thread.sleep(2000);
		cDriver.findElement(By.id("Password")).click();
		cDriver.findElement(By.id("Password")).sendKeys("Bharat@123");
		Thread.sleep(2000);
		cDriver.findElement(By.id("Confirm Password")).click();
		cDriver.findElement(By.id("Confirm Password")).sendKeys("Bharat@123");
		Thread.sleep(2000);
		cDriver.findElement(By.id("Terms and Conditions")).click();
		Thread.sleep(2000);
		cDriver.findElement(By.id("btnDisabled")).click();
		
		Thread.sleep(9000);
		cDriver.findElement(By.id("loginBtn")).click();
		Thread.sleep(9000);
		cDriver.findElement(By.id("Email")).click();
		cDriver.findElement(By.id("Email")).sendKeys("sitaram@gmail.com");
		Thread.sleep(2000);
		cDriver.findElement(By.id("Password")).click();
		cDriver.findElement(By.id("Password")).sendKeys("Bharat@123");
		Thread.sleep(2000);
		cDriver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]")).click();
		Thread.sleep(3000);
		
		WebElement openMen = cDriver.findElement(By.xpath("//a[@id='men']"));
		//cDriver.findElement(By.xpath("//a[@id='men']")).click();
		Actions a = new Actions(cDriver);
		
		a.moveToElement(openMen).perform();
		cDriver.findElement(By.xpath("//a[@href='/sub-category/men-tshirt']")).click();
		Thread.sleep(2000);
		cDriver.findElement(By.xpath("//span[text()='puma']")).click();
		Thread.sleep(2000);
		cDriver.findElement(By.xpath("//span[text()='buy now']")).click();
		Thread.sleep(2000);
		cDriver.findElement(By.xpath("//span[text()='Add New Address']")).click();
		Thread.sleep(2000);
		cDriver.findElement(By.id("Home")).click();
		Thread.sleep(2000);
		cDriver.findElement(By.id("Name")).sendKeys("Ram");
		Thread.sleep(2000);
		cDriver.findElement(By.id("House/Office Info")).sendKeys("Raj Mahal");
		Thread.sleep(2000);
		cDriver.findElement(By.id("Street Info")).sendKeys("Kartavya Path");
		Thread.sleep(2000);
		cDriver.findElement(By.id("Landmark")).sendKeys("Near Sharayu River");
		Thread.sleep(2000);
		cDriver.findElement(By.id("Name")).sendKeys("Ram");
		Thread.sleep(2000);
		
		WebElement dropCountryEle = cDriver.findElement(By.id("Country"));
		
		Select dropCountry = new Select(dropCountryEle);
		dropCountry.selectByValue("India");	
		
		Thread.sleep(2000);
	
        WebElement dropStateEle = cDriver.findElement(By.id("State"));
		Select dropState = new Select(dropStateEle);
		dropState.selectByValue("Uttar Pradesh");
		
        Thread.sleep(2000);
		
        WebElement dropCityEle = cDriver.findElement(By.id("City"));
		Select dropCity = new Select(dropCityEle);
		dropCity.selectByValue("Ayodhya");
		
		Thread.sleep(2000);
		
		cDriver.findElement(By.id("Pincode")).sendKeys("224123");
		Thread.sleep(2000);
		cDriver.findElement(By.id("Phone Number")).sendKeys("9111111111");
		Thread.sleep(2000);
		cDriver.findElement(By.id("addAddress")).click();
		Thread.sleep(2000);
		cDriver.findElement(By.xpath("(//input[@name='address'])[2]")).click();
		Thread.sleep(2000);
		cDriver.findElement(By.xpath("//button[@class='selectaddress_proceed__Dh8xG']")).click();
		Thread.sleep(2000);
		
		
		
				
		
		
		

	}

}

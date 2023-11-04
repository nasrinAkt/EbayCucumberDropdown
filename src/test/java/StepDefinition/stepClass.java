package StepDefinition;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepClass {
	WebDriver driver;
	@Given("^open ebay application$")
	public void open_ebay_application() throws Throwable {
	
		System.setProperty("Webdriver.chrome.driver","C:\\chrome driver\\chrome-win64\\chrome.exe");
		ChromeOptions run = new ChromeOptions();
		run.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
			
	}

	@Then("^select DollsBears from dropdown$")
	public void select_DollsBears_from_dropdown() throws Throwable {
		
		Select sl = new Select(driver.findElement(By.id("gh-cat")));
		//sl.selectByVisibleText("Dolls & Bears");
		//sl.selectByValue("237");
		sl.selectByIndex(14);
		
		Thread.sleep(2000);
	    
	}

	@Then("^click search$")
	public void click_search() throws Throwable {
	WebElement drop  = driver.findElement(By.id("gh-btn"));
	drop.click();
	Thread.sleep(2000);
	driver.close();
	
	}
	@Then("^select Cameras & Photo from dropdown$")
	public void select_Cameras_Photo_from_dropdown() throws Throwable {
	  Select sl = new Select(driver.findElement(By.id("gh-cat")));
	  sl.selectByVisibleText("Cameras & Photo");
	  Thread.sleep(2000);
		
		
	}

	@Then("^click on search$")
	public void click_on_search() throws Throwable {
	
		WebElement sear = driver.findElement(By.id("gh-btn"));
		
		sear.click();
		
		driver.close();
	}

	@Then("^print select option$")
	public void print_select_option() throws Throwable {
	    
		/*List<WebElement> total =driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		//System.out.println(total.size());
		int a = total.size();
		System.out.println(a);
		total.get(a-2).click(); */
		
		List<WebElement> r = driver.findElements(By.tagName("option"));
		System.out.println(r.size());
        
		//for(int i = 35; i>=0; i= i-2) {
		//System.out.println(r.get(i).getAccessibleName());	
		//System.out.println(r.get(i).getText());
		
		r.get(r.size()-3).click(); 
		
		WebElement cl = driver.findElement(By.id("gh-btn"));
		cl.click();
		
		Thread.sleep(2000);
		
		
		driver.close();
			
		}

@Then("^select Baby from dropdown$")
public void select_Baby_from_dropdown() throws Throwable {
  
	Select sl = new Select(driver.findElement(By.id("gh-cat")));
	sl.selectByVisibleText("Baby");
	//sl.selectByValue("2984");
	Thread.sleep(2000);
	
	
}

@Then("^click on search button$")
public void click_on_search_button() throws Throwable {
    WebElement run = driver.findElement(By.id("gh-btn"));
    run.click();
    Thread.sleep(1000);
	
	
}
@Then("^Verify user in baby page$")
public void verify_user_in_baby_page() throws Throwable {
  boolean tr = driver.findElement(By.xpath("//span[text()='Baby Essentials']")).isDisplayed();
	Assert.assertTrue(tr);
	Thread.sleep(2000);
	driver.close();
	
}

	
	}




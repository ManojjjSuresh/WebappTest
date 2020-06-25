package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	
	WebDriver driver;
	
	@Given("^Login screen of whatsapp web application is displayed$")
	 	public void login_screen_of_whatsapp_web_application_is_displayed() throws InterruptedException 
	 	{
		System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(4000);
	 	}

	@When("^User opens whatsapp web application in a new tab$")
	    public void user_opens_whatsapp_web_application_in_a_new_tab() throws InterruptedException
	    {
		driver.navigate().to("https://web.whatsapp.com/");
		Thread.sleep(5000);
	    }
		
	    

	@And("^Switches back to previous tab$")
	    public void switches_back_to_previous_tab() throws InterruptedException
	    {
		driver.navigate().back();
		Thread.sleep(4000);
	    }
		
		
		
	@Then("^A popup with the message 'Whatsapp is open in another window. Click \"([^\"]*)\" to use WhatsApp in this window' should be displayed with 'CLOSE' & 'USE HERE' options $")
	    public void a_popup_with_the_message_whatsapp_is_open_in_another_window_click_something_to_use_whatsapp_in_this_window_should_be_displayed_with_close_use_here_options()
	    {
		WebElement text = driver.findElement(By.className("_9a59P"));
		System.out.println(text);
		driver.quit();
	    }
}

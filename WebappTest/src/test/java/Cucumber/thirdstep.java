package Cucumber;

import org.openqa.selenium.WebDriver;

public class thirdstep {
	
	WebDriver driver;
	
	 @Given("^A popup with the message ' Whatsapp is open in another window. Click \"([^\"]*)\" to use WhatsApp in this window' and options 'CLOSE' & 'USE HERE' is displayed$")
	    public void a_popup_with_the_message_whatsapp_is_open_in_another_window_click_something_to_use_whatsapp_in_this_window_and_options_close_use_here_is_displayed(String strArg1) throws Throwable {
	        throw new PendingException();
	    }

	    @When("^User clicks on 'CLOSE' option$")
	    public void user_clicks_on_close_option() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^‘Whatsapp\.com’ page should get loaded$")
	    public void whatsappcom_page_should_get_loaded() throws Throwable {
	        throw new PendingException();
	    }


}

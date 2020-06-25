package Cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class secondstep {
	WebDriver driver;

    @Given("^A popup with the message ' Whatsapp is open in another window. Click \"([^\"]*)\" to use WhatsApp in this window' and options 'CLOSE' & 'USE HERE' is displayed$")
    public void a_popup_with_the_message_whatsapp_is_open_in_another_window_click_something_to_use_whatsapp_in_this_window_and_options_close_use_here_is_displayed(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @When("^User clicks on 'USE HERE' option$")
    public void user_clicks_on_use_here_option() throws Throwable {
        throw new PendingException();
    }

    @Then("^Login page of whatsapp should get loaded$")
    public void login_page_of_whatsapp_should_get_loaded() throws Throwable {
        throw new PendingException();
    }

    @And("^In the previous tab, popup with message  'Whatsapp is open in another window. Click \"([^\"]*)\" to use WhatsApp in this window' and options 'CLOSE' & 'USE HERE' should be displayed $")
    public void in_the_previous_tab_popup_with_message_whatsapp_is_open_in_another_window_click_something_to_use_whatsapp_in_this_window_and_options_close_use_here_should_be_displayed(String strArg1) throws Throwable {
        throw new PendingException();
    }
	
	
	

}

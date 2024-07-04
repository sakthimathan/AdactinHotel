package stepDefinition;

import PageObjectManager.Page_Obect_Manager;
import io.cucumber.java.en.Then;

public class CancelBooking {
	Page_Obect_Manager pom = new Page_Obect_Manager();
	
	@Then("click mylitenary button and select the order id click the cancel button")
	public void click_mylitenary_button_and_select_the_order_id_click_the_cancel_button() {
		pom.getCancelBooking_hotel().cancelbooking();

	}
	@Then("click ok confirmation alert and click logout button")
	public void click_ok_confirmation_alert_and_click_logout_button() {
	
		pom.getCancelBooking_hotel().logout();

	}

}

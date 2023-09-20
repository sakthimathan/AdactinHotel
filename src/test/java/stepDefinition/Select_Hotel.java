package stepDefinition;

import PageObjectManager.Page_Obect_Manager;
import io.cucumber.java.en.Then;

public class Select_Hotel {
	Page_Obect_Manager pom = new Page_Obect_Manager();

	@Then("select the hotel")
	public void select_the_hotel() {
		pom.getSelect_hotel().selecthotel();
	}

	@Then("click the continue button")
	public void click_the_continue_button() {
		pom.getSelect_hotel().selectclick();
	}

}

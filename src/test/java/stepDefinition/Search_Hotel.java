package stepDefinition;

import PageObjectManager.Page_Obect_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Search_Hotel {
	Page_Obect_Manager pom=new Page_Obect_Manager();

	@Given("user search the hotel following depends {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_search_the_hotel_following_depends(String Location, String Hotels, String Roomtype, String NoOfRooms,
			String Checkin, String Checkout, String AdultsperRoom, String ChilderPerRoom) {
		pom.getSearch_Hotel().searchhotel(Location, Hotels, Roomtype, NoOfRooms, Checkin, Checkout, AdultsperRoom, ChilderPerRoom);

	}

	@When("user click the Search Button")
	public void user_click_the_search_button() {
		pom.getSearch_Hotel().clickbrtn();
	}

}

package stepDefinition;

import PageObjectManager.Page_Obect_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class First_page {
	Page_Obect_Manager pom=new Page_Obect_Manager();

	@Given("user should perform login with {string} and {string}")
	public void user_should_perform_login_with_and(String username, String password) {
		pom.getloginPage().loginhotel(username, password);

	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		System.out.println("ok");
	}

}

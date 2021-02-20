package com.stepdef;

import com.page.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	HomePage page;
	
	@Given("user is on main page")
	public void user_is_on_main_page() {
		page=new HomePage();
	    
	}
	@When("user clicks on shop menu")
	public void user_clicks_on_shop_menu() {
	    page.clickShop();
	}
	@When("user clicks on home menu")
	public void user_clicks_on_home_menu() {
	    page.clickhome();
	}
	
	@Then("user is on first slide")
	public void user_is_on_first_slide() {
	    page.firstSlide();
	}
	@Then("user is on second slide")
	public void user_is_on_second_slide() {
	    page.secondSlide();
	}
	@Then("user is on third slide")
	public void user_is_on_third_slide() {
	    page.thirdSlide();
	}

	@Then("user click on first arrival")
	public void user_click_on_first_arrival() {
		page.firstArrival();
	}
	@Then("move back")
	public void move_back() {
	   page.moveBack();
	}
	@Then("user click on second arrival")
	public void user_click_on_second_arrival() {
	   page.secondArrival(); 
	}
	@Then("user click on third arrival")
	public void user_click_on_third_arrival() {
	   page.thirdArrival();
	}

	@Then("user is on arrivals")
	public void user_is_on_arrivals() {
	    page.showArrival();
	}
	
	@When("user clicks on first arrival")
	public void user_clicks_on_first_arrival() {
		page.firstArrival();
	}
	@Then("again user add that into basket")
	public void again_user_add_that_into_basket() {
		page.addToBasket();
	}
	
	@Then("user click on description")
	public void user_click_on_description() {
	    page.desCription();
	}

	@Then("user click on reviews")
	public void user_click_on_reviews() {
	    page.reViews();;
	}

}
package com.nba.stepdefinition;
import java.util.List;

import com.nba.objectrepository.Customer;
import com.nba.objectrepository.Homepage;
import com.nba.resourses.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucustepdefinition extends Base{
	Homepage Hp=new Homepage();
	Customer Tc=new Customer();
	@Given("User enter enter into page")
	public void user_enter_enter_into_page() {
		Hp.getAdd().click();	
	   }

	@When("User click Add customer and its goes to next page")
	public void user_click_Add_customer_and_its_goes_to_next_page(io.cucumber.datatable.DataTable dataTable){
		List<String> md = dataTable.asList();
		toFill(Tc.getFn(),md.get(0));
		toFill(Tc.getLn(),md.get(1));
		toFill(Tc.getMail(),md.get(2));
		toFill(Tc.getAddress(),md.get(3));
		toFill(Tc.getPhno(),md.get(4));
	}

	@When("User Fill the Page and submit")
	public void user_Fill_the_Page_and_submit() {
		Tc.getBtn1().click();
	    }

	@Then("User navigates into next Page")
	public void user_navigates_into_next_Page() {
		System.out.println("successfully");
	    	}

	@Given("User in Home page")
	public void user_in_Home_page() {
		Hp.getAdd().click();
		
	    }

	@When("User wants to click Add customer field")
	public void user_wants_to_click_Add_customer_field() {
		Tc.getBtn1().click();
	    }

	@When("User Fills all the field and click submit{string},{string},{string},{string},{string}")
	public void user_Fills_all_the_field_and_click_submit(String nm1, String nm2, String nm3, String nm4, String nm5) {
toFill(Tc.getFn(), nm1);
toFill(Tc.getLn(), nm2);
toFill(Tc.getMail(), nm3);
toFill(Tc.getAddress(), nm4);
toFill(Tc.getPhno(), nm5);
	    }

	@Then("User See in next Page")
	public void user_See_in_next_Page() {
		System.out.println("Successfully Customer in Homepage");
	    }

}

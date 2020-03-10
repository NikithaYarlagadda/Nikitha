package com.cts.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.cts.base.LaunchWebBrowser;
import com.cts.pages.DashboardPageJBA;
import com.cts.pages.HomepageJBA;
import com.cts.pages.LoginPageJBA;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefn {
	private WebDriver driver;

	@Given("I have a browser with jain book agency")
	public void i_have_a_browser_with_jain_book_agency() {
		LaunchWebBrowser.setUp();
		this.driver=LaunchWebBrowser.driver;
	}

	@When("click on the category by the name of the category")
	public void click_on_the_category_by_the_name_of_the_category() throws InterruptedException{
		LoginPageJBA.loginDetails(driver, "karanammahesh321@gmail.com", "Mahesh1234");
	   DashboardPageJBA.categoryDetails(driver);
	}

	@Then("I get the books by the searched category")
	public void i_get_the_books_by_the_searched_category() {
		
	   driver.close();
	}

	
	@When("I enter the title of the book as {string}")
	public void i_enter_the_title_of_the_book_as(String string) throws InterruptedException {
		LoginPageJBA.loginDetails(driver, "karanammahesh321@gmail.com", "Mahesh1234");
		DashboardPageJBA.categoryDetails(driver);
		HomepageJBA.sortDetails(driver,string);
	
	}

	@Then("I get the book by the title given")
	public void i_get_the_book_by_the_title_given() {
	    driver.close();
	}

	@When("I click on the sort by option by the required sorting method as {string}")
	public void i_click_on_the_sort_by_option_by_the_required_sorting_method_as(String string) throws InterruptedException {
		LoginPageJBA.loginDetails(driver, "karanammahesh321@gmail.com", "Mahesh1234");
		DashboardPageJBA.categoryDetails(driver);
		HomepageJBA.sortDetails(driver,string);
	   // HomepageJBA.sortDetails(driver,string);
	}

	@Then("I get the books by the given sorting method")
	public void i_get_the_books_by_the_given_sorting_method() {
	driver.close();    
	}

	@When("I click on the View By option by the required View By method as {string}")
	public void i_click_on_the_View_By_option_by_the_required_View_By_method_as(String string) throws InterruptedException {
		LoginPageJBA.loginDetails(driver, "karanammahesh321@gmail.com", "Mahesh1234");
		DashboardPageJBA.categoryDetails(driver);
	    HomepageJBA.sortDetails(driver, string);
	}

	@Then("I get the books by the given View By method")
	public void i_get_the_books_by_the_given_View_By_method() {
		driver.close();
	}

	@When("I click on the logout option")
	public void i_click_on_the_logout_option() throws InterruptedException {
		LoginPageJBA.loginDetails(driver, "karanammahesh321@gmail.com", "Mahesh1234");
		DashboardPageJBA.categoryDetails(driver);
	    LoginPageJBA.logoutdetails(driver);
	    
	}

	@Then("I shoulf=d be able to logout of the account")
	public void i_shoulf_d_be_able_to_logout_of_the_account() {
	    driver.close();
	}


}
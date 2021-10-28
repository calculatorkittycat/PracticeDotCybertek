package com.practice.step_definitions;

import com.practice.pages.ChallengingDom;
import com.practice.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class Definitions {

//    Scenario: A/B Testing                      
//    Given you are at practice.cybertekschool.com 
//    Then you navigate to A/B Testing             
//    Then verify the header says "No A/B Test"    



    @Given("you are at practice.cybertekschool.com")
    public void you_are_at_practice_cybertekschool_com() {
        Driver.getDriver().get("http://practice.cybertekschool.com/");
    }
    @Then("you navigate to A B Testing")
    public void you_navigate_to_a_b_testing() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify the header says {string}")
    public void verify_the_header_says(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


//    Scenario: Add/Remove Elements      
//    Given you are at practice.cybertekschool.com 
//    Then you navigate to Add/Remove Elements     
//    When you click Add Element                   
//    Then Delete button should appear             
//    When you click Delete button                 
//    Then Delete button should dissapear          
    


    @Then("you navigate to Add Remove Elements")
    public void you_navigate_to_add_remove_elements() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("you click Add Element")
    public void you_click_add_element() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Delete button should appear")
    public void delete_button_should_appear() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("you click Delete button")
    public void you_click_delete_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Delete button should dissapear")
    public void delete_button_should_dissapear() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


//    Scenario: Autocomplete  
//    Given you are at practice.cybertekschool.com                              
//    Then you navigate to Autocomplete                                         
//    When you enter "Aus"                                                      
//    Then you should see "Australia" and Austria in the dropdown               
//    When you click "Australia" it should appear in the text input field       
//    When you click submit "You selected: Australia" should appear on the page 
    


    @Then("you navigate to Autocomplete")
    public void you_navigate_to_autocomplete() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("you enter {string}")
    public void you_enter(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("you should see {string} and {string} in the dropdown")
    public void you_should_see_and_austria_in_the_dropdown(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("you click {string} it should appear in the text input field")
    public void you_click_it_should_appear_in_the_text_input_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("you click submit {string} should appear on the page")
    public void you_click_submit_should_appear_on_the_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

//    Scenario: Basic Auth
//    Given you are at practice.cybertekschool.com
//    Then you navigate to Basic Auth
//    When you enter "admin" as user name and password
//    And you click Sign In
//    Then you should see "Congratulations! You must have the proper credentials. " on the next page




    @Then("you navigate to Basic Auth")
    public void you_navigate_to_basic_auth() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("you enter {string} as user name and password")
    public void you_enter_as_user_name_and_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("you click Sign In")
    public void you_click_sign_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("you should see {string} on the next page")
    public void you_should_see_on_the_next_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


//    Scenario: Broken Images
//    Given you are at practice.cybertekschool.com
//    Then you navigate to Broken Images
//    Then verify image 1 is broken
//    Then verify image 2 is broken
//    Then verify image 3 is not broken




    @Then("you navigate to Broken Images")
    public void you_navigate_to_broken_images() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify image {int} is broken")
    public void verify_image_is_broken(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify image {int} is not broken")
    public void verify_image_is_not_broken(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


//    Scenario: Challenging DOM
//    Given you are at practice.cybertekschool.com
//    Then navigate to Challenging DOM
//    Then verify the table




    @Then("navigate to Challenging DOM")
    public void navigate_to_challenging_dom() {
    Driver.getDriver().navigate().to("http://practice.cybertekschool.com/challenging_dom");
    }
    @Then("verify the table")
    public void verify_the_table(List<Map<String,String>> table) {
        System.out.println(table);
        new ChallengingDom().getRowMapFromTable();
    }

}

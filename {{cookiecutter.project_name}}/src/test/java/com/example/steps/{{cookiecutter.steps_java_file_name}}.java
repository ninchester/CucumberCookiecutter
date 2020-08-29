package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class {{cookiecutter.steps_java_file_name}} {

    @Given("User is logged in")
    public void user_is_logged_in() {
        System.out.println("User is logged in");
    }

    @Given("User has {int} USD on their account")
    public void user_has_usd_on_their_account(Integer int1) {
        System.out.println("User has {int} USD on their account");
    }
    @When("User withdraws {int} USD")
    public void user_withdraws_usd(Integer int1) {
        System.out.println("User withdraws {int} USD");
    }
    @Then("User should have {int} USD on their account")
    public void user_should_have_usd_on_their_account(Integer int1) {
        System.out.println("User should have {int} USD on their account");
    }

}

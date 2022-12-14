package com.krafttech.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {

    @When("At first get the text of dashboard")
    public void atFirstGetTheTextOfDashboard() {
        System.out.println("Dashboard");
    }

    @Then("go to Developers menu and get the text of Developer")
    public void goToDevelopersMenuAndGetTheTextOfDeveloper() {
        System.out.println("Developer");
    }


    @When("Get the text of dashboard")
    public void getTheTextOfDashboard() {
        System.out.println("Dashboard");

    }

    @Then("go to Edit Profile menu and get the text of Edit User Profile")
    public void goToEditProfileMenuAndGetTheTextOfEditUserProfile() {
        System.out.println("User Profile");

    }

    @Then("go to My Profile menu and get the text of Edit User Profile")
    public void goToMyProfileMenuAndGetTheTextOfEditUserProfile() {
        System.out.println("My Profile");
    }
}

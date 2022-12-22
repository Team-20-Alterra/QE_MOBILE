package com.example.steps;

import com.example.app.page.AuthLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthLoginSteps {
    AuthLoginPage loginPage = new AuthLoginPage();

    @When("input {string} email, {string} password")
    public void inputEmailPassword(String email, String pass) {
        loginPage.setInEmail(email);
        loginPage.setInPass(pass);
    }

    @And("click {string} see pass login")
    public void clickSeePassLogin(String seePass) {
        switch (seePass){
            case "see":
                loginPage.setEyePassLogin();
                break;
            case "no see":
                break;
        }
    }

    @And("click button masuk")
    public void clickButtonMasuk() {
        loginPage.clckButtonMasuk();
    }

    @Then("I get {string} result login")
    public void iGetResultLogin(String result) {
        switch (result){
            case "can login":
                loginPage.setHome();
                break;
            case "error email":
                loginPage.setErrEmail();
                break;
            case "error pass":
                loginPage.setErrPass();
                break;
        }
    }
}

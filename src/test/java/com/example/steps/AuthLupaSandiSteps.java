package com.example.steps;

import com.example.app.page.AuthLoginPage;
import com.example.app.page.AuthLupaSandiPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthLupaSandiSteps {
    AuthLupaSandiPage lupaSandiPage = new AuthLupaSandiPage();
    AuthLoginPage loginPage = new AuthLoginPage();

    @When("input {string} email")
    public void inputEmail(String email) {
        loginPage.setInEmail(email);
    }

    @And("click lupa pass")
    public void clickLupaPass() {
        lupaSandiPage.clckLupaSandi();
    }

    @And("I get pop up lupa pass")
    public void iGetPopUpLupaPass() {
        lupaSandiPage.setFieldPopUp();
    }

    @Then("input {string} email lupa")
    public void inputEmailLupa(String email) {
        loginPage.setInEmail(email);
    }

    @And("click {string} action lupa sandi")
    public void clickActionLupaSandi(String action) {
        switch (action){
            case "kirim":
                lupaSandiPage.setFieldKirim();
                break;
            case "batal":
                lupaSandiPage.setFieldBatal();
                break;
        }
    }



}

package com.example.steps;

import com.example.app.page.auth.LoginPage;
import com.example.app.page.auth.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthSteps {
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @Given("i open app")
    public void iOpenApp() {
        registerPage.seeLandpage1();
    }

    @And("i am on the login page")
    public void iAmOnTheLoginPage() {
        registerPage.seeNext();
        registerPage.seeNext();
        registerPage.mulai();
    }

    @And("i click link buat sekarang")
    public void iClickLinkBuatSekarang() {
        registerPage.clckRegis();
    }

    @When("I input {string} fullname, {string} telp, {string} email, dan {string} pass")
    public void iInputFullnameTelpEmailDanPass(String fullname, String notelp, String email, String pass) {
        registerPage.inputData(fullname,notelp,email,pass);
    }

    @And("click ckls syarat")
    public void clickCklsSyarat() {
        registerPage.cklsSyarat();
    }

    @And("click buat akun")
    public void clickBuatAkun() {
        registerPage.clckButtonRegis();
    }

    @Then("I get {string} result")
    public void iGetResult(String result) {
        if(result == "can regis"){

        }
        else if(result == "cant regis"){
            registerPage.setErrFName();
        }
        else if (result == "error fullname"){
            registerPage.setErrFName();
        }
        else if (result == "error notelp"){
            registerPage.setErrNoTelp();
        }
        else if (result == "error email"){
            registerPage.setErrEmail();
        }
        else if (result == "error pass"){
            registerPage.setErrPass();
        }
    }

    @When("input {string} email, {string} password")
    public void inputEmailPassword(String email, String pass) {
        loginPage.setInEmail(email);
        loginPage.setInPass(pass);
    }

    @And("click button masuk")
    public void clickButtonMasuk() {
        loginPage.clckButtonMasuk();
    }

    @Then("i can login")
    public void iCanLogin() {
    }


}

package com.example.steps;

import com.example.app.page.auth.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class AuthSteps {
    LoginPage loginPage = new LoginPage();

    @Given("i open app")
    public void iOpenApp() {
        loginPage.seeLandpage1();
    }

    @And("i am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.seeNext();
        loginPage.seeNext();
        loginPage.mulai();
    }

    @And("i click link buat sekarang")
    public void iClickLinkBuatSekarang() {
        loginPage.clckRegis();
    }

    @When("I input {string} fullname, {string} telp, {string} email, dan {string} pass")
    public void iInputFullnameTelpEmailDanPass(String nama, String notelp, String email, String pass) {
        loginPage.inputData(nama,notelp,email,pass);
    }

    @And("click buat akun")
    public void clickBuatAkun() {
    }

    @Then("I get {string} result")
    public void iGetResult(String result) {
        if(result == "can regis"){
            
        }
        else if(result == "cant regis"){
            loginPage.setErrFName();
        }
        else if (result == "error fullname"){
            loginPage.setErrFName();
        }
        else if (result == "error notelp"){
            loginPage.setErrNoTelp();
        }
        else if (result == "error email"){
            loginPage.setErrEmail();
        }
        else if (result == "error pass"){
            loginPage.setErrPass();
        }
    }

    @Given("i open the app")
    public void iOpenTheApp() {
    }

    @When("input {string} email, {string} password")
    public void inputEmailPassword(String email, String pass) {
    }

    @And("click button masuk")
    public void clickButtonMasuk() {
    }

    @Then("i can login")
    public void iCanLogin() {
    }

}

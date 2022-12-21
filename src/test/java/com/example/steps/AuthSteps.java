package com.example.steps;

import com.example.app.page.AuthLoginPage;
import com.example.app.page.AuthRegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthSteps {
    AuthRegisterPage registerPage = new AuthRegisterPage();
    AuthLoginPage loginPage = new AuthLoginPage();

    @Given("i open app")
    public void iOpenApp() {
        registerPage.seeLandpage1();
        registerPage.seeNext1();
        registerPage.seeNext2();
        registerPage.mulai();
    }

    @And("i am on the login page")
    public void iAmOnTheLoginPage() {
        registerPage.setLogin();
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
        switch (result){
            case "can regis":
                registerPage.setLogin();
                break;
            case "can login" :
                loginPage.setHome();
                break;
            case "cant regis":
                registerPage.setErrFName();
                break;
            case "error fullname":
                registerPage.setErrFName();
                break;
            case "error notelp":
                registerPage.setErrNoTelp();
                break;
            case "error email":
                registerPage.setErrEmail();
                break;
            case "error pass":
                registerPage.setErrPass();
                break;
        }
    }

    @When("input {string} email, {string} password")
    public void inputEmailPassword(String email, String pass) {
        loginPage.setInEmail(email);
        loginPage.setInPass(pass);
    }

    @And("click {string} see pass")
    public void clickSeePass(String seeEye) {
        switch (seeEye){
            case "see" :
                registerPage.setEyePass();
                break;
            case "no see":
                break;
        }
    }

    @And("click button masuk")
    public void clickButtonMasuk() {
        loginPage.clckButtonMasuk();
    }

}

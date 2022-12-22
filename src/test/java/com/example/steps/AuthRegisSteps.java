package com.example.steps;

import com.example.app.page.AuthRegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthRegisSteps {
    AuthRegisterPage registerPage = new AuthRegisterPage();

    @Given("i open app")
    public void iOpenApp() {
        registerPage.seeGinap();
        registerPage.seeNext1();
//        registerPage.setSeeLandPg2();
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

    @And("click {string} see pass register")
    public void clickSeePassRegister(String eyePass) {
        switch (eyePass) {
            case "see":
                registerPage.setEyePass();
                break;
            case "no see":
                break;
        }
    }

    @And("click {string} ckls syarat")
    public void clickCklsSyarat(String syrt) {
        switch (syrt){
            case "ckls":
                registerPage.cklsSyarat();
                break;
            case "no ckls":
                break;
        }
    }

    @And("click buat akun")
    public void clickBuatAkun() {
        registerPage.clckButtonRegis();
    }

    @Then("I get {string} result register")
    public void iGetResultRegister(String result) {
        switch (result){
            case "can regis":
                registerPage.setSuccesLogin();
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
            case "error regis":
                registerPage.errRegis();
                break;
        }
    }
}

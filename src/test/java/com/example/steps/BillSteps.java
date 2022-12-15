package com.example.steps;

import com.example.app.page.auth.LoginPage;
import com.example.app.page.auth.RegisterPage;
import com.example.app.page.bill.BillPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillSteps {
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    BillPage billPage = new BillPage();

    @Given("i haved login")
    public void iHavedLogin() {

    }

    @When("click button bill")
    public void clickButtonBill() {
    }

    @And("on the Transaksi page")
    public void onTheTransaksiPage() {
    }

    @Then("i see all transaksi")
    public void iSeeAllTransaksi() {
    }

    @And("filtered status Gagal")
    public void filteredStatusGagal() {
    }

    @Then("see status Gagal")
    public void seeStatusGagal() {
    }

    @And("filtered status Dalam Proses")
    public void filteredStatusDalamProses() {
    }

    @Then("see status Dalam Proses")
    public void seeStatusDalamProses() {
    }

    @And("filtered status Menunggu Konfirmasi")
    public void filteredStatusMenungguKonfirmasi() {
    }

    @Then("see status Menunggu Konfirmasi")
    public void seeStatusMenungguKonfirmasi() {
    }

    @And("on the Selesai page")
    public void onTheSelesaiPage() {
    }

    @Then("see all transaksi Berhasil")
    public void seeAllTransaksiBerhasil() {
    }
}

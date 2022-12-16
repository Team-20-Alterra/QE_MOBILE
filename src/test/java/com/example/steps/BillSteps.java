package com.example.steps;

import com.example.app.page.AuthLoginPage;
import com.example.app.page.AuthRegisterPage;
import com.example.app.page.BillPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillSteps {
    AuthRegisterPage registerPage = new AuthRegisterPage();
    AuthLoginPage loginPage = new AuthLoginPage();
    BillPage billPage = new BillPage();

    @Given("i haved login")
    public void iHavedLogin() {
        registerPage.seeLandpage1();
        registerPage.seeNext();
        registerPage.seeNext();
        registerPage.mulai();
        loginPage.setInEmail("");
        loginPage.setInPass("");;
        loginPage.clckButtonMasuk();
    }

    @When("click button bill")
    public void clickButtonBill() {
        billPage.clckButtonBill();
    }

    @And("on the Transaksi page")
    public void onTheTransaksiPage() {
        billPage.setTabTransaksi();
    }

    @Then("i see all transaksi")
    public void iSeeAllTransaksi() {
        billPage.setSeeAllTransak();
    }

    @And("filtered status Gagal")
    public void filteredStatusGagal() {
        billPage.setClckFilter();
        billPage.setFilterGagal();
    }

    @Then("see status Gagal")
    public void seeStatusGagal() {
        billPage.setSeeStatusGagal();
    }

    @And("filtered status Dalam Proses")
    public void filteredStatusDalamProses() {
        billPage.setClckFilter();
        billPage.setFilterDalamProses();
    }

    @Then("see status Dalam Proses")
    public void seeStatusDalamProses() {
        billPage.setSeeStatusDlmProses();
    }

    @And("filtered status Menunggu Konfirmasi")
    public void filteredStatusMenungguKonfirmasi() {
        billPage.setClckFilter();
        billPage.setFilterMenunggu();
    }

    @Then("see status Menunggu Konfirmasi")
    public void seeStatusMenungguKonfirmasi() {
        billPage.setSeeStatusMnungguKonfrm();
    }

    @And("on the Selesai page")
    public void onTheSelesaiPage() {
        billPage.setTabSelesai();
    }

    @Then("see all transaksi Berhasil")
    public void seeAllTransaksiBerhasil() {
        billPage.setSeeStatusBerhasil();
    }
}

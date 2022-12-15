package com.example.steps;

import com.example.app.page.PayBankPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PayBankSteps {
    PayBankPage payBankPage = new PayBankPage();

    @When("click status Menunggu Konfirmasi")
    public void clickStatusMenungguKonfirmasi() {
        payBankPage.setStatusMenunggu();
    }

    @And("click button pay now")
    public void clickButtonPayNow() {
        payBankPage.setButtonPay();
    }

    @And("click button Yakin")
    public void clickButtonYakin() {
        payBankPage.setButtonYakin();
    }

    @And("click button Rekening Bank")
    public void clickButtonRekeningBank() {
        payBankPage.setButtonBank();
    }

    @And("click opsi BNI")
    public void clickOpsiBNI() {
        payBankPage.setButtonBNI();
    }

    @And("click button lanjutkan")
    public void clickButtonLanjutkan() {
        payBankPage.clckNextpay();
    }

    @And("click kirim bukti bayar")
    public void clickKirimBuktiBayar(String img) {
        payBankPage.setSendBukti(img);
    }

    @And("click button kirim")
    public void clickButtonKirim() {
        payBankPage.clckButtonKirim();
    }

    @Then("see Pembayaran Berhasil")
    public void seePembayaranBerhasil() {
        payBankPage.seePaySuccess();
    }

    @And("click download invoice")
    public void clickDownloadInvoice() {
        payBankPage.clckDownloadInvoice();
    }

    @And("click opsi BRI")
    public void clickOpsiBRI() {
        payBankPage.setButtonBRI();
    }

    @And("click opsi BCA")
    public void clickOpsiBCA() {
        payBankPage.setButtonBCA();
    }

    @And("click opsi Mandiri")
    public void clickOpsiMandiri() {
        payBankPage.setButtonMandiri();
    }

    @And("click opsi BSI")
    public void clickOpsiBSI() {
        payBankPage.setButtonBSI();
    }

    @And("click opsi Jenius")
    public void clickOpsiJenius() {
        payBankPage.setButtonJenius();
    }

    @And("click opsi CIMB")
    public void clickOpsiCIMB() {
        payBankPage.setButtonCIMB();
    }
}

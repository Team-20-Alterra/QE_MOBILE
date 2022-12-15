package com.example.steps;

import com.example.app.page.pay.PayVAPage;
import io.cucumber.java.en.And;

public class PayVaSteps {
    PayVAPage payVAPage = new PayVAPage();

    @And("click button Virtual Akun")
    public void clickButtonVirtualAkun() {
        payVAPage.setButtonVA();
    }

    @And("click opsi BNI VA")
    public void clickOpsiBNIVA() {
        payVAPage.setBniVa();
    }

    @And("click opsi BCA VA")
    public void clickOpsiBCAVA() {
        payVAPage.setBcaVa();
    }

    @And("click opsi BRI VA")
    public void clickOpsiBRIVA() {
        payVAPage.setBriVa();
    }

    @And("click opsi Mandiri VA")
    public void clickOpsiMandiriVA() {
        payVAPage.setMandiriVa();
    }

    @And("click opsi CIMB VA")
    public void clickOpsiCIMBVA() {
        payVAPage.setCimbVa();
    }

}

package com.example.app.page;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class PayBankPage extends BasePageObject {

    private By statusMenunggu = MobileBy.AccessibilityId("");
    private By buttonPay = MobileBy.AccessibilityId("");
    private By buttonYakin = MobileBy.AccessibilityId("");
    private By buttonBank = MobileBy.AccessibilityId("");
    private By buttonBNI = MobileBy.AccessibilityId("");
    private By buttonBRI = MobileBy.AccessibilityId("");
    private By buttonBCA = MobileBy.AccessibilityId("");
    private By buttonMandiri = MobileBy.AccessibilityId("");
    private By buttonBSI = MobileBy.AccessibilityId("");
    private By buttonJenius = MobileBy.AccessibilityId("");
    private By buttonCIMB = MobileBy.AccessibilityId("");
    private By nextPayRek = MobileBy.AccessibilityId("");
    private By sendBukti = MobileBy.AccessibilityId("");
    private By buttonKirimRek = MobileBy.AccessibilityId("");
    private By paySuccess = MobileBy.AccessibilityId("");
    private By downloadInvoice = MobileBy.AccessibilityId("");

    public void setStatusMenunggu(){
        isDisplayed(statusMenunggu);
        click(statusMenunggu);
    }
    public void setButtonPay(){
        click(buttonPay);
    }
    public void setButtonYakin(){
        click(buttonYakin);
    }
    public void setButtonBank(){click(buttonBank);}
    public void setButtonBNI(){click(buttonBNI);}
    public void setButtonBRI(){click(buttonBRI);}
    public void setButtonBCA(){click(buttonBCA);}
    public void setButtonMandiri(){click(buttonMandiri);}
    public void setButtonBSI(){click(buttonBSI);}
    public void setButtonJenius(){click(buttonJenius);}
    public void setButtonCIMB(){click(buttonCIMB);}
    public void clckNextpay(){click(nextPayRek);}
    public void setSendBukti(String jpg){
        click(sendBukti);
    }
    public void clckButtonKirim(){click(buttonKirimRek);}
    public void seePaySuccess(){isDisplayed(paySuccess);}
    public void clckDownloadInvoice(){click(downloadInvoice);}

}

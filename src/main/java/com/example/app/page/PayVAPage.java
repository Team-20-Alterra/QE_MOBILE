package com.example.app.page;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class PayVAPage extends BasePageObject {

    private By buttonVA = MobileBy.AccessibilityId("");
    private By bniVa = MobileBy.AccessibilityId("");
    private By bcaVa = MobileBy.AccessibilityId("");
    private By briVa = MobileBy.AccessibilityId("");
    private By mandiriVa = MobileBy.AccessibilityId("");
    private By cimbVa = MobileBy.AccessibilityId("");

    public void setButtonVA(){click(buttonVA);}
    public void setBniVa(){click(bniVa);}
    public void setBcaVa(){click(bcaVa);}
    public void setBriVa(){click(briVa);}
    public void setMandiriVa(){click(mandiriVa);}
    public void setCimbVa(){click(cimbVa);}

}
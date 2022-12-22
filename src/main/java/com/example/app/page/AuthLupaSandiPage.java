package com.example.app.page;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AuthLupaSandiPage extends BasePageObject {

    private By fieldLupaSandi = MobileBy.AccessibilityId("Lupa kata sandi?");
    private By fieldPopUp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View");
    private By fieldKirim = By.xpath("//android.widget.Button[@content-desc=\"Kirim\"]");
    private By fieldBatal = By.xpath("//android.widget.Button[@content-desc=\"Batal\"]");

    public void clckLupaSandi(){
        click(fieldLupaSandi);
    }
    public void setFieldPopUp(){isDisplayed(fieldPopUp);}
    public void setFieldKirim(){click(fieldKirim);}
    public void setFieldBatal(){click(fieldBatal);}

}

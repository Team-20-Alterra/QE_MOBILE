package com.example.app.page.auth;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {
    private By inEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    private By inPass = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    private By butMasuk = MobileBy.AccessibilityId("Masuk");

    public void setInEmail(String email){
        click(inEmail);
        inputText(inEmail, email);
    }
    public void setInPass(String pass){
        click(inPass);
        inputText(inPass, pass);
    }
    public void clckButtonMasuk(){
        click(butMasuk);
    }

}
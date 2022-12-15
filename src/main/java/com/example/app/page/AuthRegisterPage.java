package com.example.app.page;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AuthRegisterPage extends BasePageObject {

    private By landpage1 = MobileBy.AccessibilityId("Ginap");
    private By landpageLnjt = MobileBy.AccessibilityId("Lanjut");
    private By mulaiBut = MobileBy.AccessibilityId("Mulai");
    private By linkRegis = MobileBy.AccessibilityId("Buat Sekarang");
    private By inFullName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]\n");
    private By inNoTelp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]\n");
    private By inEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]\n");
    private By inPass = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[4]\n");
    private By errFName = MobileBy.AccessibilityId("Enter at least 4 characters");
    private By errNoTelp = MobileBy.AccessibilityId("Enter min. 8 digit");
    private By errEmail = MobileBy.AccessibilityId("Enter a valid email");
    private By errPass = MobileBy.AccessibilityId("Enter min. 5 characters");
    private By chcklst = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
    private By buatAkunButton = By.xpath("//android.widget.Button[@content-desc=\"Buat Akun\"]");

    public void seeLandpage1(){
        isDisplayed(landpage1);
    }
    public void seeNext(){
        click(landpageLnjt);
    }
    public void mulai(){
        click(mulaiBut);
    }
    public void clckRegis(){
        click(linkRegis);
    }
    public void inputData(String fullname, String notelp, String email, String pass){
        click(inFullName);
        inputText(inFullName, fullname);
        click(inNoTelp);
        inputText(inNoTelp, notelp);
        click(inEmail);
        inputText(inEmail, email);
        click(inPass);
        inputText(inPass, pass);
    }
    public void cklsSyarat(){
        click(chcklst);
    }
    public void setErrFName(){
        isDisplayed(errFName);
    }
    public void setErrNoTelp(){
        isDisplayed(errNoTelp);
    }
    public void setErrEmail(){
        isDisplayed(errEmail);
    }
    public void setErrPass(){
        isDisplayed(errPass);
    }
    public void clckButtonRegis(){
        click(buatAkunButton);
    }


}

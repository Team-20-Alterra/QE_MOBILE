package com.example.app.page;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import java.util.Random;

public class AuthRegisterPage extends BasePageObject {

    private By landpage1 = MobileBy.AccessibilityId("Ginap");
    private By landpageLnjt1 = MobileBy.AccessibilityId("Lanjut");
    private By landpageLnjt2 = MobileBy.AccessibilityId("Lanjut");
    private By mulaiBut = MobileBy.AccessibilityId("Mulai");
    private By login = MobileBy.AccessibilityId("LOGIN");
    private By linkRegis = MobileBy.AccessibilityId("Buat Sekarang");
    private By inFullName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    private By inNoTelp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
    private By inEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]");
    private By inPass = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]");
    private By errFName = MobileBy.AccessibilityId("Enter at least 4 characters");
    private By errNoTelp = MobileBy.AccessibilityId("Enter min. 8 digit");
    private By errEmail = MobileBy.AccessibilityId("Enter a valid email");
    private By errPass = MobileBy.AccessibilityId("Enter min. 5 characters");
    private By eyePass = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]/android.widget.Button");
    private By chcklst = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]");
    private By buatAkunButton = By.xpath("//android.widget.Button[@content-desc=\"Buat Akun\"]");

    public void seeLandpage1(){
        isDisplayed(landpage1);
    }
    public void seeNext1(){
        click(landpageLnjt1);
    }
    public void seeNext2(){click(landpageLnjt2);}
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
    public void setLogin(){isDisplayed(login);}
    public void setEyePass(){click(eyePass);}
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

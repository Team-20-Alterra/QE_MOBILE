package com.example.app.page;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class StatusPayPage extends BasePageObject {

    private By buttonBill = MobileBy.AccessibilityId("Bill Tab 2 of 3");
    private By tabTransaksi = MobileBy.AccessibilityId("Transaksi Tab 1 of 2");
    private By tabSelesai = MobileBy.AccessibilityId("Selesai Tab 2 of 2");
    private By seeAllTransak = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View");
    private By clckFilter = MobileBy.AccessibilityId("");
    private By filterGagal = MobileBy.AccessibilityId("");
    private By filterDalamProses = MobileBy.AccessibilityId("");
    private By filterMenunggu = MobileBy.AccessibilityId("");
    private By seeStatusGagal = MobileBy.AccessibilityId("");
    private By seeStatusDlmProses = MobileBy.AccessibilityId("");
    private By seeStatusMnungguKonfrm = MobileBy.AccessibilityId("");
    private By seeStatusBerhasil = MobileBy.AccessibilityId("");

    public void clckButtonBill(){click(buttonBill);}
    public void setTabTransaksi(){click(tabTransaksi);}
    public void setTabSelesai(){click(tabSelesai);}
    public void setSeeAllTransak(){isDisplayed(seeAllTransak);}
    public void setClckFilter(){click(clckFilter);}
    public void setFilterGagal(){click(filterGagal);}
    public void setFilterDalamProses(){click(filterDalamProses);}
    public void setFilterMenunggu(){click(filterMenunggu);}
    public void setSeeStatusGagal(){isDisplayed(seeStatusGagal);}
    public void setSeeStatusDlmProses(){isDisplayed(seeStatusDlmProses);}
    public void setSeeStatusMnungguKonfrm(){isDisplayed(seeStatusMnungguKonfrm);}
    public void setSeeStatusBerhasil(){isDisplayed(seeStatusBerhasil);}

}

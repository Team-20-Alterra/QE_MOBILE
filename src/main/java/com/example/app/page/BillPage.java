package com.example.app.page;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class BillPage extends BasePageObject {

    private By buttonBill = MobileBy.AccessibilityId("");
    private By tabTransaksi = MobileBy.AccessibilityId("");
    private By tabSelesai = MobileBy.AccessibilityId("");
    private By seeAllTransak = MobileBy.AccessibilityId("");
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

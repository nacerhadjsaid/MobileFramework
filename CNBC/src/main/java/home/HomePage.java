package home;

import base.MobileAPI;

public class HomePage extends MobileAPI {
    public void clickOnWatch(){
        clickByXpath("//*[@resource-id='com.zumobi.msnbc:id/bottom_nav_watch']");
    }
    public void clickOnLive(){
        clickByXpath("//*[@resource-id='com.zumobi.msnbc:id/bottom_nav_live']");
    }
    public void clickOnDiscover(){
        clickByXpath("//*[@resource-id='com.zumobi.msnbc:id/bottom_nav_discover']");
    }
    public void clickOnProfile(){
        clickByXpath("//*[@resource-id='com.zumobi.msnbc:id/bottom_nav_profile']");
    }
}

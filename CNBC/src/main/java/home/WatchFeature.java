package home;

import base.MobileAPI;

public class WatchFeature extends MobileAPI{
    public void clickOnWatch(){
        clickByXpath("//*[@resource-id='com.zumobi.msnbc:id/bottom_nav_watch']");
    }
    public void swipeArticle(){
        for(int i=0; i<5; i++){
            clickByXpath("//*[@resource-id='com.zumobi.msnbc:id/playlists']/android.widget.LinearLayout[3]");
        }
    }
    public void clickOnArticle(){
        //scroll_to_exact("Trump administration lifts Russian sanctions despite unpopular rebuke");
        clickByXpath("//*[@resource-id='com.zumobi.msnbc:id/itemview_icon']");
    }
}

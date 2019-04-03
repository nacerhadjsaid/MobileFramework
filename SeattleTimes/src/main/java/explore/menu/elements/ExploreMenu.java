package explore.menu.elements;

import base.MobileAPI;

public class ExploreMenu extends MobileAPI {

    public void clickOnHumberger(){
        clickByXpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    }
    public void clickOnMyReadingList(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[1]");
    }
    public void clickOnLocalNews(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[2]/android.widget.TextView");
    }
    public void navigateBack(){
        clickByXpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    }
    public void clickOnAllLocalNews(){
        clickOnText("All Local News");
    }
    public void clickOnLocalPolitics(){
        clickOnText("Local Politics");
    }
    public void clickOnTrafficLab(){
        clickOnText("Traffic Lab");
    }
    public void clickOnProjectHomeless(){
        clickOnText("Project Homeless");
    }
    public void clickOnCrime(){
        clickOnText("Crime");
    }
    public void clickOnEducation(){
        clickOnText("Education");
    }
    public void clickOnEducationLab(){
        clickOnText("Education Lab");
    }
    public void clickOnEastSide(){
        clickOnText("Eastside");
    }
    public void clickOnHealth(){
        clickOnText("Health");
    }
    public void clickOnData(){
        clickOnText("Data");
    }
    public void clickOnNorthWest(){
        clickOnText("Northwest");
    }
    public void clickOnTimesWatchDog(){
        clickOnText("Times Watchdog");
    }

    public void clickOnBusinessTech(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[3]");
    }
    public void clickOnSports(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[4]");
    }
    public void clickOnNationalWorld(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[5]");
    }
    public void clickOnOpinion(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[6]");
    }
    public void clickOnEntertainment(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[7]");
    }
    public void clickOnLife(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[8]");
    }
    public void clickOnPNWMagazine(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[9]");
    }
}

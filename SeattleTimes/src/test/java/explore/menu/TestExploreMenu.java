package explore.menu;

import explore.menu.elements.ExploreMenu;
import org.testng.annotations.Test;

public class TestExploreMenu extends ExploreMenu{

    @Test
    public void test1(){
        clickOnHumberger();
        clickOnMyReadingList();
    }
    @Test
    public void test2(){
        clickOnHumberger();
        clickOnLocalNews();
        clickOnAllLocalNews();
        navigateBack();

        clickOnHumberger();
        clickOnLocalNews();
        clickOnLocalPolitics();
        navigateBack();

        clickOnHumberger();
        clickOnLocalNews();
        clickOnTrafficLab();
        navigateBack();

        clickOnHumberger();
        clickOnLocalNews();
        clickOnProjectHomeless();
        navigateBack();

        clickOnHumberger();
        clickOnLocalNews();
        clickOnCrime();
        navigateBack();

        clickOnHumberger();
        clickOnLocalNews();
        clickOnEducation();
        navigateBack();

        clickOnHumberger();
        clickOnLocalNews();
        clickOnEducationLab();
        navigateBack();

        clickOnHumberger();
        clickOnLocalNews();
        clickOnEastSide();
        navigateBack();

        clickOnHumberger();
        clickOnLocalNews();
        clickOnHealth();
        navigateBack();

        clickOnHumberger();
        clickOnLocalNews();
        clickOnData();
        navigateBack();

        clickOnHumberger();
        clickOnLocalNews();
        clickOnNorthWest();
        navigateBack();

        clickOnHumberger();
        clickOnLocalNews();
        clickOnTimesWatchDog();
        navigateBack();
    }
    @Test
    public void test3(){
        clickOnHumberger();
        clickOnBusinessTech();}
    @Test
    public void test4(){
        clickOnHumberger();
        clickOnSports();}
    @Test
    public void test5(){
        clickOnHumberger();
        clickOnNationalWorld();}
    @Test
    public void test6(){
        clickOnHumberger();
        clickOnOpinion();}
    @Test
    public void test7(){
        clickOnHumberger();
        clickOnEntertainment();}
    @Test
    public void test8(){
        clickOnHumberger();
        clickOnLife();}
    @Test
    public void test9(){
        clickOnHumberger();
        clickOnPNWMagazine();}
}

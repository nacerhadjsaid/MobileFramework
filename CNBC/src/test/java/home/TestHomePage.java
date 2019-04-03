package home;

import org.testng.annotations.Test;

public class TestHomePage extends HomePage{
    @Test
    public void test(){
        clickOnWatch();
        clickOnLive();
        clickOnDiscover();
        clickOnProfile();
    }
}

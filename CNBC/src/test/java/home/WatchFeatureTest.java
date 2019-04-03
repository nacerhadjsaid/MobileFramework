package home;

import org.testng.annotations.Test;

public class WatchFeatureTest extends WatchFeature {
    @Test
    public void test(){
        clickOnWatch();
        swipeArticle();
        clickOnArticle();

    }
}

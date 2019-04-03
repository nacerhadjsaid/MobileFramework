package pages;

import base.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UiHome extends MobileAPI {
    public void clickBtns(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"AX error -25205\"])[2]");
//        WebElement btns = ad.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"AX error -25205\"])[2]"));
//        btns.click();
        sleepFor(2);
    }
}

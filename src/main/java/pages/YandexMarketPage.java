package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.YandexMainSteps;

public class YandexMarketPage extends YandexMainPage {

    public YandexMarketPage(){
        PageFactory.initElements(YandexMainSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@data-zone-name,'menu')]")
    WebElement tabsMarketMenu;
    public void mainMarketTabClick(String itemName){
        tabsMarketMenu.findElement(By.xpath("//*[contains(text(),'"+itemName+"')]")).click();;
    }
}

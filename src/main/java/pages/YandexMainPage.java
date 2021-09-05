package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.YandexMainSteps;

public class YandexMainPage {

    public YandexMainPage(){
        PageFactory.initElements(YandexMainSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@class,'services-new__content')]")
    WebElement yandexStartMenu;

    public void startPageButtonClick(String itemName){
        yandexStartMenu.findElement(By.xpath("//*[contains(text(),'"+itemName+"')]")).click();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.YandexMainSteps;

import static org.junit.Assert.assertEquals;

public class YandexElectroPage {

    public YandexElectroPage() {
        PageFactory.initElements(YandexMainSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@data-apiary-widget-name,'@MarketNode/CatalogHeader')]")
    WebElement catalogHead;

    public void checkHead(String itemName){
        Wait<WebDriver> wait = new WebDriverWait(YandexMainSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(catalogHead));
        assertEquals(itemName,catalogHead.findElement((By.xpath("//h1[contains(text(),'"+itemName+"')]"))).getText());
    }

    @FindBy(xpath = "//div[contains(@data-apiary-widget-name,'@MarketNode/NavigationTree')]")
    WebElement catalogItems;
    public void clickCatalogItem(String itemName){
        catalogItems.findElement(By.xpath("//li//a[contains(text(),'"+itemName+"')]")).click();}

}

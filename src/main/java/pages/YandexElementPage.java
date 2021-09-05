package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.YandexMainSteps;

public class YandexElementPage {
    public YandexElementPage() {
        PageFactory.initElements(YandexMainSteps.getDriver(), this);
    }

   /* @FindBy(xpath = "//div[contains(@data-apiary-widget-name,'@MarketNode/SearchHeadline')]")
    WebElement elementHead;

    public void checkHead(String itemName){
        Wait<WebDriver> wait = new WebDriverWait(YandexMainSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(elementHead));
        assertEquals(itemName,elementHead.findElement((By.xpath("//h1[contains(text(),'"+itemName+"')]"))).getText());
    }*/

    @FindBy(xpath = "//div[contains(@data-zone-name,'all-filters-button')]")
    WebElement allFiltersButton;
    public void allFiltersButtonClick(){
        allFiltersButton.click();
    }

}

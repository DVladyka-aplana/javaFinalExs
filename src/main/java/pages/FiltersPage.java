package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.YandexMainSteps;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FiltersPage {
    public FiltersPage() {
        PageFactory.initElements(YandexMainSteps.getDriver(), this);
    }

    @FindBy(xpath = "//section[contains(@data-zone-name,'all-filters-page')]")
    WebElement elementHead;
    public void checkHead(String itemName){
        Wait<WebDriver> wait = new WebDriverWait(YandexMainSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(elementHead));
        assertEquals(itemName,elementHead.findElement((By.xpath("//h1[contains(text(),'"+itemName+"')]"))).getText());
    }

    @FindBy(xpath = "//div[contains(@data-filter-id,'glprice')]//div[contains(@data-prefix,'от')]//input[contains(@type,'text')]")
    WebElement priceFilter;
    public void setPriceFrom(String valPriseFrom) throws InterruptedException {
        priceFilter.click();
        priceFilter.clear();
        Thread.sleep(1000);
        priceFilter.sendKeys(valPriseFrom);
    }
    @FindBy(xpath = "//h4[contains(text(),'Производитель')]")
    WebElement brendFilter;
    @FindBy(xpath = "//div[contains(@data-filter-id,'7893318')]")
    WebElement checkBox;
    public void setCheckBox(String textVal) throws InterruptedException {
        Wait<WebDriver> wait = new WebDriverWait(YandexMainSteps.getDriver(), 15, 1000);
        wait.until(ExpectedConditions.visibilityOf(brendFilter));
        priceFilter.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(3000);
        YandexMainSteps.getDriver().findElement((By.xpath("//div[contains(@data-filter-id, '7893318')]//input[contains(@class, '_34OG2')]"))).clear();
        YandexMainSteps.getDriver().findElement((By.xpath("//div[contains(@data-filter-id, '7893318')]//input[contains(@class, '_34OG2')]"))).click();
        YandexMainSteps.getDriver().findElement((By.xpath("//div[contains(@data-filter-id, '7893318')]//input[contains(@class, '_34OG2')]"))).sendKeys(textVal);
        YandexMainSteps.getDriver().findElement((By.xpath("//div[contains(@data-filter-id,'7893318')]//div[contains(text(),'"+textVal+"')]"))).click();
    }

    @FindBy(xpath = "//a[contains(text(),'Показать')]")
    WebElement okFilterButton;
    public void setOkFilterButton(){
        okFilterButton.click();
    }
    @FindBy(xpath = "//article[contains(@data-autotest-id,'product-snippet')]")
    WebElement elementsOnPage;
    public void checkNum(int expVal){
    List<WebElement> list = YandexMainSteps.getDriver().findElements((By.xpath("//article[contains(@data-autotest-id,'product-snippet')]")));
    assertEquals(expVal, list.size());
    }
    @FindBy(xpath = "//input[contains(@placeholder,'Искать товары')]")
    WebElement findMarket;

    public void checkFirstElement() throws InterruptedException {
        String firstText = YandexMainSteps.getDriver().findElement((By.xpath("//article[contains(@data-autotest-id,'product-snippet')]//h3//a[1]"))).getAttribute("title");
        findMarket.clear();
        findMarket.click();
        findMarket.sendKeys(firstText);
        YandexMainSteps.getDriver().findElement((By.xpath("//span[contains(text(),'Найти')]"))).click();
        Thread.sleep(1000);
        Wait<WebDriver> wait = new WebDriverWait(YandexMainSteps.getDriver(), 15, 1000);
        wait.until(ExpectedConditions.visibilityOf(YandexMainSteps.getDriver().findElement(By.xpath("//article[contains(@data-autotest-id,'product-snippet')][1]"))));
        String secondText = YandexMainSteps.getDriver().findElement((By.xpath("//article[contains(@data-autotest-id,'product-snippet')]//h3//a[1]"))).getAttribute("title");
        assertEquals(firstText, secondText);
    }

}

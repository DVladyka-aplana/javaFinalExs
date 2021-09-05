package steps;

import io.qameta.allure.Step;
import pages.YandexMarketPage;

public class YandexMarketSteps {
    @Step("На панели нажать кнопку: {0}")
    public void stepSelectMarketMainMenu(String itemName){
        new YandexMarketPage().mainMarketTabClick(itemName);
    }
}

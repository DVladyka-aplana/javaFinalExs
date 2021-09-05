package steps;

import io.qameta.allure.Step;
import pages.YandexElectroPage;

public class YandexElectroSteps {

    @Step("Проверить заголовок каталога: {0}")
    public void stepCheckHeadCatalog(String itemName){
        new YandexElectroPage().checkHead(itemName);
    }

    @Step("Выбрать элемент каталога: {0}")
    public void clickCatalogItem(String itemName){
        new YandexElectroPage().clickCatalogItem(itemName);
    }
}

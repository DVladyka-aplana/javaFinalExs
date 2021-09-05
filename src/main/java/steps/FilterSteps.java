package steps;

import io.qameta.allure.Step;
import pages.FiltersPage;

public class FilterSteps {
    @Step("Проверить что открылись фильтры: {0}")
    public void stepCheckHeadFilters(String itemName) {
        new FiltersPage().checkHead(itemName);
    }
    @Step("Цена от: {0}")
    public void setPriceFrom(String valPrice) throws InterruptedException {
        new FiltersPage().setPriceFrom(valPrice);
    }
    @Step("Фильтр по производителю: {0}")
    public void setСheckBox(String valName) throws InterruptedException {
        new FiltersPage().setCheckBox(valName);
    }
    @Step("Применить фильтр")
    public void setFilterButtonOk() {
        new FiltersPage().setOkFilterButton();
    }
    @Step("Проверить, количество элементов на странице: {0}")
    public void checkSum(int expVal) {
        new FiltersPage().checkNum(expVal);
    }
    @Step("проверить первый элемент")
    public void checkFirst() throws InterruptedException {
        new FiltersPage().checkFirstElement();
    }
}

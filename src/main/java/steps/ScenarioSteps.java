package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioSteps {
    YandexMainSteps yandexMainSteps = new YandexMainSteps();
    YandexMarketSteps yandexMarketSteps = new YandexMarketSteps();
    YandexElectroSteps yandexElectroSteps = new YandexElectroSteps();
    YandexElementSteps yandexElementSteps = new YandexElementSteps();
    FilterSteps filterSteps = new FilterSteps();
    @When("^на главной странице выбран раздел \"(.+)\"$")
    public void selectMainMenuItem(String itemName){
        yandexMainSteps.stepSelectYandexMainMenu(itemName);
    }
    @When("^Переключить вкладку")
    public void changePage(){
        yandexMainSteps.changePage();
    }

    @Then("^на странице Маркета выбрана категория \"(.+)\"$")
    public void selectMarketMenuItem(String itemName){
        yandexMarketSteps.stepSelectMarketMainMenu(itemName);
    }

    @When("^проверен заголовок каталога: \"(.+)\"$")
    public void checkCatalogName(String itemName){
        yandexElectroSteps.stepCheckHeadCatalog(itemName);
    }
    @Then("^выбрать элемент из каталога \"(.+)\"$")
    public void selectCatalogItem(String itemName){
        yandexElectroSteps.clickCatalogItem(itemName);
    }

    @Then("^нажать на кнопку Все фильтры")
    public void clickAllFilters(){yandexElementSteps.clickAllFiltersButton();}
    @When("^проверен заголовок фильтрации \"(.+)\"$")
    public void checkCatalogElementItem(String itemName){
        filterSteps.stepCheckHeadFilters(itemName);
    }
    @Then("^Заполнить фильтр - Цена от: \"(.+)\"$")
    public void setPriceFrom(String valuePrice) throws InterruptedException {
        filterSteps.setPriceFrom(valuePrice);
    }
    @Then("^Чек бокс - фильтр по производителю: \"(.+)\"$")
    public void setCheckBox(String valBox) throws InterruptedException {
        filterSteps.setСheckBox(valBox);
    }
    @Then("^Применить фильтр")
    public void setOkButtonFilter() {
        filterSteps.setFilterButtonOk();
    }
    @When("^Проверить, количество элементов на странице: \"(.+)\"$")
    public void checkSum(int expVal) {
        filterSteps.checkSum(expVal);
    }
    @Then("Проверить первый элемент")
    public void checkFirst() throws InterruptedException {
        filterSteps.checkFirst();
    }
}

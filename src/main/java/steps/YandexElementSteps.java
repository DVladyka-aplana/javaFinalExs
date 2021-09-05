package steps;

import io.qameta.allure.Step;
import pages.YandexElementPage;

public class YandexElementSteps {
    /*@Step("Проверить заголовок выбранной категории: {0}")
    public void stepCheckHeadCategory(String itemName){
        new YandexElementPage().checkHead(itemName);
    }*/
    @Step("Нажать на кнопку: Все фильтры")
    public void clickAllFiltersButton(){
        new YandexElementPage().allFiltersButtonClick();}

}

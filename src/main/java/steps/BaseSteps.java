package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.ElementsOfPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BaseSteps extends ElementsOfPage {

    @Step(value = "Найти поле поиска на странице и ввести в него название товара")
    public static void enterProductNameToSearchLine(String text) {
        $(searchLineSelector).sendKeys(text);
        $(searchButtonSelector).click();
    }

    @Step(value = "Выбрать первый товар из списка и кликнуть по нему, чтобы перейти на страницу товара")
    public static String goToFirstProductPage(int indexOfProduct) {
        SelenideElement product = $$(listOfGoodsInProductCardSelector).get(indexOfProduct);
        String title = product.getAttribute("title");
        product.click();

        return title;
    }

    @Step(value = "Проверить, что товар добавился в корзину")
    public static void checkAddingProductToBasket(int indexOfProduct, String titleOfProduct) {
        $$(listOfGoodsInBasketSelector).get(indexOfProduct).shouldHave(Condition.attribute("title", titleOfProduct));
    }

    @Step(value = "Нажать на кнопку")
    public static void clickButton(By path) {
        $(path).click();
    }
}
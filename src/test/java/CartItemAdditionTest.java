import config.ConfigSetup;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static pages.ElementsOfPage.buttonAddToBasketSelector;
import static pages.ElementsOfPage.buttonGoToBasketSelector;
import static steps.BaseSteps.*;

public class CartItemAdditionTest implements ConfigSetup {

    @Test
    @DisplayName("Добавление товара в корзину")
    @Description("Поиск товара по наменованию и добавление его в корзину")
    public void addProductToBasket() {
        String keys = "холодильник";
        enterProductNameToSearchLine(keys);

        int indexOfProduct = 0;
        String titleOfProduct = goToFirstProductPage(indexOfProduct);

        clickButton(buttonAddToBasketSelector);

        clickButton(buttonGoToBasketSelector);

        checkAddingProductToBasket(indexOfProduct, titleOfProduct);
    }
}
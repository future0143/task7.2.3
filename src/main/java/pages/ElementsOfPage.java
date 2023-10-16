package pages;

import org.openqa.selenium.By;

public class ElementsOfPage {

    public static By fieldForWaiting = By.cssSelector("div.main-page__banner.banner");
    public static By searchLineSelector = By.id("searchInput");
    public static By searchButtonSelector = By.xpath("//*[@id=\"applySearchBtn\"]");
    public static By listOfGoodsInProductCardSelector = By.className("product-card");
    public static By buttonAddToBasketSelector = By.cssSelector("button[data-link*='addToBasket']");
    public static By buttonGoToBasketSelector = By.linkText("Перейти в корзину");
    public static By listOfGoodsInBasketSelector = By.className("accordion__list");
}
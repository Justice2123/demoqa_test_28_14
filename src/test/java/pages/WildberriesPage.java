package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class WildberriesPage {

    private final SelenideElement
            searchInput = $("#searchInput"),
            productParamsTable = $(".product-params__table"),
            addItemToFavorites = $(".order__for-fixed",1),
            headerModalWindowSize = $(".popup__header"),
            basket = $(".j-item-basket"),
            basketTitle = $(".basket-empty__title"),
            loginPage = $(".j-main-login"),
            formMobileCodes = $(".form-block__dropdown"),
            menuMobileCode = $(".drop-select",4),
            mobileCode = $(".form-block__mask"),


    @Step("open page")
    public void openPage() {
        open("");
    }

    @Step("ставим курсор на поисковое поле")
    public WildberriesPage inputItem() {
        searchInput.click();
        return this;
    }

    @Step("вводим артикул {value}")
    public WildberriesPage enteringItem(String value) {
        searchInput.setValue(value).pressEnter();
        return this;
    }

    @Step("проверка артикула на странице товара")
    public WildberriesPage checkItemNumber(String value) {
        productParamsTable.shouldHave(text(value)).click();
        return this;
    }

    @Step("добавляем товар в избранное")
    public WildberriesPage addItemFavorite(String value) {
        addItemToFavorites.shouldHave(text(value)).click();
        return this;
    }

    @Step("проверка заголовка в модальном окне размера")
    public WildberriesPage checkTitleModalWindowSize(String value) {
        headerModalWindowSize.shouldHave(text("Выберите размер"));
        return this;
    }

    @Step("переходим в Корзину")
    public WildberriesPage enterBasket() {
        basket.click();
        return this;
    }

    @Step("проверка Заголовка пустой корзины")
    public WildberriesPage checkBasketTitle(String value) {
        basketTitle.shouldHave(text(value));
        return this;
    }

    @Step("переходим на страницу Регистрации")
    public WildberriesPage login() {
        loginPage.click();
        return this;
    }

    @Step("открываем меню с кодами стран")
    public WildberriesPage openMenuMobileCode() {
        formMobileCodes.click();
        return this;
    }

    @Step("выбираем код")
    public WildberriesPage choosingMobileCode(String value) {
        menuMobileCode.find(byText(value)).click();
        return this;
    }

    @Step("проверям что в поле правильно отобразился нужный код страны")
    public WildberriesPage checkMobileCode(String value) {
        mobileCode.shouldHave(text(value));
        return this;
    }




}

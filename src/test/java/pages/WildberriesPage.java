package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.currentFrameUrl;


public class WildberriesPage {

    private final SelenideElement
            basket = $(".j-item-basket"),
            basketTitle = $(".basket-empty__title"),
            loginPage = $(".j-main-login"),
            formMobileCodes = $(".form-block__dropdown"),
            menuMobileCode = $(".drop-select", 4),
            mobileCode = $(".form-block__mask"),
            jobButton = $(".simple-menu__link--employment"),
            jobPageButton = $(byTagAndText("a", "Работа в Wildberries")),
            loginTitle = $(".sign-in-page__title");


    @Step("open page")
    public void openPage() {
        open("");
    }

    @Step("перейти в Корзину")
    public WildberriesPage enterBasket() {
        basket.click();
        return this;
    }

    @Step("проверка Заголовка пустой корзины")
    public WildberriesPage checkBasketTitle(String value) {
        basketTitle.shouldHave(text(value));
        return this;
    }

    @Step("переход на страницу Регистрации")
    public WildberriesPage login() {
        loginPage.click();
        return this;
    }

    @Step("открытие меню с кодами стран")
    public WildberriesPage openMenuMobileCode() {
        formMobileCodes.click();
        return this;
    }

    @Step("выбор кода")
    public WildberriesPage choosingMobileCode(String value) {
        menuMobileCode.find(byText(value)).click();
        return this;
    }

    @Step("проверка правильности отображения нужного кода страны")
    public WildberriesPage checkMobileCode(String value) {
        mobileCode.shouldHave(text(value));
        return this;
    }

    @Step("проверка кнопки 'Работа в Wildberries'")
    public WildberriesPage checkEmploymentButton() {
        jobButton.shouldBe(visible).click();
        return this;
    }

    @Step("Переход на страницу 'Работа в Wildberries'")
    public WildberriesPage jobPage() {
        jobPageButton.click();
        return this;
    }

    @Step("Проверка url")
    public WildberriesPage checkUrl(String value) {
        webdriver().shouldHave(currentFrameUrl(value));
        return this;
    }

    @Step("клик на кнопку 'Войти'")
    public WildberriesPage loginButton() {
        loginPage.click();
        return this;
    }

    @Step("Проверка заголовка окна авторизации")
    public WildberriesPage checkLoginTitle(String value) {
        loginTitle.shouldHave(text(value));
        return this;
    }

}

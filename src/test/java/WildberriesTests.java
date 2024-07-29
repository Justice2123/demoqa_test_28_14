import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class WildberriesTests {

    @Test

    void checkModalWindowWithSizesIfNoGoodsTest() {
        open("https://www.wildberries.ru/");
        $("#searchInput").click();
        $("#searchInput").setValue("163571936").pressEnter();
        $(".product-params__table").shouldHave(text("163571936"));
        $(".order__for-fixed", 1).shouldHave(text("В избранное")).click();
        $(".popup__header").shouldHave(text("Выберите размер"));
    }

    @Test

    void checkEmptyBasketTest () {
        open("https://www.wildberries.ru/");
        $(".j-item-basket").click();
        $(".basket-empty__title").shouldHave(text("В корзине пока пусто"));


    }


    @Test

    void checkCodeMobileTest () {

        Configuration.browserSize = ("1920x1080");
        open("https://www.wildberries.ru/");
        $(".j-main-login").click();
        $(".form-block__dropdown").click();
        $(".drop-select",4).find(byText("Киргизия +996")).click();
        $(".form-block__mask").shouldHave(text("+996 "));

    }


    @Test

    void checkButtonDeleteInBasketTest (){
        Configuration.browserSize = ("1920x1080");
        open("https://www.wildberries.ru/");
        $("#searchInput").click();
        $("#searchInput").setValue("тушь для ресниц").pressEnter();
        $(".j-card-item", 0).click();
        $(".order__for-fixed", 1).shouldHave(text("Добавить в корзину")).click();
        $(".j-item-basket").click();
        $(".j-basket-item-del").click();
        $(".basket-empty__title").shouldHave(text("В корзине пока пусто"));

    }

    @Test

    void checkSearchingResultsTitleTest () {
        Configuration.browserSize = ("1920x1080");
        open("https://www.wildberries.ru/");
        $("#searchInput").click();
        $("#searchInput").setValue("корм для кошек").pressEnter();
        $(".searching-results__title").shouldHave(text("корм для кошек"));
    }


}

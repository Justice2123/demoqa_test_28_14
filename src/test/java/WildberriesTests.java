import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import pages.WildberriesPage;

@Tag("wildberriesTest")

public class WildberriesTests extends TestBase {

    WildberriesPage wildberriesPage = new WildberriesPage();

//    @Test
//    @Tag("regression")
//    void checkModalWindowWithSizesIfNoGoodsTest() {
//        wildberriesPage.openPage();
//        wildberriesPage.inputItem();
//        wildberriesPage.enteringItem("163571936");
//        wildberriesPage.checkItemNumber("163571936");
//        wildberriesPage.addItemFavorite("В избранное");
//        wildberriesPage.checkTitleModalWindowSize("Выберите размер");
//    }

    @Test
    @Tag("smoke")
    void checkEmptyBasketTest() {
        wildberriesPage.openPage();
        wildberriesPage.enterBasket();
        wildberriesPage.checkBasketTitle("В корзине пока пусто");
    }


    @Test
    @Tag("smoke")
    void checkCodeMobileTest() {

        wildberriesPage.openPage();
        wildberriesPage.login();
        wildberriesPage.openMenuMobileCode();
        wildberriesPage.choosingMobileCode("Киргизия +996");
        wildberriesPage.checkMobileCode("+996 ");
    }


    @Test
    @Tag("smoke")
    void checkButtonDeleteInBasketTest() {
        wildberriesPage.openPage();
        wildberriesPage.inputItem();
        wildberriesPage.enteringItem("тушь для ресниц");
        wildberriesPage.firstCardItem();
        wildberriesPage.addItemFavorite("Добавить в корзину");
        wildberriesPage.enterBasket();
        wildberriesPage.deleteItemInBasket();
        wildberriesPage.checkBasketTitle("В корзине пока пусто");
    }

    @Test
    @Tag("regression")
    void checkSearchingResultsTitleTest() {
        wildberriesPage.openPage();
        wildberriesPage.inputItem();
        wildberriesPage.enteringItem("кухня");
        wildberriesPage.checkResultsTitle("кухня");
    }


    @Test
    @Tag("regression")
    void employmentButtonTest() {
        wildberriesPage.openPage();
        wildberriesPage.checkEmploymentButton();
    }



}

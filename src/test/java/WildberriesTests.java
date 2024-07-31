import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import pages.WildberriesPage;

@Tag("wildberriesTest")

public class WildberriesTests extends TestBase {

    WildberriesPage wildberriesPage = new WildberriesPage();


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
    @Tag("regression")
    void employmentButtonTest() {
        wildberriesPage.openPage();
        wildberriesPage.checkEmploymentButton();
    }

    @Test
    @Tag("smoke")
    void checkUrlWorkPage() {
        wildberriesPage.openPage();
        wildberriesPage.jobPage();
        wildberriesPage.checkUrl("https://www.wildberries.ru/services/trudoustroystvo");
    }

    @Test
    @Tag("smoke")
    void loginPageTest() {
        wildberriesPage.openPage();
        wildberriesPage.loginButton();
        wildberriesPage.checkLoginTitle("Войти или создать профиль");
    }


}

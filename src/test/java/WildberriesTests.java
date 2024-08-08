import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import pages.WildberriesPage;

@Tag("wildberriesTest")

public class WildberriesTests extends TestBase {

    WildberriesPage wildberriesPage = new WildberriesPage();

    @DisplayName("check title empty basket")
    @Test
    @Tag("smoke")
    void checkEmptyBasketTest() {
        wildberriesPage.openPage();
        wildberriesPage.enterBasket();
        wildberriesPage.checkBasketTitle("В корзине пока пусто");
    }

    @DisplayName("check mobile's code")
    @Test
    @Tag("smoke")
    void checkCodeMobileTest() {

        wildberriesPage.openPage();
        wildberriesPage.login();
        wildberriesPage.openMenuMobileCode();
        wildberriesPage.choosingMobileCode("Киргизия +996");
        wildberriesPage.checkMobileCode("+996 ");
    }

    @DisplayName("check employment button should be visible")
    @Test
    @Tag("regression")
    void employmentButtonTest() {
        wildberriesPage.openPage();
        wildberriesPage.checkEmploymentButton();
    }

    @DisplayName("check correct url on job page")
    @Test
    @Tag("smoke")
    void checkUrlWorkPageTest() {
        wildberriesPage.openPage();
        wildberriesPage.jobPage();
        wildberriesPage.checkUrl("https://www.wildberries.ru/services/trudoustroystvo");
    }

    @DisplayName("check title login page")
    @Test
    @Tag("smoke")
    void loginPageTest() {
        wildberriesPage.openPage();
        wildberriesPage.loginButton();
        wildberriesPage.checkLoginTitle("Войти или создать профиль");
    }


}

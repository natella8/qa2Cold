import Pages.BaseFunc;
import Pages.HomePage;
import org.junit.jupiter.api.Test;

public class PageObjectTest {

    private BaseFunc baseFunc = new BaseFunc();
    // kogda sozdaem kopiju,prinuditeljno otrabativaet konstruktor. proverim na teste-

    @Test
    public void poTest () {
   // otkrivaet pustuju stranicu  - otrabotal konstruktor. otkrivaet vse cto propisano v classe
        baseFunc.goToUrl("rus.delfi.lv");

        //sozdali kopiju
        HomePage homePage = new HomePage(baseFunc);

        //open first article





    }

}

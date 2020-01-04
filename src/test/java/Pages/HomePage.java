package Pages;
import org.openqa.selenium.By;
public class HomePage {
    //dlja togo ctobi kliknutj pozagolovku gl str

    private BaseFunc baseFunc;
    //sozdali pustuju peremennuju


    private final By TITLE = By.xpath(".//h1)contains(@class, 'geadline__title')]");

    //sozdaem konstuktor

    public HomePage (BaseFunc baseFunc){
        this.baseFunc = baseFunc;
        //this ispoljzuetsa dlja utochnenija kakjuju mi ispoljnzuem. v dannom sluchae ispoljzuem tu, kotoraja ispoljzuetdsa v klasse, a ne v metode.


    }
            public void openFirstArticle() {
        //Find elenent
                baseFunc.getElement(TITLE).click();

                // Click


            }
}

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public ChromeDriver driver;
    @Before                     //общее для всех тестов перед их запуском
    public void startTest(){
        driver = new ChromeDriver();
    }
    @Test
    public void firstTest(){

        driver.get("https://habr.com/ru/feed/");    // открывает страницу

        Assert.assertEquals("Публикации / Моя лента / Хабр", driver.getTitle()); // Проверка соответствия значения и title

        driver.quit();  //закрывает страницу
    }

    @Test
    public void secondTest(){

        driver.get("https://mail.ru");    // открывает страницу

        Assert.assertEquals("Mail.ru: почта, поиск, новости, прогноз погоды, гороскоп, программа передач", driver.getTitle()); // Проверка соответствия значения и title

        driver.quit();  //закрывает страницу
    }
}

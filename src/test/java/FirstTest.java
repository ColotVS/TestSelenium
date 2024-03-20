import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends WebDriverSettings{

    @Test
    public void firstTest(){

        driver.get("https://habr.com/ru/feed/");    // открывает страницу



        Assert.assertEquals("Публикации / Моя лента / Хабр", driver.getTitle()); // Проверка соответствия значения и title
    }

    @Test
    public void secondTest(){

        driver.get("https://mail.ru");    // открывает страницу

        Assert.assertEquals("Mail.ru: почта, поиск, новости, прогноз погоды, гороскоп, программа передач", driver.getTitle()); // Проверка соответствия значения и title
    }

}

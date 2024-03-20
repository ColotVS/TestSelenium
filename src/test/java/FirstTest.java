import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public ChromeDriver driver;
    static int i =0;
    @Before                     //Выполняется для всех тестов перед их запуском
    public void startTest(){
        driver = new ChromeDriver();
        i++;
        System.out.println("Start test:" + i);
    }
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

    @After                      //Выполняется для всех тестов после их завершения
    public void close(){
        driver.quit();  //закрывает страницу
        System.out.println("Stop test:" + i);
    }
}

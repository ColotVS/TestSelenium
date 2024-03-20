import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest(){
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://habr.com/ru/feed/");    // открывает страницу

        String title = driver.getTitle(); //Получить title страницы
        Assert.assertEquals("Публикации / Моя лента / Хабр", title); // Проверка соответствия значения и переменной

        driver.quit();  //закрывает страницу
    }
}

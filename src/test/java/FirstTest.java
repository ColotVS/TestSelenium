import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest(){
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://habr.com/ru/feed/");    // открывает страницу

        Assert.assertEquals("Публикации / Моя лента / Хабр", driver.getTitle()); // Проверка соответствия значения и title

        driver.quit();  //закрывает страницу
    }
}

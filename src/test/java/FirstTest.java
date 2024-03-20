import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstTest extends WebDriverSettings{

    @Test
    public void firstTest(){

        driver.get("https://habr.com/ru/feed/");    // открывает страницу

        Assert.assertEquals("Публикации / Моя лента / Хабр", driver.getTitle()); // Проверка соответствия значения и title

        WebElement input = driver.findElement(By.xpath("//button [@class='tm-header-user-menu__login btn btn_solid btn_small']")); //Находим кнопку войти на странице habr.com
        input.click();  //Нажимаем на элемент расположены по адресу xpath

        //WebElement input = driver.findElement(By.cssSelector());      поиск элемента по cssSelector

        //WebElement input = driver.findElement(By.className());        поиск элемента по атрибуту className

        //WebElement input = driver.findElement(By.id());               поиск элемента по атрибуту id (значение динамическое)

        //WebElement input = driver.findElement(By.linkText());         поиск элемента по тексту ссылки

        //WebElement input = driver.findElement(By.partialLinkText());  поиск элемента по тексту ссылки

        //WebElement input = driver.findElement(By.name);               поиск элемента по атрибуту name

        //WebElement input = driver.findElement(By.tagName());          поиск элемента по атрибуту tagName
    }

    @Test
    public void secondTest(){

        driver.get("https://mail.ru");    // открывает страницу

        Assert.assertEquals("Mail.ru: почта, поиск, новости, прогноз погоды, гороскоп, программа передач", driver.getTitle()); // Проверка соответствия значения и title

        WebElement input = driver.findElement(By.xpath("//button[@class='resplash-btn resplash-btn_primary resplash-btn_mailbox-big qopmkfo__b85yax']")); //Находим кнопку войти на странице mail.ru
        input.click();  //Нажимаем на элемент расположены по адресу xpath
    }

}

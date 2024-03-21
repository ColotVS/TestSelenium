import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTest extends WebDriverSettings{

    @Test
    public void firstTest(){

        driver.get("https://habr.com/ru/feed/");    // открывает страницу

        Assert.assertEquals("Публикации / Моя лента / Хабр", driver.getTitle()); // Проверка соответствия значения и title

        WebElement input = (new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button [@class='tm-header-user-menu__login btn btn_solid btn_small']"))));//Ожидаем появления элемента на странице, расположенного по адресу xpath.

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

    @Test
    public void thriedTest(){

        driver.get("https://github.com/");

        Assert.assertEquals("GitHub: Let’s build from here · GitHub",driver.getTitle());    // Проверка соответствия значения и title

        WebElement input = driver.findElement(By.xpath("//a[@class='HeaderMenu-link HeaderMenu-link--sign-in flex-shrink-0 no-underline d-block d-lg-inline-block border border-lg-0 rounded rounded-lg-0 p-2 p-lg-0']"));
        input.click();  //Нажимаем на элемент расположены по адресу xpath

        //Селекторы css:
        //$$("body") - поиск по тэгу
        //$$("#...") - поиск по id
        //$$(".class") - поиск по классу
        //$$("[atribute='main']" - поиск по любому атрибуту
        //$$("[atribute*='ai']" - поиск по любому атрибуту, частичное вхождение
        //$$("[atribute^='mai']" - поиск по любому атрибуту, первые буквы слова
        //$$("[atribute$='ain']" - поиск по любому атрибуту, последние буквы слова
        //$$("div[role]") - ищет все div в которых есть атрибут role
        //$$("div:not(...)") - поиск по тегу за исключение атрибутов указанных в скобках
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://habr.com/ru/feed/");

        WebElement input = driver.findElement(By.xpath(""));
        //Поиск xPath по относительному пути, через атрибут.
        input.click();
        input = driver.findElement(By.xpath(""));
        //Поиск xPath по блокам содержащим определённый текст
        input.click();
    }
}

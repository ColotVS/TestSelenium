import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/webhp?hl=ru&sa=X&ved=0ahUKEwjd8tnYxfqEAxWaFBAIHXzKATsQPAgJ");

        WebElement input = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        //Поиск xPath по относительному пути, через атрибут.
        input.click();
        input = driver.findElement(By.xpath("//a [contains(text(),'Картинки')]"));
        //Поиск xPath по блокам содержащим определённый текст
        input.click();
    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://karavantrans.ru/?yclid=11506914365063299071");
    }
}

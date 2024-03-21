import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;
    static int i =0;
    @Before                     //Выполняется для всех тестов перед их запуском
    public void startTest(){
        driver = new ChromeDriver();
        i++;
        System.out.println("Start test:" + i);
    }

    @After                      //Выполняется для всех тестов после их завершения
    public void close(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();  //закрывает страницу
        System.out.println("Stop test:" + i);
    }
}

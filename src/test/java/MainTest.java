import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D1%82%D0%B8&sca_esv=a6f2d24d067aab7e&ei=mV30ZdrlBp7BwPAPwoe_yAc&udm=&ved=0ahUKEwialsbJv_aEAxWeIBAIHcLDD3kQ4dUDCBA&uact=5&oq=%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D1%82%D0%B8&gs_lp=Egxnd3Mtd2l6LXNlcnAiDtCd0L7QstC-0YHRgtC4Mg4QABiABBixAxiDARjJAzILEAAYgAQYsQMYgwEyCBAAGIAEGJIDMggQABiABBiSAzILEAAYgAQYsQMYgwEyCxAAGIAEGLEDGIMBMgsQABiABBixAxiDATILEAAYgAQYsQMYgwEyCxAAGIAEGLEDGIMBMgsQABiABBixAxiDAUjuzQFQlixY-MkBcAZ4AZABAJgB8QGgAc4MqgEFMC45LjK4AQPIAQD4AQGYAhGgAtkNqAIUwgIKEAAYRxjWBBiwA8ICDRAAGIAEGIoFGEMYsAPCAhEQLhiDARjHARixAxjRAxiABMICBRAAGIAEwgIOEC4YgAQYsQMYxwEY0QPCAiAQLhiDARjHARixAxjRAxiABBiXBRjcBBjeBBjgBNgBA8ICCxAAGAEYgAQYChgqwgIJEAAYARiABBgKwgIHEAAYgAQYCsICEBAAGIAEGAoYsQMYgwEYsQPCAgUQLhiABMICCRAuGAEYgAQYCsICChAAGIAEGMkDGArCAgsQABiABBiKBRiSA8ICDxAuGAEYgAQYxwEYrwEYCsICExAAGIAEGIoFGEMY6gIYtALYAQHCAhYQABgDGI8BGOUCGOoCGLQCGIwD2AECwgIREC4YgAQYsQMYgwEYxwEY0QPCAggQLhiABBixA8ICDhAAGIAEGIoFGLEDGIMBmAMKiAYBkAYKugYECAEYB7oGBggCEAEYCroGBggDEAEYFJIHBTYuOS4yoAfJYA&sclient=gws-wiz-serp");

        WebElement input = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        //Поиск xPath по относительному пути, через атрибут.
        input.click();
    }
}

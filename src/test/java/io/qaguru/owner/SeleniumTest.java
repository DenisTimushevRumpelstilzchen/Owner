package io.qaguru.owner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {

    @Test
    public void testGithubTitle() {
        // настройка chrome driver
        WebDriverManager.chromedriver().setup();

        // конфигурация запуска
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com");

        // код выполнения теста
        String title = driver.getTitle();
        assertEquals(title, "GitHub: Where the world builds software · GitHub");
        driver.quit();
    }
}

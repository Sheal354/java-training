import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class SelenideExample {

    @BeforeClass
    void init() {
        Configuration.timeout = 100000;
    }

    @Test(enabled = true)
    public void test1() {
        open("https://www.simbirsoft.com/");
        $(By.cssSelector("a[href='/vacancies/']"))
                .shouldHave(text("Вакансии"))
                .click();
        $(By.xpath("//h1")).shouldHave(text("Вакансии"));
        webdriver().shouldHave(url("https://www.simbirsoft.com/vacancies/"));
        sleep(5000);
    }

    @Test
    public void test2() {
        open("https://www.simbirsoft.com/vacancies/");
        $x("//div[@class='list-tm-button' and contains(text(),'Показать еще')]").click();
        $x("//a[@data-name='SDET']").shouldBe(visible);
        sleep(5000);
    }
}

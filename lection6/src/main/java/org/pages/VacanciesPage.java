package org.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class VacanciesPage {

    @FindBy(xpath = "//div[contains(@class,'list-layout-more')]/child::div")
    private SelenideElement showMoreButton;

    @FindBy(xpath = "//a[@data-name='SDET']")
    private SelenideElement sdetButton;

    @Step("Проверить, что страница Вакансии открылась")
    public VacanciesPage vacanciesPageIsOpen() {
        $(By.xpath("//h1"))
                .shouldHave(text("Вакансии"))
                .shouldBe(visible);
        sleep(7000);
        return this;
    }

    @Step("Проверить, что кнопка Показать еще присутствует и кликабельна")
    public VacanciesPage showMoreInfo() {
        showMoreButton
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text(" Показать еще "))
                .click();
        sleep(7000);
        return this;
    }

    @Step("Проверить, что кнопка SDET присутствует и кликабельна")
    public VacanciesPage goToSdet() {
        sdetButton
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text(" SDET "))
                .click();
        sleep(7000);
        return this;
    }
}

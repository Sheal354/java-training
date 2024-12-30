package org.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Класс страницы "Вакансии".
 */
public class VacanciesPage {

    /**
     * Кнопка "Показать еще".
     */
    @FindBy(xpath = "//div[contains(@class,'list-layout-more')]/child::div")
    private SelenideElement showMoreButton;

    /**
     * Кнопка "SDET".
     */
    @FindBy(xpath = "//a[@data-name='SDET']")
    private SelenideElement sdetButton;

    /**
     * Проверяет, что что страница Вакансии открылась.
     * @return текущий экземпляр класса
     */
    @Step("Проверить, что страница Вакансии открылась")
    public VacanciesPage vacanciesPageIsOpen() {
        $(By.xpath("//h1"))
                .shouldHave(text("Вакансии"))
                .shouldBe(visible);
        sleep(7000);
        return this;
    }

    /**
     * Проверяет, что кнопка "Показать еще" присутствует и кликабельна.
     * @return текущий экземпляр класса
     */
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

    /**
     * Проверяет, что кнопка SDET присутствует, видима и кликабельна.
     * @return текущий экземпляр класса
     */
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

package org.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Класс главной страницы.
 */
public class MainPage {

    /**
     * Кнопка обратной связи.
     */
    @FindBy(xpath = "//a[@data-gclick='showModalFeedback']")
    private SelenideElement feedbackButton;

    /**
     * Надпись в меню "О нас".
     */
    @FindBy(xpath = "//*[contains(@class,'gh-nav-item--about')]")
    private SelenideElement navItemAbout;

    /**
     * Кнопка в меню "Вакансии".
     */
    @FindBy(xpath = "//a[@href='/vacancies/']")
    private SelenideElement navItemVacancies;


    /**
     * Проверяет, что кнопка Написать нам присутствует и кликабельна.
     * @return текущий экземпляр класса
     */
    @Step("Проверить, что кнопка Написать нам присутствует и кликабельна")
    public FeedbackModal showFeedbackModal() {
        feedbackButton
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text("Написать нам"))
                .click();
        return page(FeedbackModal.class);
    }

    /**
     * Проверяет, что при наведении на элемент меню О нас появляется ссылка Контакты.
     * @return экземпляр класса ContactsPage
     */
    @Step("Проверить, что при наведении на элемент меню О нас появляется ссылка Контакты")
    public ContactsPage goToContacts() {
        navItemAbout
                .shouldHave(text("О нас"))
                .hover();
        $(By.linkText("Контакты"))
                .shouldHave(text("Контакты"))
                .click();
        return page(ContactsPage.class);
    }

    /**
     * Проверяет, что элемент меню Вакансии присутствует и перенаправляет на страницу Вакансии.
     * @return экземпляр класса VacanciesPage
     */
    @Step("Проверить, что элемент меню Вакансии присутствует и перенаправляет на страницу Вакансии")
    public VacanciesPage goToVacancies() {
        navItemVacancies
                .shouldHave(text("Вакансии"))
                .click();
        return page(VacanciesPage.class);
    }

}

package webTesting.webUITemplate.testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import webTesting.webUITemplate.pages.todoly.*;
import webTesting.webUITemplate.sessionWeb.Session;

public class TodolyLogin {
    MenuSection menuSection = new MenuSection();
    MainPage mainPage = new MainPage();
    LoginSection loginSection = new LoginSection();

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }
    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }
    @Test
    public void login(){
        mainPage.loginButton.click();
        loginSection.emailTextBox.setText("vugvefu@gmail.com");
        loginSection.pwdTextBox.setText("vugvefu123");
        loginSection.loginButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo iniciar sesion");

    }
}

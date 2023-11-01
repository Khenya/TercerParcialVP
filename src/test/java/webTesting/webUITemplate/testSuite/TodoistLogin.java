package webTesting.webUITemplate.testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import webTesting.webUITemplate.pages.todoist.AppPage;
import webTesting.webUITemplate.pages.todoist.LoginPage;
import webTesting.webUITemplate.sessionWeb.Session;

public class TodoistLogin {
    LoginPage loginPage = new LoginPage();
    AppPage appPage = new AppPage();

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }
    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("https://todoist.com/app/");
    }

    @Test
    public void login(){
        loginPage.emailInput.setText("khenyaabc@gmail.com");
        loginPage.passwordInput.setText("asdfghjkl1");

        loginPage.logInButton.click();

        Assertions.assertTrue(appPage.todayTitle.isControlDisplayed(),
                "ERROR no se pudo iniciar sesion");

    }
}

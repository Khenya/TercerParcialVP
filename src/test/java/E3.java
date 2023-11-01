import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import webTesting.webUITemplate.pages.todoly.MainPage;
import webTesting.webUITemplate.pages.todoly.MenuSection;
import webTesting.webUITemplate.pages.todoly.SignUpSection;
import webTesting.webUITemplate.sessionWeb.Session;
import java.util.Date;
public class E3 {
    MainPage mainPage = new MainPage();
    SignUpSection signUpSection = new SignUpSection();
    MenuSection menuSection = new MenuSection();

    String email = "Brenda"+new Date().getTime();
    String name = "Brenda Khenya Alvarado Choque";
    String password = "12345678";

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }

    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }

    @Test
    public void e3(){
        Signup();
        SignupFail();
    }
    public void Signup(){
        mainPage.signUpButton.click();
        signUpSection.fullNameInput.setText(name);
        signUpSection.emailInput.setText(email+"@gmail.com");
        signUpSection.pwdInput.setText(password);
        signUpSection.termsOfServiceButton.click();
        signUpSection.signUpButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo crear una nueva cuenta");
    }

    public void SignupFail(){
        menuSection.logoutButton.click();
        mainPage.signUpButton.click();
        signUpSection.fullNameInput.setText(name);
        signUpSection.emailInput.setText(email+"@gmail.com");
        signUpSection.pwdInput.setText(password);
        signUpSection.termsOfServiceButton.click();
        signUpSection.signUpButton.click();

        Assertions.assertFalse(menuSection.logoutButton.isControlDisplayed(),
                "ERROR se pudo crear una nueva cuenta con el mismo email");
    }
}

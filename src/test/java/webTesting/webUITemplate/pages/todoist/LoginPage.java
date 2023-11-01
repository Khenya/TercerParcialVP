package webTesting.webUITemplate.pages.todoist;

import org.openqa.selenium.By;
import webTesting.webUITemplate.contrls.Button;
import webTesting.webUITemplate.contrls.TextBox;

public class LoginPage {
    public TextBox emailInput = new TextBox(By.xpath("//input[@type='email']"));
    public TextBox passwordInput = new TextBox(By.xpath("//input[@type='password']"));
    public Button logInButton = new Button(By.xpath("//button[@data-gtm-id=\"start-email-login\"]"));
}

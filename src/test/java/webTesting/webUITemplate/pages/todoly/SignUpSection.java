package webTesting.webUITemplate.pages.todoly;

import org.openqa.selenium.By;
import webTesting.webUITemplate.contrls.Button;
import webTesting.webUITemplate.contrls.TextBox;

public class SignUpSection {
    public TextBox fullNameInput = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailInput = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox pwdInput = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public Button termsOfServiceButton = new Button(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button signUpButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));
}

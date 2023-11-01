package webTesting.webUITemplate.pages.todoist;

import org.openqa.selenium.By;
import webTesting.webUITemplate.contrls.Button;
import webTesting.webUITemplate.contrls.TextBox;

public class SignUpPage {
    public TextBox emailInput = new TextBox(By.xpath("//input[@type='email']"));
    public TextBox passwordInput = new TextBox(By.xpath("//input[@type='password']"));
    public Button signInButton = new Button(By.xpath("//button[span[text()='Sign up with Email']]"));

    public TextBox nameInput = new TextBox(By.xpath("//input[@type='text']"));
    public Button continueButton = new Button(By.xpath("//button[span[text()='Continue']]"));

    public Button personalAccountButton = new Button(By.xpath("//div[text()='Personal']"));
    public Button launchButton = new Button(By.xpath("//button[span[text()='Launch Todoist']]"));

}

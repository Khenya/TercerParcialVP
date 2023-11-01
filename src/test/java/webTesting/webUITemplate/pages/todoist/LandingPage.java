package webTesting.webUITemplate.pages.todoist;

import org.openqa.selenium.By;
import webTesting.webUITemplate.contrls.Button;

public class LandingPage {
    public Button startForFreeButton = new Button(By.xpath("//a[@href='/auth/signup']"));
    public Button enterLoginButton = new Button(By.xpath("//a[@href='/auth/login']"));
}

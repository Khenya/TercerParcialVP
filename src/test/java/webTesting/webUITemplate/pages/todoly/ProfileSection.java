package webTesting.webUITemplate.pages.todoly;

import org.openqa.selenium.By;
import webTesting.webUITemplate.contrls.Button;
import webTesting.webUITemplate.contrls.Control;
import webTesting.webUITemplate.contrls.TextBox;

public class ProfileSection {

    public Control settingsDialog = new Control(By.id("settingsDialog"));
    public TextBox fullNameInput = new TextBox(By.id("FullNameInput"));
    public Button okButton = new Button(By.xpath("//button[span[text()='Ok']]"));

    public Button accountTab = new Button(By.xpath("//a[@href='#settings_Account']"));
    public Button deleteAccountButton = new Button(By.id("DeleteAccountBtn"));
}

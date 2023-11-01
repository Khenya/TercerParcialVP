package mobileTesting.activities.contact;

import mobileTesting.appiumControl.Button;
import mobileTesting.appiumControl.TextBox;
import org.openqa.selenium.By;
public class CreateContactScreen {
    public TextBox nameTextBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"First name\"]"));
    public TextBox phoneTextBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"Phone\"]"));
    public Button saveButton = new Button(By.id("com.android.contacts:id/editor_menu_save_button"));
}

package mobileTesting.activities.whendo;

import mobileTesting.appiumControl.Button;
import mobileTesting.appiumControl.TextBox;
import org.openqa.selenium.By;

public class EditTarea {
    public TextBox name = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    public Button deleteButon = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button confimDeleteButton = new Button(By.id("android:id/button1"));
}

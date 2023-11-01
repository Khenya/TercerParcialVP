package mobileTesting.test.examples;

import mobileTesting.activities.contact.MainScreen;
import mobileTesting.activities.contact.ContactDetailScreen;
import mobileTesting.activities.contact.CreateContactScreen;
import mobileTesting.session.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class ContactTest {
    MainScreen mainScreen = new MainScreen();
    CreateContactScreen createContactScreen = new CreateContactScreen();
    ContactDetailScreen contactDetailScreen = new ContactDetailScreen();

    @Test
    public void verifyCreateContact(){
        String nameContact= "UPB"+new Date().getTime();
        mainScreen.addButton.click();

        createContactScreen.nameTextBox.setText(nameContact);
        createContactScreen.phoneTextBox.setText("777777777");
        createContactScreen.saveButton.click();
        String actualResult=contactDetailScreen.nameLabel.getText();
        Assertions.assertEquals(nameContact,actualResult
                ,"ERROR el contacto no se creo");
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}

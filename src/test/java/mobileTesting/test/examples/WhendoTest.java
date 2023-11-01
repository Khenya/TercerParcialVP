package mobileTesting.test.examples;

import mobileTesting.activities.whendo.AddTaskScreen;
import mobileTesting.activities.whendo.MyListScreen;
import mobileTesting.session.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class WhendoTest {
    AddTaskScreen addTaskScreen = new AddTaskScreen();
    MyListScreen myListScreen = new MyListScreen();

    @Test
    public void verifyCreateTask(){
        String title = "UPB"+new Date().getTime();
        myListScreen.addButton.click();

        addTaskScreen.titleTextBox.setText(title);
        addTaskScreen.noteTextBox.setText("this is a note");
        addTaskScreen.saveButton.click();
        Assertions.assertTrue(myListScreen.getSpecificTask(title).isControlDisplayed(),
                "ERROR! la tarea no fue created");
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }



}

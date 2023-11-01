import mobileTesting.activities.whendo.AddTaskScreen;
import mobileTesting.activities.whendo.EditTask;
import mobileTesting.activities.whendo.MyListScreen;
import mobileTesting.session.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class E1 {
    MyListScreen myListScreen = new MyListScreen();
    AddTaskScreen addTaskScreen = new AddTaskScreen();
    EditTask editTask = new EditTask();
    String newTitle = "Brenda"+new Date().getTime();

    @Test
    public void e1(){
        verifyCreateTask();
        verifyUpdateTask();
        verifyDeleteTask();
    }

    public void verifyCreateTask(){
        String title = "UPB"+new Date().getTime();
        myListScreen.addButton.click();

        addTaskScreen.titleTextBox.setText(title);
        addTaskScreen.noteTextBox.setText("this is a note");
        addTaskScreen.saveButton.click();

        Assertions.assertTrue(myListScreen.getSpecificTask(title).isControlDisplayed(),
                "ERROR! la tarea no fue created");
    }

    public void verifyUpdateTask(){
        myListScreen.newTaera.click();

        editTask.name.setText(newTitle);
        editTask.saveButton.click();

        Assertions.assertTrue(myListScreen.getSpecificTask(newTitle).isControlDisplayed(),
                "ERROR! la tarea no fue editada");
    }

    public void verifyDeleteTask(){
        myListScreen.newTaera.click();

        editTask.deleteButon.click();
        editTask.confimDeleteButton.click();

        Assertions.assertFalse(myListScreen.getSpecificTask(newTitle).isControlDisplayed(),
                "ERROR! la tarea no fue borrada");
    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }

}

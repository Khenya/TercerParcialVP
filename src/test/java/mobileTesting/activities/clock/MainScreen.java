package mobileTesting.activities.clock;

import mobileTesting.appiumControl.Button;
import mobileTesting.appiumControl.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button alarmSeccion = new Button(By.xpath("//android.widget.TextView[@text=\"Alarm\"]"));
    public Button addWorldClock = new Button(By.id("com.google.android.deskclock:id/fab"));
    public Label newclock = new Label(By.id("com.google.android.deskclock:id/selectable_area"));
}

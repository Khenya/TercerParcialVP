package mobileTesting.factoryDevice;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class Android implements IDevice{
    @Override
    public AppiumDriver create() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","adnrod11");
        capabilities.setCapability("platformVersion","11.0");
//       calculadora
//        capabilities.setCapability("appPackage","com.dencreak.dlcalculator");
//        capabilities.setCapability("appActivity","com.dencreak.dlcalculator.DLCalculatorActivity");
        //Whendo
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity","com.vrproductiveapps.whendo.ui.HomeActivity");
//        // contactos
//        capabilities.setCapability("appPackage","com.android.contacts");
//        capabilities.setCapability("appActivity","com.android.contacts.activities.PeopleActivity");
// clock
//        capabilities.setCapability("appPackage","com.google.android.deskclock");
//        capabilities.setCapability("appActivity","com.android.deskclock.DeskClock");

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","uiautomator2");

        AndroidDriver device = null;
        try {
            device = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        device.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return device;
    }
}
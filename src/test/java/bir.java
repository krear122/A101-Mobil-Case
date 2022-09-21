
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class bir {
    public static AndroidDriver<AndroidElement> capabilities()  throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver;
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
        driver =  new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;
    }

}

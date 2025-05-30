import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class BaseTest {
    protected static AppiumDriver driver;

    public static void setup() {
        try {
            // Basic setup for Android
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("deviceName", "Android Emulator");
            caps.setCapability("automationName", "UiAutomator2");

            //  Replace with your app's package and activity
            caps.setCapability("appPackage", "com.example.app"); 
            caps.setCapability("appActivity", "com.example.app.MainActivity"); 

            caps.setCapability("noReset", true);

            // Connect to Appium server
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void tearDown() {
        // Close the session
        if (driver != null) {
            driver.quit();
        }
    }
}


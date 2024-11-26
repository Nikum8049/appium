import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class spendingTracker {
    public static void main(String[] args) {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("demo");
        options.setApp("E:\\appium_learning\\src\\test\\java\\spending-tracker-2-7.apk");

        try {
           AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723"),options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}

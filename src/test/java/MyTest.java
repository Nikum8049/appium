import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class MyTest {

    public static void main(String[] args) {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("demo");
        options.setApp("E:\\appium_learning\\src\\test\\java\\General-Store.apk");


        try {
            AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723"),options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
            

            driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Nikum");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}

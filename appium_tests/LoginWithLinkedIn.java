import io.appium.java_client.AppiumBy;

public class LoginWithLinkedIn extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        setup();

        // Tap LinkedIn login button
        //  Replace with actual button ID
        driver.findElement(AppiumBy.id("com.example.app:id/btn_linkedin")).click();
        Thread.sleep(3000);

        // Switch to webview to enter LinkedIn credentials
        for (String context : driver.getContextHandles()) {
            if (context.contains("WEBVIEW")) {
                driver.context(context);
                break;
            }
        }

        //  Replace with test LinkedIn credentials (not real ones)
        driver.findElement(AppiumBy.id("username")).sendKeys("your_email@example.com");
        driver.findElement(AppiumBy.id("password")).sendKeys("your_password");
        driver.findElement(AppiumBy.xpath("//button[@type='submit']")).click();

        Thread.sleep(5000); // Give time for redirection

        // Switch back to native view
        driver.context("NATIVE_APP");

        //  Replace with ID of home screen element
        boolean success = driver.findElement(AppiumBy.id("com.example.app:id/home_screen")).isDisplayed();
        System.out.println("Login successful: " + success);

        tearDown();
    }
}

import io.appium.java_client.AppiumBy;

public class InvalidLogin extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        setup();

        // Tap LinkedIn login
        // Replace with actual button ID
        driver.findElement(AppiumBy.id("com.example.app:id/btn_linkedin")).click();
        Thread.sleep(3000);

        // Switch to LinkedIn webview
        for (String context : driver.getContextHandles()) {
            if (context.contains("WEBVIEW")) {
                driver.context(context);
                break;
            }
        }

        //  Use invalid test credentials
        driver.findElement(AppiumBy.id("username")).sendKeys("wrong@example.com");
        driver.findElement(AppiumBy.id("password")).sendKeys("wrongpass");
        driver.findElement(AppiumBy.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);

        //  Replace with actual error message element ID
        boolean errorShown = driver.findElement(AppiumBy.id("error-for-username")).isDisplayed();
        System.out.println("Error message displayed: " + errorShown);

        tearDown();
    }
}

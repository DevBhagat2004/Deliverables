import io.appium.java_client.AppiumBy;

public class ReceiveMessage extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        setup();

        //  Replace with chat screen button ID
        driver.findElement(AppiumBy.id("com.example.app:id/btn_chat")).click();

        Thread.sleep(5000); // Wait for backend-simulated message

        //  Replace with actual message text or ID
        boolean messageReceived = driver.findElement(AppiumBy
            .xpath("//android.widget.TextView[contains(@text, 'Simulated Message')]")).isDisplayed();

        System.out.println("Message received: " + messageReceived);

        tearDown();
    }
}

import io.appium.java_client.AppiumBy;

public class SendMessage extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        setup();

        //  Replace with actual chat screen button ID
        driver.findElement(AppiumBy.id("com.example.app:id/btn_chat")).click();

        //  Replace with input field ID
        driver.findElement(AppiumBy.id("com.example.app:id/message_input")).sendKeys("Hello from automation!");

        //  Replace with send button ID
        driver.findElement(AppiumBy.id("com.example.app:id/send_button")).click();

        Thread.sleep(2000);

        //  Replace with proper XPath for the message bubble
        boolean messageSent = driver.findElement(AppiumBy
            .xpath("//android.widget.TextView[contains(@text, 'Hello from automation!')]")).isDisplayed();

        System.out.println("Message sent: " + messageSent);

        tearDown();
    }
}

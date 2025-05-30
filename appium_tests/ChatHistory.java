import io.appium.java_client.AppiumBy;
import java.util.HashMap;

public class ChatHistory extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        setup();

        // 🛠️ Replace with button ID for chat history
        driver.findElement(AppiumBy.id("com.example.app:id/btn_chat_history")).click();
        Thread.sleep(2000);

        // Perform upward swipe to load older messages
        driver.executeScript("mobile: swipeGesture", new HashMap<String, Object>() {{
            put("direction", "up");
            put("percent", 0.75);
        }});

        // 🛠️ Replace with sample message text from earlier in the chat
        boolean historyVisible = driver.findElement(AppiumBy
            .xpath("//android.widget.TextView[contains(@text, 'Old Message')]")).isDisplayed();

        System.out.println("Chat history loaded: " + historyVisible);

        tearDown();
    }
}

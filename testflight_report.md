# Task 2: TestFlight Testing – iOS Testing Walkthrough

Since I didn’t have access to an iOS device for this task, I wasn’t able to actually install or test the app via TestFlight. But here’s how I **would have completed the process step-by-step** if I had the device:

---

## 1. Installing the App with TestFlight

Once I received the TestFlight invite link, I would’ve:

- Installed the TestFlight app from the App Store.
- Opened the invitation link on the iOS device.
- Installed the app build from the TestFlight dashboard.
- Launched the app to confirm it opened and ran correctly.

---

## 2. Functional Testing of Key Features

###  LinkedIn Login
- Confirm that the LinkedIn login screen appears on app launch.
- Test with:
  -  **Valid credentials** – Confirm redirection to the home screen.
  -  **Invalid credentials** – Confirm that an error message is shown and login is not successful.

###  Real-Time Messaging
- Navigate to the chat screen.
- Test that the user can:
  - Type a message and tap "Send".
  - See the message appear instantly in the chat window.
  - Simulate a message from and check that it appears in real-time.

### Chat History
- Open the chat history screen.
- Scroll through older messages.
- Confirm:
  - Messages load smoothly.
  - The UI doesn’t break when scrolling through a long history.

---

## 3. Logging Results

If I were able to run these tests, I’d keep a test log like this:

| Feature         | Test Case                      | Expected Outcome             | Actual Result        | Status |
|----------------|--------------------------------|------------------------------|-----------------------|--------|
| LinkedIn Login | Login with valid credentials   | Redirect to home screen      | -                     | -      |
| Messaging      | Send message                   | Message appears in chat      | -                     | -      |
| Messaging      | Receive message                | Message appears in real-time | -                     | -      |
| Chat History   | Scroll messages                | History loads correctly      | -                     | -      |

_(I'd fill in the “Actual Result” and “Status” after testing.)_

---

## 4. Bug Reporting (If Any Issues Were Found)

If I found bugs, I’d log them using a clear structure:

- **Title**: Short description of the bug
- **Steps to Reproduce**: Actual steps of instructions would go here
- **Expected Result**: What should’ve happened
- **Actual Result**: What actually happened
- **Attachments**: Screenshots or videos if needed

I’d share these in Trello, Jira, or a Google Sheet—whichever the team prefers.

---

## 5. Additional Tests I Would Try

- Test app performance on different networks (Wi-Fi vs. mobile data).
- Put the app into background during messaging and return.
- Reinstall the app and check if chat history still loads.
- Try rapid message sending to check UI consistency.

---

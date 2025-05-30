## Regression Testing Plan  
**App**: LinkedIn-Based Chat Application  
**Prepared by**: Dev Bhagat (QA Intern)  

---

##  Purpose
This plan is to help make sure the app keeps working properly after updates. It covers the main features like logging in, messaging, and checking chat history. I wrote this to show how I would approach regression testing, especially to avoid breaking anything that already works.

---

## What I'll Test

### 1. LinkedIn Login
- Try logging in with valid credentials to check it works.
- Try invalid credentials to make sure the app shows an error.
- Check what happens if the LinkedIn token has expired (user should be logged out or prompted again).

### 2. Messaging (Real-Time)
- Test if users can send messages and see them instantly.
- Check if the message shows up right after sending.
- Simulate receiving a message and see if it appears while on the chat screen.
- Try sending a really long message or some random characters to make sure nothing breaks.
- Make sure users can’t send blank messages.

### 3. Chat History
- Open a chat and scroll up to check if old messages are loading.
- Use a test account with lots of messages and see if it loads smoothly.
- Make sure timestamps and sender names look right.

### 4. Performance
- Try using the app with multiple users messaging at once (maybe using Firebase or a test tool).
- See how it behaves with slow internet or switching from WiFi to 4G.
- Check if the app crashes or freezes when under pressure.

---

## Tools I’d Use

| Tool                | Why I’d Use It |
|---------------------|----------------|
| **Appium**          | For automating UI tests, especially login and messaging |
| **Firebase Test Lab** | To test on lots of different Android devices easily |
| **Postman**         | For checking API calls and responses manually |
| **Google Sheets or Trello** | To track bugs and note what I tested |

---

## How Often to Test

| Update Type       | When to Run Regression Tests       |
|-------------------|------------------------------------|
| Major updates     | Every time before release          |
| Minor changes     | Every sprint (around every 2 weeks)|
| Hotfixes or bugs  | Right after they’re applied        |

I’d run a quick smoke test more often, but full regression should happen before any release.

---

Thanks for reviewing this! I'm still learning, but I made sure to think through different parts of the app and how users might interact with it.

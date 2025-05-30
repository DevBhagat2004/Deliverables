# Appium UI Automation Tests

This project contains Java-based Appium automation scripts for UI testing of an Android application.

## Prerequisites

- Java JDK 8 or higher
- Android Studio or Android SDK installed and configured
- Node.js and Appium installed
- Appium Inspector (optional, for element lookup)
- APK of the application to be tested
- A connected Android device or emulator

## Setup

1. Clone or download this project.
2. Open a terminal or command prompt.
3. Start the Appium server:

   ```bash
   appium
4. Connect your device/emulator and make sure it appears with:
   ```bash
   adb devices
5. Replace all the placeholders in the Java test scripts with actual values:

     App package name
   
    Activity name
   
    Element IDs (e.g., buttons, text fields)
   
    Valid/invalid credentials for LinkedIn login

## Running the Tests

1. Open the project in an IDE like IntelliJ IDEA or Eclipse.
2. Add the required Appium Java client JARs to the project’s classpath.
3. Right-click the test file and select Run.

Alternatively, compile and run from terminal:
 ```bash
 javac YourTestFile.java
java YourTestFile

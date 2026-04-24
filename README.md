# Selenium Practice: Text Retrieval & Keyboard Actions

This project demonstrates two fundamental Selenium interactions on the **Omayo (QAFox)** blog: retrieving text from disabled elements and simulating keyboard "Return" actions in text areas.

## 🎯 Project Objectives
1.  **Text Retrieval**: Use the `getText()` method to capture the inner text of a non-interactive (disabled) button.
2.  **Keyboard Automation**: Use the `Keys.ENTER` (or `Keys.RETURN`) command to simulate pressing the Enter key after typing into a text area.

## 🛠️ Implementation Details

### Task 1: Reading from a Disabled Element
*   **Target**: The "Disabled" button on the Omayo homepage.
*   **Method**: `webElement.getText()`
*   **Outcome**: The text value is captured as a String and printed to the console, demonstrating that Selenium can read data even from elements that cannot be clicked.

### Task 2: Return Key Simulation
*   **Target**: The "Text Area Field".
*   **Action**: 
    - Cleared the existing "cat" text (best practice).
    - Entered custom text.
    - Appended `Keys.ENTER` to the `sendKeys()` method to move to a new line.

## 🚀 How to Run

### Installation & Cloning
```bash
git clone https://github.com
```

### Execution
1.  Open the project in **Eclipse**.
2.  Locate the test class (e.g., `ReadingText.java`).
3.  Right-click and select **Run As > TestNG Test**.

## 📁 Project Structure
- **`src/`**: Contains the Java class with both the text retrieval and keyboard interaction logic.
- **`pom.xml`**: Manages Selenium and WebDriverManager dependencies.
- **`testng.xml`**: Configuration for running the practice suite.

---
*Developed as part of the Selenium WebDriver Practice assignments.*

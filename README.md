# Selenium: Reading Text from Disabled Elements

This project demonstrates how to use Selenium WebDriver to retrieve and print text from web elements, specifically focusing on elements that are in a **disabled** state.

## 🎯 Objectives
*   Utilize the `getText()` method to retrieve the inner text of a WebElement.
*   Practice locating elements that are present in the DOM but are non-interactive (disabled).
*   Demonstrate basic console logging of retrieved web data.

## 🛠️ Assignment Implementation
1.  **Target Website**: [omayo (QAFox.com)](https://only-testing-blog.blogspot.com/)
2.  **Locator Strategy**: Identified the disabled element using unique attributes (e.g., ID or XPath).
3.  **Action**: Used `webElement.getText()` to capture the text value.
4.  **Verification**: Printed the captured string to the system console for validation.

## 🚀 How to Run

### Installation & Cloning
```bash
git clone https://github.com/SAK3Rttv/Disabled-Text-Field-Test.git
```

### Execution
1.  Open the project in **Eclipse**.
2.  Navigate to the `ch8_assignment` package (or your specific package folder).
3.  Right-click the test class and select **Run As > TestNG Test** (or Java Application).

## 📁 Project Structure
*   **Test Class**: Contains the logic to navigate to Omayo, locate the disabled button/field, and output the text.
*   **pom.xml**: Manages Selenium and WebDriverManager dependencies.

## 📝 Key Learning: getText()
The `getText()` method retrieves the visible inner text of an element. Note that for disabled **input fields**, sometimes `getAttribute("value")` is required instead of `getText()`, as input text is stored in the value attribute rather than as inner HTML text.

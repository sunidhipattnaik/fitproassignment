package com.assignment.testcase;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = null;  // Declare WebDriver to be used in try-catch block
        try
        {
            // Set up ChromeDriver and initialize WebDriver
            System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();

            // Navigate to the website and maximize the browser window
            driver.navigate().to("https://www.fitpeo.com/");
            driver.manage().window().maximize(); 
            
            // Create WebDriverWait to wait for elements to be visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            
            // Check if 'Revenue Calculator' tab is present on the page
            boolean isPresent = !driver.findElements(By.xpath("//div[text()='Revenue Calculator']")).isEmpty();
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            if (isPresent) {
                // If the element is present, scroll into view and click on it
                WebElement tab = driver.findElement(By.xpath("//div[text()='Revenue Calculator']"));
                js.executeScript("arguments[0].scrollIntoView(true);", tab);  // Scroll to the element

                tab.click();  // Click the 'Revenue Calculator' tab
                System.out.println("Element is clicked.");
            } else {
                System.out.println("Element is NOT present on the page.");
            }

            // Wait for the 'Medicare Eligible Patients' element to be visible
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Medicare Eligible Patients']")));
            js.executeScript("arguments[0].scrollIntoView(true);", element);  // Scroll to the element
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            
            // Check if the Medicare element is present on the page
            boolean isMedicareElementPresent = !driver.findElements(By.xpath("//h4[text()='Medicare Eligible Patients']//following::span[1]")).isEmpty();
            
            if (isMedicareElementPresent) {
                System.out.println("Medicare Eligible Patients span is present.");
            } else {
                System.out.println("Medicare Eligible Patients span is NOT present on the page.");
            }

            // Find the input field for 'Medicare Eligible Patients' and clear it using Actions
            WebElement inputField = driver.findElement(By.xpath("//h4[text()='Medicare Eligible Patients']//following::input[2]"));
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            Actions actions = new Actions(driver);
            actions.moveToElement(inputField).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();  // Clear the input field

            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            // Enter the value '820' into the field and print a message
            inputField.sendKeys("820"); 
            System.out.println("Input value '820' has been sent to the field.");
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            // Clear the input field again and enter '560'
            actions.moveToElement(inputField).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
            inputField.sendKeys("560"); 
            System.out.println("Input value '560' has been sent to the field.");
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            // Clear the input field again and enter '820'
            actions.moveToElement(inputField).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
            inputField.sendKeys("820"); 
            System.out.println("Input value '820' has been sent to the field.");
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            
            // Scroll to 'CPT-99091' and select the corresponding checkbox
            WebElement cpt99091Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='CPT-99091']")));
            js.executeScript("arguments[0].scrollIntoView(true);", cpt99091Element);
            System.out.println("Scrolled to 'CPT-99091' element.");
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));

            WebElement checkboxCPT99091 = driver.findElement(By.xpath("//p[text()='CPT-99091']//following::input[1]"));
            if (!checkboxCPT99091.isSelected()) {
                checkboxCPT99091.click();  // Click the checkbox if it's not already selected
                wait = new WebDriverWait(driver, Duration.ofSeconds(60));
                System.out.println("Selected checkbox for CPT-99091.");
            }
            
            // Scroll to 'CPT-99453' and select the corresponding checkbox
            WebElement cpt99453Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='CPT-99453']")));
            js.executeScript("arguments[0].scrollIntoView(true);", cpt99453Element);
            System.out.println("Scrolled to 'CPT-99453' element.");
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));

            WebElement checkboxCPT99453 = driver.findElement(By.xpath("//p[text()='CPT-99453']//following::input[1]"));
            if (!checkboxCPT99453.isSelected()) {
                checkboxCPT99453.click();  // Click the checkbox if it's not already selected
                wait = new WebDriverWait(driver, Duration.ofSeconds(60));
                System.out.println("Selected checkbox for CPT-99453.");
            }
            
            // Scroll to 'CPT-99454' and select the corresponding checkbox
            WebElement cpt99454Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='CPT-99454']")));
            js.executeScript("arguments[0].scrollIntoView(true);", cpt99454Element);
            System.out.println("Scrolled to 'CPT-99454' element.");
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));

            WebElement checkboxCPT99454 = driver.findElement(By.xpath("//p[text()='CPT-99454']//following::input[1]"));
            if (!checkboxCPT99454.isSelected()) {
                checkboxCPT99454.click();  // Click the checkbox if it's not already selected
                wait = new WebDriverWait(driver, Duration.ofSeconds(60));
                System.out.println("Selected checkbox for CPT-99454.");
            }

            // Scroll to 'CPT-99474' and select the corresponding checkbox
            WebElement cpt99474Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='CPT-99474']")));
            js.executeScript("arguments[0].scrollIntoView(true);", cpt99474Element);
            System.out.println("Scrolled to 'CPT-99474' element.");
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));

            WebElement checkboxCPT99474 = driver.findElement(By.xpath("//p[text()='CPT-99474']//following::input[1]"));
            if (!checkboxCPT99474.isSelected()) {
                checkboxCPT99474.click();  // Click the checkbox if it's not already selected
                wait = new WebDriverWait(driver, Duration.ofSeconds(60));
                System.out.println("Selected checkbox for CPT-99474.");
            }
            
            // Wait for the total reimbursement value to appear, and extract the text
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            WebElement value = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Total Recurring Reimbursement for all Patients Per Month:']")));
            String elementText = value.getText();
            System.out.println("Extracted Text: " + elementText);
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            
            // Split the text to extract the numerical value and compare it with the expected value
            String splitText[] = elementText.split(":");
            System.out.println(splitText[1]);
            if ((splitText[1].trim()).equals("$110700")) {
                System.out.println("The value is equal to $110700.");
            } else {
                System.out.println("The value is NOT equal to $110700. It is " + elementText);
            }
        }
        catch (Exception e) {
            // Handle any exceptions that occur during execution
            System.out.println("An error occurred: " + e.getMessage());
        } 
        finally {
            // Ensure that the browser is closed even if an exception occurs
            if (driver != null) {
                driver.quit();
                System.out.println("Browser closed.");
            }
        }
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority_In_testNG {
    static {
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\mihovm.MASCORP\\Downloads\\selenium-java-3.141.59\\geckodriver.exe");
//                "/Users/balivo/Downloads/selenium/course/geckodriver");

    }

    WebDriver driver;

    // Method 1: Open Brower say Firefox
    @Test (priority = 1)
    public void openBrowser() {
    driver = new FirefoxDriver();
    }

    // Method 2: Launch Google.com
    @Test (priority = 2)
    public void launchGoogle() {
        driver.get("https://www.google.com");
    }

    // Method 3: Perform a search using "Facebook"
    @Test (priority = 3)
    public void peformSeachAndClick1stLink() {
        driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");
    }

    // Method 4: Verify Google search page title.
    @Test (priority = 4)
    public void FaceBookPageTitleVerification() throws InterruptedException {
        driver.findElement(By.xpath(".//*[@value='Google Search']")).submit();

        Thread.sleep(3000);
        Assert.assertTrue(driver.getTitle().contains("Facebook - Google Search"));
    }
}

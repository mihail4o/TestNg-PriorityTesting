import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHandling {
    public static void main(String[] args) {

        // Set property
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\mihovm.MASCORP\\Downloads\\selenium-java-3.141.59\\geckodriver.exe");
//                "/Users/balivo/Downloads/selenium/course/geckodriver");

        // First session of WebDriver
        WebDriver driver1 = new FirefoxDriver();
        // GoTo web page
        driver1.get("https://www.google.com");

        // Second session of WebDriver
        WebDriver driver2 = new FirefoxDriver();
        // GoTo web page
        driver2.get("https://www.google.com");
    }
}

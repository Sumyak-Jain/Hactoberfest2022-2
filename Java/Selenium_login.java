//Web login using selenium automation 
import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

public class login_hackerearth {

    public static void main(String[] args) {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Launch Website
        driver.navigate().to("https://www.hackerearth.com/");
        driver.manage().window().maximize();
       WebElement login = driver.findElement(By.cssSelector("#__next > div > div > div.header > div > div.buttons > div:nth-child(1)"));
        login.click();
        WebElement email= driver.findElement(By.name("username"));
        email.sendKeys("..");
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("..");
        WebElement log= driver.findElement(By.className("submitButton"));
        log.click();
        driver.quit();
        System.out.println("login Successful");



    }}

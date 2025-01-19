package Pages;

import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SignUp {

    WebDriver driver = Hooks.driver;

    public WebElement SignUp_Login_button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    }


    public WebElement Name() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]"));
    }


    public WebElement Email() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]"));
    }


    public WebElement SignUp_button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
    }

    public WebElement gender() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
    }

    public WebElement AccPass() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"password\"]"));
    }

    public WebElement Day() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//select[@data-qa=\"days\"]"));
    }

    public WebElement Month() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//select[@data-qa=\"months\"]"));
    }

    public WebElement Year() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//select[@data-qa=\"years\"]"));
    }

    public WebElement check1() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
    }

    public WebElement check2() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"optin\"]"));
    }

    //Address info
    public WebElement Fname() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
    }

    public WebElement Lname() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
    }

    public WebElement company() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"company\"]"));
    }

    public WebElement Address() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"address1\"]"));
    }

    public WebElement country() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"country\"]"));
    }

    public WebElement state() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"state\"]"));
    }

    public WebElement city() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"city\"]"));
    }

    public WebElement zipcode() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
    }

    public WebElement Number() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
    }

    public WebElement creatAcc() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button"));
    }

    public WebElement estmrar() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
    }

    public WebElement product() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a"));
    }

    public WebElement categoryMen() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[2]/div[1]/h4/a"));
    }

    public WebElement jeans() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"Men\"]/div/ul/li[2]/a"));
    }
    public WebElement overlay() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/img"));
    }

    public WebElement AddToCart() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/a"));
    }

    public WebElement ViewCart() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u"));
    }

    public WebElement checkout() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a"));
    }
    public WebElement PlaceOrder() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a"));
    }
    public WebElement payConfirm() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    }
    public WebElement CardName() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input"));
    }
    public WebElement CardNum() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input"));
    }
    public WebElement CVC() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input"));
    }
    public WebElement EXP1() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input"));
    }
    public WebElement EXP2() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input"));
    }
    public WebElement Cont() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
    }
    public WebElement LogOut() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
    }
}





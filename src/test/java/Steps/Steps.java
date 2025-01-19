package Steps;

import Pages.SignUp;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.plaf.basic.BasicBorders;
import java.util.Scanner;

public class Steps {
    Hooks hooks = new Hooks();

    @BeforeTest
    public void Before_Test() {
        hooks.Setup();
    }

    @Test
    public void SignUp() throws InterruptedException {
        SignUp signup = new SignUp();
        // Click on SignUp Login
        signup.SignUp_Login_button().click();
        // Enter Name
        signup.Name().sendKeys("Omar");
        // Enter Email
        signup.Email().sendKeys("omarjoe5@gmail.com");
        // Click on signup
        signup.SignUp_button().click();
        // Radio button gender
        signup.gender().click();
        // Accpass
        signup.AccPass().sendKeys("1234qwer");
        // Day
        Select day = new Select(signup.Day());
        day.selectByVisibleText("1");
        // Month
        Select month = new Select(signup.Month());
        month.selectByVisibleText("January");
        // Year
        Select year = new Select(signup.Year());
        year.selectByVisibleText("2002");
        // Checkboxes
        signup.check1().click();
        signup.check2().click();
        // Address info
        signup.Fname().sendKeys("omar");
        signup.Lname().sendKeys("Farouk");
        signup.company().sendKeys("Jmarexa");
        signup.Address().sendKeys("villa 231 90 street 5th settlement, new cairo");

        Select country = new Select(signup.country());
        country.selectByVisibleText("Canada");

        signup.state().sendKeys("Canada");
        signup.city().sendKeys("Canada");
        signup.zipcode().sendKeys("185249");
        signup.Number().sendKeys("0123456789");

        signup.creatAcc().click();
        signup.estmrar().click();
        signup.product().click();
        signup.categoryMen().click();
        signup.jeans().click();
        signup.overlay().click();
        signup.AddToCart().click();

        // Hover over a specific product on the Jeans page
//        WebElement jeansProduct = signup.jeans();
//        Actions actions = new Actions(Hooks.driver);
//        actions.moveToElement(jeansProduct).perform(); // Hover over the product
//
//        // Click on Add to Cart after it appears
//        WebElement addToCartButton = signup.AddToCart();
//        actions.moveToElement(addToCartButton).click().perform(); // Ensure it's clicked after hover

        signup.ViewCart().click();
        signup.checkout().click();
        signup.PlaceOrder().click();
        signup.payConfirm().click();
        signup.CardName().sendKeys("Omar Youssef Farouk");
        signup.payConfirm().click();
        signup.CardNum().sendKeys("1234 5678 9101 1121");
        signup.payConfirm().click();
        signup.CVC().sendKeys("611");
        signup.payConfirm().click();
        signup.EXP1().sendKeys("08");
        signup.payConfirm().click();
        signup.EXP2().sendKeys("2028");
        signup.payConfirm().click();
        signup.Cont().click();
        signup.LogOut().click();
    }

    @AfterTest
    public void After_Test() {
        hooks.quit();
    }
}

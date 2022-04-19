package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    @Before

    public void loadUrl() {

        openBrowser();
    }

    @Test

    public void userShouldLoginSuccessfullyWithValid() {

        WebElement emailId = driver.findElement(By.id("user-name"));
        emailId.sendKeys("standard_user"); // entering username

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("secret_sauce"); //finding element and enetering password

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        loginButton.click();// first we find webelement with xpath in above line and then we used clicked method


        // finding product-1 once logged in for website


        String expectedMessage = "Sauce Labs Backpack";
        WebElement product1 = driver.findElement(By.linkText("Sauce Labs Backpack"));
        System.out.println(product1.getText());
        String product1ActualMessage = product1.getText();

        Assert.assertEquals(expectedMessage, product1ActualMessage);


        // finding product-2 once logged in for website


        String expectedMessage2 = "Sauce Labs Bike Light";
        WebElement product2 = driver.findElement(By.linkText("Sauce Labs Bike Light"));
        System.out.println(product2.getText());
        String product2ActualMessage = product2.getText();

        Assert.assertEquals(expectedMessage2, product2ActualMessage);

        //finding product-3 once logged in for website
        String expectedMessage3= "Sauce Labs Bolt T-Shirt";
        WebElement product3 = driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Bolt T-Shirt']"));
        System.out.println(product3.getText());
        String product3ActualMessage = product3.getText();
        Assert.assertEquals(expectedMessage3, product3ActualMessage);

        //finding product-4 once logged in for website
        String expectedMessage4= "Sauce Labs Fleece Jacket";
        WebElement product4 = driver.findElement(By.linkText("Sauce Labs Fleece Jacket"));
        System.out.println(product4.getText());
        String product4ActualMessage = product4.getText();
        Assert.assertEquals(expectedMessage4, product4ActualMessage);



        //finding product-5 once logged in for website
        String expectedMessage5= "Sauce Labs Onesie";
        WebElement product5 = driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Onesie']"));
        System.out.println(product5.getText());
        String product5ActualMessage = product5.getText();
        Assert.assertEquals(expectedMessage5, product5ActualMessage);


        //finding product-6 once logged in for website
        String expectedMessage6= "Test.allTheThings() T-Shirt (Red)";
        WebElement product6 = driver.findElement(By.xpath("//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']"));
        System.out.println(product6.getText());
        String product6ActualMessage = product6.getText();
        Assert.assertEquals(expectedMessage6, product6ActualMessage);

    }


    @After

    public void closeSauceDemoUrl() {

        quitAllUrl();


    }


}

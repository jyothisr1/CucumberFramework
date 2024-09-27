package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id ="user-name" )
    WebElement usernameInput;

    @FindBy(id ="password" )
    WebElement passwordInput;

    @FindBy(id ="login-button" )
    WebElement signInButton;

    @FindBy(xpath ="//h3[@data-test='error']" )
    WebElement err;

//    WebDriver driver;

    public LoginPage(){
//        super(driver);
//        this.driver=driver;
    }

    public void openWebsite(){
        driver.get("https://www.saucedemo.com/");
    }

    public void doLogin(String username,String password){
        System.out.println(username);
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInButton.click();
    }

    public boolean isLoginPageDisplayed(){
        return usernameInput.isDisplayed() && passwordInput.isDisplayed();
    }

    public String getInvalidLoginUser(){
        return err.getText();
    }
}

package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomePage extends BasePage {

    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerMenuIcon;

    @FindBy(id = "logout_sidebar_link")
    WebElement logOutLink;

    @FindBy(css = ".product_sort_container")
    WebElement filterDropdown;

    @FindBy(css = ".shopping_cart_link")
    WebElement cartItem;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCart;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    WebDriver count;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement filter;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement DropDown;
    @FindBy(className = "inventory_item_name")
    List<WebElement> itemNameList;

//    WebDriver driver;


    public void clickOnBurgerMenu() {
//        WebElement burgerMenuIcon =driver.findElement(By.id("react-burger-menu-btn"));
        burgerMenuIcon.click();
    }

    public void clickOnLogoutLink() {
//        WebElement logOutLink =driver.findElement(By.id("logout_sidebar_link"));
        logOutLink.click();
    }

    public boolean isHomePageDisplayed() {
//        WebElement filterDropdown =driver.findElement(By.cssSelector(".product_sort_container"));
//        WebElement cartItem =driver.findElement(By.cssSelector(".shopping_cart_link"));
        return filterDropdown.isDisplayed() || cartItem.isDisplayed();
    }

    public void clickFilter(){
        filter.click();
    }
    public void selectSortCriteria(){
        Select dropDown= new Select(DropDown);
        dropDown.selectByVisibleText("Name (Z to A)");
    }

    public boolean isSorted(){
        ArrayList<String> list=new ArrayList<>();
        for(WebElement item:itemNameList){
            list.add(item.getText());
        }
        ArrayList<String> list2=new ArrayList<>(list);
        Collections.sort(list2);
        System.out.println("list 1");
        System.out.println(list);
        System.out.println("list 2");
        System.out.println(list2);
        Collections.reverse(list2);
        if(list2==list){
            return true;
        }
        return false;
    }


}

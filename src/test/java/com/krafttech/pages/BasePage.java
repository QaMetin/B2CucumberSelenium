package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
WebDriver driver;
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    public void naviagateToTab(String tabName){
        driver=Driver.get();
        driver.findElement(By.xpath("//nav//span[.='"+tabName+"']")).click();

    }


    public void navigateToModule(String tab, String module){

        String tabLocator= "//li[@class='nav-item']//span[.='"+tab+"']";  ////li[@class='nav-item']//span[.='Components']

        String moduleLocator="//span[.='"+module+"']";

        driver=Driver.get();

        BrowserUtils.waitForClickablility(By.xpath(tabLocator),5);
        WebElement tabElement=driver.findElement(By.xpath(tabLocator));
        tabElement.click();

        BrowserUtils.waitForClickablility(By.xpath(moduleLocator),5);
        driver.findElement(By.xpath(moduleLocator)).click();


    }

    public String subTitle(String subTitle){

        String subTileLocator="//h1[.='"+subTitle+"']";

        BrowserUtils.waitForPresenceOfElement(By.xpath(subTileLocator),5);

        WebElement SubTile= Driver.get().findElement(By.xpath(subTileLocator));

        String actualSubTitle= SubTile.getText();
        return actualSubTitle;

    }
    public String getAccountName_mtd(String accountName){
        return Driver.get().findElement(By.xpath("//span[.='"+accountName+"']")).getText();
    }

    public String getWarningMessageText(String message){
        return Driver.get().findElement(By.xpath("//*[contains(text(),'"+message+"')]")).getText();
    }





}

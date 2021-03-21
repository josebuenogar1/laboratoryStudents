package com.RecordlaboratoryEstudents.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIndex {

    WebDriver driver;
    @BeforeClass
    public  void initDriver(){
        System.setProperty("webdriver.chrome.driver","D:/DESCARGAS/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/");
    }

    @Test(priority = 0,enabled = true)
    public  void title(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Laboratory");
    }

    @AfterClass
    public void closeAndQuitDriver(){
        driver.close();
        driver.quit();

    }








}

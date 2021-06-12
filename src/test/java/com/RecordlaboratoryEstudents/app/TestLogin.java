package com.RecordlaboratoryEstudents.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public class TestLogin {
    WebDriver driver;


    @BeforeClass
    public  void initDriver(){
        System.setProperty("webdriver.chrome.driver","D:/DESCARGAS/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/");
    }

    @Test(priority = 0)
    public void login(){
        WebElement register = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        register.sendKeys("admin");
        register = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        register.sendKeys("admin");
        register = driver.findElement(By.xpath("/html/body/div[1]/form/button"));
        register.click();
        this.sleep(3000);
    }




    @Test(priority = 1)
    public void  allenNetworkLink(){
        WebElement link= driver.findElement(By.xpath("/html/body/div[1]/a[1]"));
        link.click();
        this.sleep(3000);

    }

    @Test(priority = 2)
    public void  allenNetworkTable(){
        WebElement table = driver.findElement(By.xpath ("//*[@id='hours_table']/thead/tr[3]/td[1]/a"));
        table.click();
        this.sleep(3000);

    }

    @Test(priority = 3)
    public void allenNetworkRegister(){
        WebElement  register = driver.findElement(By.xpath("//*[@id='name']"));
        register.sendKeys("Jose Bueno");
        register = driver.findElement(By.xpath("//*[@id='idStudent']"));
        register.sendKeys("E123456");
        register = driver.findElement(By.xpath("//*[@id='email']"));
        register.sendKeys("jose@university.com");
        register = driver.findElement(By.xpath("/html/body/div[1]/form/button"));
        register.click();
        this.sleep(3000);
    }

    @Test(priority = 4)
    public void allenNetworkPDF(){
        WebElement  pdf = driver.findElement(By.xpath("/html/body/div[1]/a[1]"));
        pdf.click();
        this.sleep(5000);
        final File file = new File("C:/Users/jose/Downloads/users_.pdf");
        Assert.assertTrue(file.exists());
    }

    @Test(priority = 5)
    public void allenHome(){
        WebElement home = driver.findElement(By.linkText("Home"));
        home.click();
        this.sleep(3000);
    }

    @Test(priority = 6)
    public void allenUnavailable(){
        allenNetworkLink();
        WebElement una = driver.findElement(By.xpath("//*[@id=\"hours_table\"]/thead/tr[3]/td[1]"));
        Assert.assertEquals(una.getText(),"Unavailable");
    }


    @AfterClass
    public void closeAndQuitDriver(){
        driver.close();
        driver.quit();

    }




    public void sleep(int s){
        try {
            Thread.sleep(s);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

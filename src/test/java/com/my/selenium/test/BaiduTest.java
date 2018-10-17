package com.my.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaiduTest {
    @Test(dataProvider = "GetDataFromXml", dataProviderClass = ExcelDataProvider.class)
    public void test1(String URL, String context) {
        System.setProperty("webdriver.firefox.bin","D:\\tools\\Mozilla Firefox\\firefox.exe");
//        geckodriver.exe下载地址：https://github.com/mozilla/geckodriver/releases
        System.setProperty("webdriver.gecko.driver","D:\\tools\\Mozilla Firefox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(URL);

        driver.manage().window().maximize();

        WebElement txtbox = driver.findElement(By.name("wd"));
        txtbox.sendKeys(context);

        WebElement btn = driver.findElement(By.id("su"));
        btn.click();

        driver.close();

    }

}

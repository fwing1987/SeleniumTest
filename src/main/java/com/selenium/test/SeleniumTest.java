package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by wangfeng on 16/9/10.
 */
public class SeleniumTest {
    public static void main(String args[]){
        WebDriver webDriver = WebDriverUtil.initChromeWebDriver();
        webDriver.get("http://www.baidu.com");
        WebElement searchInput = webDriver.findElement(By.id("kw"));
        searchInput.sendKeys("测试");
        WebElement searchBtn = webDriver.findElement(By.id("su"));
        searchBtn.click();
    }

}

package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by wangfeng on 16/9/10.
 */
public class WebDriverUtil {

    public static WebDriver initChromeWebDriver(){
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--user-agent=\"Mozilla/5.0 (Linux; U; Android 2.3.6; zh-cn; GT-S5660 Build/GINGERBREAD) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1 MicroMessenger/4.5.255\"");
        System.setProperty("webdriver.chrome.driver","/Users/wangfeng/Downloads/chromedriver");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }

    public static WebDriver initFirefoxWebDriver(){
        FirefoxProfile profile = new FirefoxProfile();
        System.setProperty("webdriver.firefox.bin","/Users/wangfeng/Downloads/firefox");
        //关闭flash
        profile.setPreference("dom.ipc.plugins.enabled.libflashplayer.so", false);
        //禁用图片
        profile.setPreference("permissions.default.image", 2);
        FirefoxDriver driver = new FirefoxDriver(profile);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    public static  WebDriver initIEWebDriver(){
        InternetExplorerDriver driver = new InternetExplorerDriver();
        return driver;
    }

}

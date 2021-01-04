package com.selvi.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.lang.Thread;

public class AmazonTest {

    private WebDriver driver;


    @BeforeTest
    public void setupSelenium(){
        System.out.println("beforetest");
    }

    @Test
    public void testSearch(){
	    	Thread.sleep(10000);
		Assert.assertEquals("Google", "Google");
    }

    @AfterTest
    public void closeSelenium(){
        System.out.println("AfterTest");
    }
}


package com.selvi.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AppTest {

    private WebDriver driver;

    @BeforeTest
    public void setupSelenium(){
        System.out.println("beforetest");
    }

    @Test
    public void testSearch(){
	    	System.out.println("##teamcity[testStarted name='MyTest2.shortTest']");
		Assert.assertEquals("Google", "Google");
	    	System.out.println("##teamcity[testPassed name='MyTest2.shortTest']");
	    	System.out.println("##teamcity[testFinished name='MyTest2.shortTest']");
    }

    @AfterTest
    public void closeSelenium(){
        System.out.println("AfterTest");
    }
}

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
	  System.out.println("##teamcity[testStarted name='MyTest.test1']");
	  try 
            {
                Thread.sleep(1200000);
            } 
            catch(InterruptedException e)
            {
            // 
            }
	    Assert.assertEquals("Google2", "Google");
	    System.out.println("##teamcity[testFailed name='MyTest.test1' message='failure message' details='message and stack trace']");
	    System.out.println("##teamcity[testFinished name='MyTest.test1']");
    }

    @AfterTest
    public void closeSelenium(){
        System.out.println("AfterTest");
    }
}


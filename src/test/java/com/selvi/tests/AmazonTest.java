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
	  //System.out.println("##teamcity[testStarted name='MyTest1.longTest']");
	  try 
            {
                Thread.sleep(120000);
            } 
            catch(InterruptedException e)
            {
            // 
            }
	    Assert.assertEquals("Google", "Google");
	    //System.out.println("##teamcity[testPassed name='MyTest1.longTest'");
	    //System.out.println("##teamcity[testFinished name='MyTest1.longTest']");
	    //System.out.println("Hi");
    }
	
    @AfterTest
    public void closeSelenium(){
        System.out.println("AfterTest");
    }
}





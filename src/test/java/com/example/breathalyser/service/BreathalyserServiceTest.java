package com.example.breathalyser.service;

import com.example.breathalyser.model.Gender;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class BreathalyserServiceTest {
    private static BreathalyserService breathalyserService;


    @BeforeClass
    public static void start() {
        breathalyserService = new BreathalyserService();
    }

    @AfterClass
    public static void stop() {
        breathalyserService = null;
    }

    @Test
    public void pureAlcoholTest(){
        double expectedResult =  15.8;
        double result = breathalyserService.pureAlcohol(50,40);
        Assert.assertEquals(expectedResult, result,0.01);
    }

    @Test
    public void fluidContentInBodyTest(){
        double expectedResult =  50.4;
        double result = breathalyserService.fluidContentInBody(Gender.MALE,72);
        Assert.assertEquals(expectedResult,result,0.01);
    }

    @Test
    public void resultInPrmilTest(){
        double expectedResult = 0.31;
        double result = breathalyserService.resultInPrmil(Gender.MALE,50,40,72);
        Assert.assertEquals(expectedResult,result,0.01);
    }

}

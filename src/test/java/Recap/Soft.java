package Recap;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft {

    @Test
    public void test1(){
        SoftAssert soft=new SoftAssert();
        System.out.println("Test 1 starting");
        soft.assertEquals(4,5);
        System.out.println("Test 1 middle");
        soft.assertTrue(false);
        System.out.println("End of Test 1");
        soft.assertAll();
    }

    @Test
    public void test2(){
        System.out.println("Test 2 is starting  ");
    }
}

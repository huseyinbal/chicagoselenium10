package PageObjectModel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Grey {

    @BeforeClass
    public static void setup(){//before class always must be static
        System.out.println("JUNIT before class");
    }

    @Before
    public void b(){
        System.out.println("before annotation");
    }

    @Test
    public void test1(){
        System.out.println("JUnit test 1");
        Assert.assertEquals("here",4,5);
    }

    @Test
    public void test2(){
        System.out.println("JUnit test 2");
    }
}

import com.binod.uitesting.UITesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyTest {

    UITesting uiTesting = null;

    @Before
    public void setUp(){
        uiTesting = new UITesting();
    }

    @Test
    public void checkTwoNo(){

        float exp = 5;
        float actual = uiTesting.add(2,3);
        assertEquals(exp, actual);
    }

    @Test
    public void subTwoNo(){

        float exp = 5;
        float actual = uiTesting.sub(10,5);
        assertEquals(exp, actual);
    }

    @Test
    public void divTwoNo(){

        float exp = 2;
        float actual = uiTesting.div(10,5);
        assertEquals(exp, actual);
    }

    @After
    public void tearDown(){
         uiTesting = null;
    }

}

import com.binod.uitesting.UITesting;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyTest {

    @Test
    public void checkTwoNo(){
        UITesting uiTesting = new UITesting();

        float exp = 5;
        float actual = uiTesting.add(2,3);
        assertEquals(exp, actual);
    }

    @Test
    public void subTwoNo(){}
    UITesting uiTesting = new UITesting();

    
}

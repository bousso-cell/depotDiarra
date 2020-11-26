package ProjetGit.ProjetGit;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    /**
     * Rigorous Test :-)
     */
    Calculator calculator;
    @Before
    public void setUp() throws Exception{
        calculator=new Calculator();
    }
    @Test
    public void testSum() {

        // Given
        //Calculator calculator = new Calculator();
        // When
        int result = calculator.sum(2, 2);
        // Then
        if (result != 4) {   // if 2 + 2 != 4
            Assert.fail();
        }
    }

    @Test
    public void testSus() {
        //Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.sus(2, 2));
    }
}

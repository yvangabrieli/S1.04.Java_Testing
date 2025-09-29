package ejercicio2.Test;

import static org.junit.Assert.assertEquals;

import ejercicio2.IdCalculation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;



@RunWith(Parameterized.class)
public class IdCalculationTest {
    private int numberId;
    private char expectedIdLetter;

    public  IdCalculationTest(int numberId, char expectedIdLetter) {
        this.numberId = numberId;
        this.expectedIdLetter = expectedIdLetter;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {12345678, 'Z'},
                {87654321, 'X'},
                {11111111, 'H'},
                {22222222, 'J'},
                {32922764, 'N'},
                {60830197, 'G'},
                {34730604, 'Y'},
                {55421880, 'E'},
                {44648008, 'V'},
                {98436448, 'J'},
        });
    }
    @Test
    public void testCalculateLetter () {
        Assert.assertEquals(expectedIdLetter, IdCalculation.calculateLetter(numberId));
    }
}
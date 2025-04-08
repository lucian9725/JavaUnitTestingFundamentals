package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdunare(){
        System.out.println("testAdunare");
        double rezultatActual = calculator.adunare(4, 5);
        // definiti rezultatul actual asteptat -> double rezultatAsteptat = 9;
        assertEquals(9, rezultatActual);  //assert(expected, actual)

    }

    @Test
    public void testScadere(){
        double rezultatActual = calculator.scadere(4, 5);
        assertEquals(-1, rezultatActual); //assert(expected, actual)

    }

}

import model.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUnitTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple test")
    public void test() {
        String leftNumber = "1";
        String rightNumber = "1";
        String operator = "+";
        double result = 2;
        assertEquals(calculator.calculateResult(leftNumber, rightNumber, operator), result);
    }

    @Test
    @DisplayName("Failure Test")
    public void failureTest() {
        String leftNumber = "2";
        String rightNumber = "2";
        String operator = "*";
        double result = 4;
        assertEquals(calculator.calculateResult(leftNumber, rightNumber, operator), result);
    }

}
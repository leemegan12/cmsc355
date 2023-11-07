import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class addingTest2 {
    @Test
    public void testIncorrectAnswer() {
        int num1 = 3;
        int num2 = 8;
        int expectedSum = num1 + num2;
        int userAnswer = expectedSum + 1;

        assertFalse(expectedSum == userAnswer, "틀린 경우 테스트 통과해야 합니다.");
    }
}
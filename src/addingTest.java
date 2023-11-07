import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class addingTest {
    @Test
    public void testCorrectAnswer() {
        int num1 = 5;
        int num2 = 7;
        int expectedSum = num1 + num2;
        int userAnswer = expectedSum;

        assertEquals(expectedSum, userAnswer, "정답인 경우 테스트 통과해야 합니다.");
    }


}
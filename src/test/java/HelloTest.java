import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
    @Test
    @DisplayName("เรากำลังทดสอบดัวย junit5")
    public void case01() {
        // Arrange = Given
        Hello helle = new Hello();
        // Act = When
        String result = helle.say("tanuphong");
        // Assert = Then
        assertEquals("Hello tanuphong", result);
    }
}

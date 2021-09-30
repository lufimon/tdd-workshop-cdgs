import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyRangeTest {
    @Test
    @DisplayName("ตัวแรกต้องเป็น [ (include) โดยที่ input = [1,5], result = true")
    public void case01() {
        // Arrange
        String input = "[1,5]";
        MyRange range = new MyRange(input);
        boolean result = range.startWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ตัวแรกต้องเป็น [ (include) โดยที่ input = [1,5), result = true")
    public void case02() {
        // Arrange
        String input = "[1,5)";
        MyRange range = new MyRange(input);
        boolean result = range.startWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ตัวแรกต้องเป็น [ (include) โดยที่ input = (1,5], result = false")
    public void case03() {
        // Arrange
        String input = "(1,5]";
        MyRange range = new MyRange(input);
        boolean result = range.startWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ตัวแรกต้องเป็น [ (include) โดยที่ input = (1,5), result = false")
    public void case04() {
        // Arrange
        String input = "(1,5)";
        MyRange range = new MyRange(input);
        boolean result = range.startWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ตัวแรกต้องเป็น ( (exclude) โดยที่ input = [1,5], result = false")
    public void case05() {
        // Arrange
        String input = "[1,5]";
        MyRange range = new MyRange(input);
        boolean result = range.startWithExclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ตัวแรกต้องเป็น ( (exclude) โดยที่ input = [1,5), result = false")
    public void case06() {
        // Arrange
        String input = "[1,5)";
        MyRange range = new MyRange(input);
        boolean result = range.startWithExclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ตัวแรกต้องเป็น ( (exclude) โดยที่ input = (1,5], result = true")
    public void case07() {
        // Arrange
        String input = "(1,5]";
        MyRange range = new MyRange(input);
        boolean result = range.startWithExclude();
        assertTrue(result);
    }
}

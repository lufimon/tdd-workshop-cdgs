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

    @Test
    @DisplayName("ตัวแรกต้องเป็น ( (exclude) โดยที่ input = (1,5), result = true")
    public void case08() {
        // Arrange
        String input = "(1,5)";
        MyRange range = new MyRange(input);
        boolean result = range.startWithExclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ตัวท้ายต้องเป็น ] (include) โดยที่ input = [1,5], result = true")
    public void case09() {
        // Arrange
        String input = "[1,5]";
        MyRange range = new MyRange(input);
        boolean result = range.endWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ตัวท้ายต้องเป็น ] (include) โดยที่ input = [1,5), result = false")
    public void case10() {
        // Arrange
        String input = "[1,5)";
        MyRange range = new MyRange(input);
        boolean result = range.endWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ตัวท้ายต้องเป็น ] (include) โดยที่ input = (1,5], result = true")
    public void case11() {
        // Arrange
        String input = "(1,5]";
        MyRange range = new MyRange(input);
        boolean result = range.endWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ตัวท้ายต้องเป็น ] (include) โดยที่ input = (1,5), result = false")
    public void case12() {
        // Arrange
        String input = "(1,5)";
        MyRange range = new MyRange(input);
        boolean result = range.endWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ตัวท้ายต้องเป็น ) (exclude) โดยที่ input = [1,5], result = false")
    public void case13() {
        // Arrange
        String input = "[1,5]";
        MyRange range = new MyRange(input);
        boolean result = range.endWithExclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ตัวท้ายต้องเป็น ) (exclude) โดยที่ input = [1,5), result = true")
    public void case14() {
        // Arrange
        String input = "[1,5)";
        MyRange range = new MyRange(input);
        boolean result = range.endWithExclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ตัวท้ายต้องเป็น ) (exclude) โดยที่ input = (1,5], result = false")
    public void case15() {
        // Arrange
        String input = "(1,5]";
        MyRange range = new MyRange(input);
        boolean result = range.endWithExclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ตัวท้ายต้องเป็น ) (exclude) โดยที่ input = (1,5), result = true")
    public void case16() {
        // Arrange
        String input = "(1,5)";
        MyRange range = new MyRange(input);
        boolean result = range.endWithExclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ตัวเลขเริ่มต้นเป็น 1 โดยที่ input = [1,5], result = true")
    public void case17() {
        // Arrange
        String input = "[1,5]";
        MyRange range = new MyRange(input);
        boolean result = range.isStartWithOne();
        assertTrue(result);
    }

    @Test
    @DisplayName("ตัวเลขเริ่มต้นเป็น 1 โดยที่ input = [1,5), result = true")
    public void case18() {
        // Arrange
        String input = "[1,5)";
        MyRange range = new MyRange(input);
        boolean result = range.isStartWithOne();
        assertTrue(result);
    }

    @Test
    @DisplayName("ตัวเลขเริ่มต้นเป็น 1 โดยที่ input = (1,5], result = false")
    public void case19() {
        // Arrange
        String input = "(1,5]";
        MyRange range = new MyRange(input);
        boolean result = range.isStartWithOne();
        assertFalse(result);
    }

    @Test
    @DisplayName("ตัวเลขเริ่มต้นเป็น 1 โดยที่ input = (1,5), result = false")
    public void case20() {
        // Arrange
        String input = "(1,5)";
        MyRange range = new MyRange(input);
        boolean result = range.isStartWithOne();
        assertFalse(result);
    }
}

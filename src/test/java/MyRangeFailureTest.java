import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyRangeFailureTest {
    @Test
    @DisplayName("ขึ้นต้นด้วย [, ( และลงท้ายด้วย ], ) เท่านั้น input 1,5")
    public void case01() {
        try {
            MyRange range = new MyRange("1,5");
            range.validate();
            fail("ไม่ผิด");
        } catch (InputInvalidException e) {
            if(!"Input error".equals(e.getMessage())) {
                fail("Error message ผิด : " + e.getMessage());
            }
        }
    }

    @Test
    @DisplayName("ขึ้นต้นด้วย [, ( เท่านั้น input 1,5]")
    public void case02() {
        MyRange range = new MyRange("1,5]");
        Exception e = assertThrows(InputInvalidException.class, range::validateStart);
        assertEquals("Input error", e.getMessage());
    }

    @Test
    @DisplayName("ลงท้ายต้นด้วย ], ) เท่านั้น input [1,5")
    public void case03() {
        MyRange range = new MyRange("[1,5");
        Exception e = assertThrows(InputInvalidException.class, range::validateEnd);
        assertEquals("Input error", e.getMessage());
    }

}

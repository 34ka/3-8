import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests {
    @Test
    void successTest() {
        assertEquals(5 * 5, 25);
    }

    @Test
    void negativeTest() {
        assertEquals(5 * 5, 26);
    }
}

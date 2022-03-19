import org.junit.*;
import static org.junit.Assert.*;

public class SDemoTest {
    @Test
    public void testAdd() {
        assertEquals(4, SDemo.add(1, 2)); // Fails
    }
}
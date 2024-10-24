import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {
    @Test
    public void testTime() {
        Time time = new Time(3, 45);
        assertEquals(3, time.minute);
        assertEquals(45, time.second);

        time = new Time(10, 59);
        assertEquals(10, time.minute);
        assertEquals(59, time.second);
    } 
    
    @Test
    public void testFromString() {
        Time time = Time.fromString("05:30");
        assertEquals(5, time.minute);
        assertEquals(30, time.second);
    } 
}

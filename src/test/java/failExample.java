package test.java;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class failExample{
    @Test
    public void willFail()
    {
        assertEquals(1,2);
    }
}
package test.java; 
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class failExample{
    @Test
    public void willFail()
    {
        assertEquals(1,2);
    }
}
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IllegalCharExceptionTest {
    @Test
    public void name() {
        IllegalCharException illegalCharException = new IllegalCharException('0');
        assertEquals(illegalCharException.getMessage(),"Alphabet 0 is not allowed for this alphabet set.");
    }

}
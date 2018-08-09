import junit.framework.*;
import org.junit.Test;

import javax.print.attribute.standard.MediaSize;

import static org.mockito.Mockito.mock;

public class Example1Test extends TestCase {

    @Test
    public void testSimpleMethodLow(){
        Example1 example = new Example1(0);
        String result = example.simpleMethod();
        assertEquals("low",result);
    }

    @Test
    public void testSinpleMethodHigh(){
        Example1 example = new Example1(11);
        String result = example.simpleMethod();
        assertEquals("high", result);
    }

}

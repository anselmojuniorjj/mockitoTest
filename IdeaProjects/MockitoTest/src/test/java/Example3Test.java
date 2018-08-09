import junit.framework.*;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.spy;

public class Example3Test extends TestCase {
    public void testMethodOne(){
        Example3 example = new Example3();
        Example3 exampleSpy = spy(example);

        doAnswer(new Answer < Object >(){
            public Object answer(InvocationOnMock invocation){
                Object[] args = invocation.getArguments();
                assertEquals(2, args[0]);
                return null;
            }
        }).when(exampleSpy).methodTwo(anyInt());
        exampleSpy.methodOne(1);
    }
}

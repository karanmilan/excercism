import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {


    @Test
    public void helloNoName() {
        assertEquals("Hello, World!", HelloWorld.hello(""));
        assertEquals("Hello, World!", HelloWorld.hello(null));
    }

    @Test
    public void helloSampleName() {
        assertEquals("Hello, Alice!", HelloWorld.hello("Alice"));
    }

}

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
        {
            int expected=14;

Assert.assertTrue("Wrong number, not 14", number==expected);
    }


}

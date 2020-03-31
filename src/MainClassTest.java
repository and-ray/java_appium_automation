import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainClassTest extends MainClass{
    @Test
    public void testGetLocalNumber(){
        assertTrue("Результат выполнения метода родительского класса getLocalNumber() != 14", getLocalNumber() == 14);
    }
}

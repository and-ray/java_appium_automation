import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainClassTest extends MainClass{
    @Test
    public void testGetLocalNumber(){
        assertTrue("Результат выполнения метода родительского класса getLocalNumber() != 14", getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber(){
        assertTrue("Результат выполнения метода родительского класса getClassNumber() < 45", getClassNumber() > 45);
    }

    @Test
    public void testGetClassString(){
        assertTrue(" метод getClassString возвращает строку, в которой есть подстрока “hello” или “Hello”",
                getClassString().contains("hello") || getClassString().contains("Hello"));
    }
}

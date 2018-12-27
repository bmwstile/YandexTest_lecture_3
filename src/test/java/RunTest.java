import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RunTest {

    @Before
    public void start() {
        System.out.println("Начало теста");
    }

    @After
    public void exit() {
        System.out.println("Конец теста");
    }

    @Test
    public void passedTest() {
        String str1 = "Hello";
        String str2 = "Hello";
        Assert.assertEquals(str1,str2);

    }

    @Test
    public void failTest() {
        String str1 = "Hello";
        String str2 = "Hello word";
        Assert.assertEquals(str1,str2);

    }
}

import org.junit.Assert;
import org.junit.Test;

public class ApplesTest {

    @Test
    public void getApple() {
        Apples apple = new Apples();
        Assert.assertEquals("getApple returns wrong.", "apple", apple.getApple());
    }
}

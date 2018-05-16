import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

    Sharpie sharpie = new Sharpie();

    @Test
    public void inkAmountToNegative() {
        sharpie.inkAmount = 0.05f;
        sharpie.use();
        assertEquals(0.0f,sharpie.inkAmount,0);
    }
}
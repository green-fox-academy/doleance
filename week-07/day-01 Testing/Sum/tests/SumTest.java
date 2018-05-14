import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    Sum sum = new Sum();
    private ArrayList<Integer> numberList = new ArrayList<>();

    @Test
    public void isTheSumCorrect() {
        for (int i = 1; i <= 10; i++) {
            numberList.add(i);
        }
        Assert.assertEquals(55, Sum.sum(numberList));
    }

    @Test
    public void sumWithEmptyList() {
        Assert.assertEquals(0, Sum.sum(numberList));
    }

    @Test
    public void sumWithOneElement() {
        int oneNumberAboveAll = 5;
        numberList.add(oneNumberAboveAll);
        Assert.assertEquals(oneNumberAboveAll, Sum.sum(numberList));
    }

    @Test
    public void sumWithNullValue() {
        numberList.add(null);
        Assert.assertEquals(0, Sum.sum(numberList));
    }

    @Test (expected = NullPointerException.class)
    public void sumIfListIsNull() {
        Assert.assertEquals(0, Sum.sum(null));
    }

}
import org.junit.Assert;
import org.junit.Test;

public class TreeTest {
    @Test
    public void test1(){
        int[] arr = {-1};
        NumArray numArray = new NumArray(arr);
        Assert.assertEquals(-1 , numArray.sumRange(0, 0));
        numArray.update(0, 1);
        Assert.assertEquals(1 , numArray.sumRange(0, 0));

    }
}

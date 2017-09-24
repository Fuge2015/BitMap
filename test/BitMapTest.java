import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongfu on 17-9-23.
 */
public class BitMapTest {
    @Test
    public void set() throws Exception {
        BitMap bitMap = new BitMap(65);
        bitMap.set(32);
        Assert.assertEquals("00000000000000000000000000000000100000000000000000000000000000000",bitMap.toString());
    }

    @Test
    public void clear() throws Exception {
    }

    @Test
    public void get() throws Exception {
    }

    @Test
    public void getSize() throws Exception {
    }

//    @Test
//    public void toString() throws Exception {
//    }

}
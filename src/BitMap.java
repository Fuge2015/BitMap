/**
 * Created by dongfu on 17-9-23.
 */
public class BitMap {

    private final int[] BITMASK = new int[32];
    private final int[] map;
    private final int size;

    public BitMap(int n) {
        if (n <= 0) {
            map = new int[2];
            size = 64;
        } else {
            int count = (n >> 5) + 1;
            map = new int[count];
//            Java中int数据初始值为0;
//            for (int i = 0; i < count; i++) {
//                map[i] = 0x0000_0000;
//            }
            size = n;
        }

        int count = 0;
        while(count < 32) {
            BITMASK[count] = 0x8000_000 >>> count;
            count++;
        }
    }



    public void set(int n) {
        if (n < size) {
            int count = n >> 5;
            int s = n << 27 >>> 27;
//            int temp = 0x8000_0000;
//            temp = temp >>> s;
            map[count] |= BITMASK[s];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void clear(int n) {
        if (n < size) {
            int count = n >> 5;
            int s = n << 27 >>> 27;
//            int temp = 0x8000_0000;
//            temp = temp >>> s;
//            temp = ~temp;
            map[count] = map[count] & ~BITMASK[s];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int get(int n) {
        if (n < size) {
            int count = n >> 5; //  求得count = n/5的商,即map中的第count个int元素.
            int s = n << 27 >>> 27; // 求得s = n/5的余数,即第count个int元素的第s位.
//            int temp = 0x8000_0000;
//            temp = temp >>> s;
            return (map[count] & BITMASK[s]) != 0 ? 1 : 0; // 此处使用"!=",而不是">"的原因是map[count]如果为0x8000_0000时,依然返回1.
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(get(i));
        }
        return sb.substring(0, size);
    }
}

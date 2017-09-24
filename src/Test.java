/**
 * Created by dongfu on 17-9-24.
 */
public class Test {
    public static void main(String...args) {
        int a = 0x0000_0031;
        System.out.println(a >> 5);
        System.out.println(a << 27 >>>27);

        int b = 0x8000_0000;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b >>> 1).length());

        int c = 33;
        System.out.println(c);
        System.out.println(c << 2);
        System.out.println(c << 27 >> 27);
        System.out.println(c << 2 >>> 27);

    }
}

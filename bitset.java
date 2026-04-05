import java.util.BitSet;

public class bitset {
    public static void main(String[] args) {
        BitSet bs1 = new BitSet();
        // I have set the bit from 0 to 8,  in this 1, 3, 5, 7 are missing so they are false
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        bs1.set(8);

        BitSet bs2 = new BitSet();
//        bs1.set(0);
        bs2.set(1);
        bs2.set(2);
        bs2.set(3);
        bs2.set(4);
        bs2.set(5);
        bs2.set(6);
//        bs1.set(7);

//        bs1.and(bs2);
//        bs1.or(bs2);
        bs1.flip(0,bs1.length());


        System.out.println(bs1);
//        System.out.println(bs1.get(1));



    }
}

class test6{
    static {
        System.out.println("block1");
    }
    static {
        System.out.println("block2");
    }
}

public class staticblock {
//    static {
//        System.out.println("Block 1 ");
//    }
    public static void main(String[] args) {
        test6 t = new test6();
        System.out.println("Main");
//        test6 t = new test6();
    }
//    static {
//        System.out.println("Block 2");
//    }
}

public class Stringproblem2 {
    public static void main(String[] args) {
        String str = "#$hello@#$%^";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
        System.out.println(str.replaceAll("[a-zA-Z0-9]",""));
    }
}

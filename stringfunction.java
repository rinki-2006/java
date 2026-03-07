public class stringfunction {
    public static void main(String[] args) {
        String str = "  hello world";
        String str2 = "java";
        String str3 = "java";
        String a = str.toUpperCase();
        System.out.println("Upper case = " +a);

        System.out.println(str.length());

        a = str.trim();
        System.out.println("Trim = " +a);

        a = str.substring(3);
        System.out.println("Substring = " +a);

        a = str.substring(2,4);
        System.out.println("Substring = " +a);

        a = str.replace('e','a');
        System.out.println("Replace = " +a);

        System.out.println(str.endsWith("d"));

        System.out.println(str.startsWith("h"));

        System.out.println(str.charAt(2));

        System.out.println(str.indexOf("o"));

        System.out.println(str.lastIndexOf("d"));

        System.out.println(str.equals(str2));

        System.out.println(str2.equalsIgnoreCase(str3));

        System.out.println(str.compareTo(str2));









    }
}

public class Stringproblem {
    public static void main(String[] args) {
        String str = "rinkimittal2006@gmail.com";
        String username;
        String domain;

        int index = str.indexOf("@");
        System.out.println("index = " +index);

        username = str.substring(0,index);
        System.out.println("Username = " +username);

        domain = str.substring(index+1,str.length());
        System.out.println("Domain = " +domain);


    }
}

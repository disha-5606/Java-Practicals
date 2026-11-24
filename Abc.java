import java.util.*;

class Abc{   
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = in.nextLine();

        System.out.println("User name:" + s.substring(0, s.indexOf('@')));
        System.out.println("Company  :" + s.substring(s.indexOf('@') + 1, s.indexOf('.')));
        System.out.println("Domain   :" + s.substring(s.indexOf('.') + 1));
        in.close();
    }
}
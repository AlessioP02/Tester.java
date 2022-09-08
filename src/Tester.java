import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {


        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";



        System.out.println(veryLongString.replaceAll("um", "hum"));

        String[] strings = veryLongString.split("aliquip");

        String sub1 = strings[0];
        String sub2 = strings[1];

        System.out.println(sub1.trim() + sub2.trim());

        System.out.println("sub1 contiene 'est'? " + sub1.contains("est"));
        System.out.println("sub2 contiene 'est'? " + sub2.contains("est"));



    }
}

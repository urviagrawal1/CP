import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String name="Urvi Agrawal";   //string declaration
         
        System.out.println("enter string");
        String show=sc.next();        // for just one word user input
        //System.out.println(show);
        
        System.out.println("enter string");
        String showname=sc.nextLine(); // for any number of words i.e. sentences

        System.out.println(show);
        System.out.println(showname);
        
    }
}

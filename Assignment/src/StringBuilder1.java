//package Assignment.src;
import java.lang.StringBuilder;

/*
 * append
 * insert
 * replace
 * delete
 * reverse
 * capacity
 * charAt()
 * length
 * substring
 */
public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Pranjal");
                        //append
        str1.append(" Nehete");
        System.out.println(str1);

        //                  insert
        str1.insert(7, " G");
        System.out.println(str1);

        //              Replace
        str1.replace(0, 7, "P");
        System.out.println(str1);

        str1.insert(0, "Hi ");
        System.out.println(str1);

        str1.delete(0, 3);
        System.out.println(str1);

        //  capacity
        System.out.println(str1.capacity());
        
        
        //charAt
        System.out.println(str1.charAt(7));


        //substring
        System.out.println(str1.substring(0));
        System.out.println(str1);

        //reverse
        str1.reverse();
        System.out.println(str1);

    }
}

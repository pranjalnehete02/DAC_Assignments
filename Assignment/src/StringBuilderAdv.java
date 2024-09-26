//package Assignment.src;

public class StringBuilderAdv {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Hello");
        StringBuilder str2 = new StringBuilder("World");
        StringBuilder str3 = new StringBuilder("Hello");

        //equals and  contentEquals and == operator

        //                          EQUALS
        System.out.println(str1.equals(str2));  //false  
        System.out.println(str1.equals("Hello")); //false
        System.out.println(str1.equals(str3));  //false

        String str4 = "DAC";
        String str5 = "DAC";
        System.out.println(str4.equals(str5));  //true




        //                      CONTENTEQUALS
       // System.out.println(str1.contentEquals(str2));  




        

    }
}


/*
 * public class StringBuilderAdv {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Hello");
        StringBuilder str2 = new StringBuilder("World");
        StringBuilder str3 = new StringBuilder("Hello");

        // Using equals() method
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // Output: false
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // Output: false

        // Using contentEquals() method
        System.out.println("str1.contentEquals(str2): " + str1.contentEquals(str2.toString())); // Output: false
        System.out.println("str1.contentEquals(str3): " + str1.contentEquals(str3.toString())); // Output: true

        // Using == operator
        System.out.println("str1 == str2: " + (str1 == str2)); // Output: false
        System.out.println("str1 == str3: " + (str1 == str3)); // Output: false
    }
}
 */
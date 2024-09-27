//package Assignment.src;
import  java.util.*;

public class Stringss{
	
	public static void main(String[] args) {
		String str1="CDAC";
		System.out.println(str1);

		String str2="CDAC";
		System.out.println(str2);
		
		String str3="ACTS";
		System.out.println(str3);

		String Str4 = new String("CDAC");
		System.out.println(Str4);

		String Str5 = Str4.intern();
		System.out.println("Printing  interned string: "+Str5);

	}
}
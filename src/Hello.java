import java.text.ListFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hello {

	public static void main(String[] args) {
	// int num1=0b101;
	// System.out.println(num1);
	
	// int num2=0x7E;
	// System.out.println(num2);
	
	// int num3=10_00_00_000;
	// System.out.println(num3);
	
	// float num4=56;
	// System.out.println(num4);
	// double num5=56;
	// System.out.println(num5);
	
	// double num6=12e10;
	// System.out.println(num6);
	
	
	//boolean num7= 1;
//	System.out.println(num7);
List<String> s= Arrays.asList("silent","listen");
    List <String> l=Arrays.asList("chandana","rajyam");
	 List <String> lstream=s.stream().filter( l1 -> l1.charAt(0)=='p').sorted().collect(Collectors.toList());
	//List <String> lstream=l.stream().filter(l.charat((l.lastIndexOf())-1)).sorted().collect(Collectors.toList());
System.out.println("names starting with p:" + lstream);	
//target.charAt(target.length() - 1); 
}

}
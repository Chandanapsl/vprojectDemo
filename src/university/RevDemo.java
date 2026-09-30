package university;

import java.util.Scanner;

public class RevDemo {
    public static void main(String[] args) {
         System.out.println("enter the strings");
     Scanner s=new Scanner(System.in);
     
    
     String str=s.nextLine();
    System.out.println("enter the number please:");
     int num=s.nextInt();
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is Not Palindrome");
        }
   // String str = "never odd or even";
str=str.replaceAll("\\s", "").toLowerCase() ;
System.out.println(str.length());
String reversed = new StringBuilder(str).reverse().toString();
System.out.println(str.length());
System.out.println(reversed.length());
if(str.equals(reversed))
{
    System.out.println(" String is palindrome");
}
 else{
    System.out.println(" String is not a palindrome");
 }
}
//for numbers

}






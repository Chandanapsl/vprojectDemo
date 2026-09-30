package university;

import java.util.ArrayList;
import java.util.Collections;

public class StringRev {
    public static void main(String[] args) {
        
    
    String s="madam";

   ArrayList <Character> str=new ArrayList<>();
   char[] ch2=s.toCharArray();
    for(char ch1 :ch2)
    {
      str.add(ch1);
} 
Collections.reverse(str);
System.out.println(str);
}}
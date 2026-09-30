package university;

import java.util.regex.Pattern;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]", "g"));      // true
        System.out.println(Pattern.matches("[a-zA-Z]", "A"));
        int[][] a={{1,2,3,4},{67,3,9,34},{98,87,65}};

        for (int[] i : a) {
            for (int js : i) {
               System.out.print(js);
                
            }
            System.out.println( i.length); 
        }
    }
}

package university;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        // 1. Write a RegEx that will match any repeated word.
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";

        // 2. Complete the second compile argument for case-insensitivity.
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                // 3. Write the necessary arguments to replace duplicates with the first instance.
                input = m.replaceAll("$1");
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}

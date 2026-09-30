import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegDemo {

    public static void main(String[] args) {
        // 1. The RegEx that matches any repeated word
        String regex = "\\b(\\w+)(?:\\s+\\1\\b)+";
        
        // 2. The compile argument to make the RegEx case-insensitive
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                // 3. The two arguments for replaceAll to keep only the first occurrence
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        in.close();
    }
}
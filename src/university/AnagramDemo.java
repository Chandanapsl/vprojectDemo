package university;

import java.util.Arrays;



    public class AnagramDemo {
    public static boolean isAnagram(String str1, String str2) {
        // Remove all whitespace and convert to lowercase for case-insensitivity
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort both character arrays
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if sorted arrays are equal
        return Arrays.equals(charArray1, charArray2);

    }
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "silence";

        if (isAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are NOT anagrams.");
        }
    }

    }
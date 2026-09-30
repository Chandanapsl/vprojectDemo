

public static boolean PalinDemo(String s)
{
s=s.replaceAll("\\s", "").toLowerCase();
String rev="";
for(int i=s.length()-1;i>=0;i--)
{
    rev=rev+s.charAt(i);
}
System.out.println("reverse" + rev);
System.out.println("reverseeeeee" + rev);
return rev.equals(s);

}
public static void main(String args[])
{
    String s = "never odd or even";

        if (PalinDemo(s)) {
            System.out.println("\"" + s + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome.");
        }

}

// public static boolean PalinDemo(String s){

//         // Convert to lowercase for case-insensitive check
//         s = s.toLowerCase();
          // s=s.re
       // str2 = str2.replaceAll("\\s", "").toLowerCase();
//         // Reverse the string()
//         String rev = "";
//         for (int i = s.length() - 1; i >= 0; i--) {
//             rev = rev + s.charAt(i);
//         }
// // for(int i=s.length()-1;i>=0;i--)
// // {rev=rev+s.charAt(i)}
//         // Compare original and reversed
//         return s.equals(rev);
//     }

    // public static void main(String[] args) {

    //     String s = "never odd or even";

    //     if (PalinDemo(s)) {
    //         System.out.println("\"" + s + "\" is a palindrome.");
    //     } else {
    //         System.out.println("\"" + s + "\" is not a palindrome.");
    //     }
    // }


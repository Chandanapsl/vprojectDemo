package university;
public class CountDigits {
    // public static int countDg(int n) {
    //     if (n == 0) return 1;
    //     return (int) Math.floor(Math.log10(Math.abs(n))) + 1;

    // }
public static int countDg(int n)
{ if (n == 0) return 1;
    return(int) (Math.log10(Math.abs(n)))+1;
}
    public static void main(String[] args) {
        System.out.println(countDg(-1287678645)); // Output: 5
    }
}

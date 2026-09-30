package university;

import java.util.Scanner;

public class NoloopDemo {
    public static void printTillN(int n) {
        // Base case
        if (n <= 0) {
            return;
        }
        // System.out.print(n + " ");
        // Recursive call
        printTillN(n - 1);
        
        // Print current number
       System.out.print(n + " ");
    }

    public static void main(String[] args) {
        System.out.print("enter");
        Scanner a=new Scanner(System.in);
        int n1=a.nextInt();
        printTillN(n1); // Output: 1 2 3 4 5
    }
}
    


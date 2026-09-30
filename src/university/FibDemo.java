package university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//public class FibDemo{
    // public static int calculateSum(int n) {
    //     int a = 0, b = 0, sumf = 1;
        
    //     // Edge Case When n is 0
    //     if (n <= 0)
    //         return 0;

    //     int curr = 1;
    //   // System.out.println(0);
    //     for (int i = 2; i <= n; i++) {
    //         // update a,b and curr
    //         a = b;
    //         b = curr;
    //         curr = a + b;
    //         System.out.println(curr);
    //         sumf += curr;
    //     }
 
    //     return sumf;
    // }

    // public static void main(String[] args) {
    //      System.out.println("Enter how many numbers: ");
    //     Scanner s=new Scanner((System.in));
    //     int n = s.nextInt();
    //     if(n>1)
    //          System.out.println(0);
    //          System.out.println(1);
    //     System.out.println(calculateSum(n));
    // }


    //second method

    public class FibDemo {
    // Calculates Fibonacci number at index m
static int sumf=0;
    public static int fibonacci(int m) {
        if (m <= 0) return 0;
        if (m == 1) return 1;
        return fibonacci(m - 1) + fibonacci(m - 2);
    }

    // Prints the series up to n terms
    public static void printFibSeries(int n, int current) {
        if (current >= n) 
            return;
        
        System.out.print(fibonacci(current) + " ");
         sumf +=fibonacci(current);
        printFibSeries(n, current + 1);
       
       
    }

    public static void main(String[] args) {
         System.out.println("Enter how many numbers: ");
         Scanner s=new Scanner((System.in));
      int n1 = s.nextInt();
        printFibSeries(n1, 0); // Output: 0 1 1 2 3 5
        System.out.println("sum of many numbers: "+sumf);
       ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,23,434,534,6));
         
         a.add(2,111);
         a.set(3, 67);
         System.out.println("arraylist"+a);
       List<Integer> finallist= a.stream().filter( (elem )->elem%2==0).toList();
         System.out.println("FINALLIST"+finallist);
         List<Integer> finallist1= a.stream().filter( (elem )->elem%2!=0).toList();
         System.out.println("FINALLIST odd"+finallist1);
    }
}


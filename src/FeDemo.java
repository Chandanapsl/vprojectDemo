public class FeDemo
 {
    public static void main(String[] args) {
       // int[] b={1,2,3,4};
       int num=0;
    int sum1=0;
   int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
   
   for (int[] a1 : a) {
    
   
    for (int bf : a1) {
        
    sum1+=bf;
    num++;
    System.out.println(bf);}
   // System.out.println("sum"+sum1);
    
}
System.out.println("num"+num);
System.out.println("final"+(sum1/num));
}}
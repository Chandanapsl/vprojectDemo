public class WrapDemo {
    public static void main(String[] args) {
        int n=5;
        Integer num=n;  //autoboxing
        String s="250";
        int n2=num;//unboxing
        System.out.println(n);
         System.out.println(num);
          System.out.println(n2);
           System.out.println(s);
       int ns=Integer.parseInt(s);
 System.out.println(ns+n);

    }
}

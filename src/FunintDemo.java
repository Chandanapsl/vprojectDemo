import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunintDemo {
    public static void main(String[] args) {
    //   for numbers INPUT N RETURNS BOOLEAN TEST()
    // Predicate<Integer> p1 = (num)  ->  num%2==0;
    // System.out.println(p1.test(10) +"it is even");
    //''''''''''''''''''''''''''''''''''''''''
    // Predicate<String> p2 =(str) -> {
    //     String reversed = new StringBuilder(str).reverse().toString();
    //     return str.equals(reversed);};
    //     System.out.println(p2.test("neveroddoreven")+"palindrome");
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++
       // function fi IPUT N VALUE APPLY()
// Function<String,Integer> f1 = (str) -> str.length();
// System.out.println("Lenghht of the string"+ f1.apply("chandana"));
// Function<Integer,Integer> f2 = (num) -> num*num;
// System.out.println("square root"+ f2.apply(11));

//****************************** */
// IP BUT NO VALE  ACCEPT()
// Consumer<String> c1= (name) ->
// System.out.println(name);
// c1.accept("chandana sri lakshmi");
//********************************************
//SSUPPLER NO IP BUT RETURNS VALE
Supplier<Integer> s1=() ->(int)Math.random();
    System.out.println(s1.get());
    
}
}
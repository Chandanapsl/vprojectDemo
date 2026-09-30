package university;

public class Practice {
    public static void main(String[] args) {
        System.out.println("This is my practise file");
        int a=5;
        int a1[]={5,4,3,6};
       String str1="chandana";
       String  str2=new String("chandana");
        System.out.println(str1+str2);
        for (int i : a1) {
            System.out.println(i);  
        }
        if(str1==str2)
        {System.out.println("equal");

        }
 else if(str1.equals(str2))
 {System.out.println("equals equal");}
    
    else {System.out.println("not eual");}
}
    
}

package university;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWord {
    public static void main(String[] args) {
        //finding word in the string
        
         Scanner s=new Scanner(System.in);
        System.out.println("Enter the sentence" );
    String s6= new String(s.next().toLowerCase());
        // Scanner find=new Scanner(System.in);
        // System.out.println("Enter the word" );
        // find.next();
       // String txt="I love java bbb a lot java ";
        String find="is";
        //System.out.println("txt"+txt);
       // txt.toString().toLowerCase().

       // int index=s6.toLowerCase().indexOf(find.toLowerCase());
        
        Pattern p=Pattern.compile("\\b"+find+"\\b");
        Matcher m=p.matcher(s6);
        if(m.find()){
            System.out.println("matched at position" +m.start());
        }
        // if(txt.toLowerCase().contains(find.toLowerCase()))
        // { System.out.println("yes");
        //     System.out.println("at position" +index);
        // }
        else
            { System.out.println("no");}
    }
    
}

public class StrDemo {
public static void main(String[] args) {
    

    String s1="chandana";
    String s2=new String("chandana");
    if(s1.equals(s2))
    {
        System.out.println("euals   both are equal");
    }

if(s1==s2)
{
    System.out.println(" equal");
}
else{System.out.println("differernt declaratio");
}
    System.out.println("s1"+ s1.charAt(2));
// Get the identity hash code as an integer
int identityHash2 = System.identityHashCode(s2);
int identityHash1 = System.identityHashCode(s2);
// Convert it to a Hexadecimal string (mimicking a memory pointer format)
//String hexAddress = Integer.toHexString(identityHash2);
    System.out.println("heexaddress"+identityHash1 +"****"+identityHash2);
    StringBuffer sb = new StringBuffer("navin");
System.out.println("Capacity: " + sb.capacity()); // Output: 21
System.out.println("Length: " + sb + sb.length());
sb.append("reddy") ;// Out
System.out.println("string buffer sb Length: " + sb + sb.length());
String sbnew=new String(sb);
System.out.println("sbnew Length: " + sbnew);
String s3=s1.replace('a','x');
System.out.println("Replace: " + s3);
System.out.println("hashcode: " + s1.hashCode());
System.out.println("indexof: " + s1.indexOf('a'));
System.out.println("codepointat: " + s1.codePointAt(7));
System.out.println("compareto: " + s1.compareTo(s2));
System.out.println("comareto: " + s2.compareToIgnoreCase(s1));
System.out.println("concat: " + s1.concat(s2));
System.out.println("repeat the string: " + s2.repeat(4));
System.out.println("indexof: " + s1.indexOf("nd", 2));
System.out.println("replace: " + s1.replace('a', 'y'));
System.out.println("replace all: " + s1.replaceAll("yn","an"));
System.out.println("final: " +s1);
System.out.println("Length: " + sb.append("sdsad"));
System.out.println("Length: " + s1.length()+"\n"+ "stringbuffer");
System.out.println("Length: " + s1.indent(15));
System.out.println("Length: " + s1.contentEquals(sb));
System.out.println("Length: " + sb + sb.length());


}
}
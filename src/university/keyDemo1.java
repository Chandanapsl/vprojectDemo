package university;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class keyDemo1

{
  public static void main(String[] args) {

    // String str="Pr R ogram";
    String str = "programming";
    str = str.replaceAll("\\s", "").toLowerCase();

    Map<Character, Integer> charcount = new HashMap<>();
    for (char ch : str.toCharArray()) {
      charcount.put(ch, charcount.getOrDefault(ch, 0) + 1);
    }
    // for(char ch : str.toCharArray())
    // {
    // if(charcount.containsKey(ch))
    // {
    // charcount.put(ch, charcount.get(ch)+1);
    // }

    // else
    // {
    // charcount.put(ch,1);
    // }

    // System.out.println(charcount);
    
 
    String sentence = "I love javae";
    // String find="is";
    String[] words = sentence.split(" ");
 // String[] m=sentence.split("",)
    // System.out.println("display:"+words);
    // for(String w:words)
    // {
    // if(w.equals(find))
    // { System.out.println("found a word");

    // }
    // }
    Map<String, Integer> charCount1 = new HashMap<>();

    
    
    // String question = "I want to check which is longest substring";
    // String [] words = question.split(" ");
    // String temp = null;

    for (String word : words) {
      // if (charCount1.containsKey(word)) {
      // charCount1.put(word, charCount1.get(word) + 1);
      // } else {
      // charCount1.put(word, 1);
      // }
      // if(temp ==null || )


    
charCount1.put(word,word.length());


      charCount1.put(word, charCount1.getOrDefault(word, 0) + 1);
      
    }
    
    System.out.println(Collections.max(charCount1.values()));
    System.out.println(charcount);
    System.out.println(charCount1);
  }
}
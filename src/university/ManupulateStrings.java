package university;

import java.util.ArrayList;

import javax.swing.event.ListDataEvent;
import java.util.*;

public class ManupulateStrings {


    public static void main(String [] args){

        findWords();

    }

    static void findWords(){

        String question = "which is the longest word here in this block sentence towardss";
        String [] wordsArray = question.split(" ");
       String temp= null;
   

   
        for(String word : wordsArray){
            if(temp == null || temp.length() <= word.length()) {
                temp = word;
            }   
         
        }

        
        System.out.println("Longest word is: " + temp);
        System.out.println("Lenght of longest word is: " + temp.length());

        
        // for(String str : temp){

        //      System.out.println("Longest word is: " + str);
        // System.out.println("Lenght of longest word is: " + str.length());

            
        // }




    }

}

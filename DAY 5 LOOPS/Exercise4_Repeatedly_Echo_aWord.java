/* Exercise 4 — Repeatedly Echo a Word
Write a program that asks the user to enter a word. The program will then repeat word for as 
many times as it has characters: 
Enter a word:
Hello
3
Hello
Hello
Hello
Hello
Hello
To do this you will need to use the length() method of String that counts the number of 
characters in a string: 
String inputString;
int times;
. . . .
times = inputString.length()*/
 import java.util.*;

public class Exercise4_Repeatedly_Echo_aWord {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word to echo:");
        String a=sc.nextLine();
        int times;
        int i=0;
        times=a.length();
        while(i<times)
        
        
        {
        i=i+1;
        System.out.println(a);
        }
    }
    
}

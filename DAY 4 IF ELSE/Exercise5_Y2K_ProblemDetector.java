
import java.util.Scanner;
public class Exercise5_Y2K_ProblemDetector {
    public static void main(String args []){
    Scanner scan = new Scanner(System.in);
   
    System.out.print("Year of Birth: ");
    int birth = scan.nextInt();
    System.out.print("Current Year: ");
    int current = scan.nextInt();

    int age = current-birth;

    if(current<20){  
        int lower = current + 2000;
        int age2 = lower - (birth+1900);
        System.out.println("Your age:"+age2);}
 
   else if (birth<20){
     int age3 = current - birth;
      System.out.println("Your age:" + age3); }
   else {
 
    System.out.println("Your age:" + age);}
   }
}
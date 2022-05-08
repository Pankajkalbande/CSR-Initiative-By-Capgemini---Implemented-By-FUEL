import java.util.Scanner;

public class Exercise7_AgeInSecond {
    public static void main(String[] args) {
Scanner scan = new Scanner (System.in);

System.out.print( "Enter age in years: ");
int ageY = scan.nextInt();
System.out.print( "plus how many months: ");
int ageM = scan.nextInt();

int ageS = (((ageY *24)*60)*60);
int ageS1 = ageS + (31*24*60*60);
int ageS2 = ageS + (28*24*60*60) +(31*24*60*60);
int ageS3 = ageS + (31*24*60*60)+(28*24*60*60) +(31*24*60*60);
int ageS4 = ageS + (30*24*60*60)+ (31*24*60*60)+(28*24*60*60) +(31*24*60*60);
int ageS5 = ageS + (31*24*60*60)+ (30*24*60*60)+ (31*24*60*60)+(28*24*60*60*60) +(31*24*60*60);
int ageS6 = ageS + (30*24*60*60)+ (31*24*60*60)+ (30*24*60*60)+ (31*24*60*60)+(28*24*60*60) +(31*24*60*60);
int ageS7 = ageS + (31*24*60*60)+ (30*24*60*60)+ (31*24*60*60)+ (30*24*60*60)+ (31*24*60*60)+(28*24*60*60) +(31*24*60*60);
int  ageS8 = ageS + (31*24*60*60)+ (31*24*60*60)+ (30*24*60*60)+ (31*24*60*60)+ (30*24*60*60)+ (31*24*60*60)+(28*24*60*60) +(31*24*60*60);
int  ageS9 = ageS + (31*24*60*60)+ (31*24*60*60)+ (31*24*60*60)+ (30*24*60*60)+ (31*24*60*60)+ (30*24*60*60)+ (31*24*60*60)+(28*24*60*60) +(31*24*60*60);
int  ageS10 = ageS + (31*24*60*60)+ (31*24*60*60)+ (31*24*60*60)+ (31*24*60*60)+ (30*24*60*60)+ (31*24*60*60)+ (30*24*60*60)+ (31*24*60*60)+(28*24*60*60) +(31*24*60*60);
int  ageS11 = ageS + (30*24*60*60)+ (31*24*60*60)+ (31*24*60*60)+ (31*24*60*60)+ (31*24*60*60)+ (30*24*60*60)+ (31*24*60*60)+ (30*24*60*60)+ (31*24*60*60)+(28*24*60*60) +(31*24*60*60);
int  ageS12 = ageS + (31*24*60*60)+(30*24*60*60)+ (31*24*60*60)+ (31*24*60*60)+ (31*24*60*60)+ (31*24*60*60)+ (30*24*60*60)+ (31*24*60*60)+ (30*24*60*60)+ (31*24*60*60)+(28*24*60*60*60) +(31*24*60*60);

if (ageM == 1){
    System.out.println("Your age in seconds: " + ageS1);
}
if (ageM == 2){
    System.out.println("Your age in seconds: " + ageS2);
}
if (ageM == 3){
   
    System.out.println("Your age in seconds: " + ageS3);
}
if (ageM == 4){
    
    System.out.println("Your age in seconds: " + ageS4);
}
if (ageM == 5){
    
    System.out.println("Your age in seconds: " + ageS5);
}
if (ageM == 6){
  
    System.out.println("Your age in seconds: " + ageS6);
}
if (ageM == 7){
    
    System.out.println("Your age in seconds: " + ageS7);
}
if (ageM == 8){
    
    System.out.println("Your age in seconds: " + ageS8);
}
else if (ageM == 9){
    
    System.out.println("Your age in seconds: " + ageS9);
}
else if (ageM == 10){
    
    System.out.println("Your age in seconds: " + ageS10);
}
else if (ageM == 11){
    
    System.out.println("Your age in seconds: " + ageS11);
}
else if (ageM == 12){
    
    System.out.println("Your age in seconds: " + ageS12);
}
else if (ageM==0){

System.out.println("Your age in seconds: " + ageS);
}
}
}

}

}

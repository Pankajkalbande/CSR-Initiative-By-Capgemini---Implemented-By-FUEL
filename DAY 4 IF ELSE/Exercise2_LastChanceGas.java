import java.util.*;


public class Exercise2_LastChanceGas {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Tank capacity");
        int a=sc.nextInt();
        System.out.println("Enter gage reading ");
        int b=sc.nextInt();
        System.out.println("Enter miles per gallon");
        int c=sc.nextInt();
        int total=0;
        total=a+b+c;
     {
        System.out.println(total);
        }
        if(total<=100 || total>75)
        {
         System.out.println("gas is full");
     
        }
        else if(total<=75 || total>50)
        {
        System.out.println("gas is three quater full ");
     
        }
        
        else if(total<50)
        {
        System.out.println("get the gas ");
     
        }
        else
        {
        System.out.println("No Gas present");
        }
    }
    
}

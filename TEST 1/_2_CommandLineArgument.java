/* 
2. Write a Program that accepts your name (first name middle name and last name)
 as command line arguments and generate the output as given below.
Example:.
If the command line arguments are 
Sachin Ramesh Tendulkar 
then the output generated should be 
SACHIN RAMESH TENDULKAR
[Note: It is mandatory to pass three arguments in command line]

*/

public class _2_CommandLineArgument {
    public static void main(String[] args) {
        
        for(int i=0;i<args.length;i++)  {
            System.out.println("args[i]");  
        }
    }
}

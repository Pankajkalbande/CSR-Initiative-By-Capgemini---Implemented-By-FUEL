/* Write a program that averages the rain fall for three months, April, May, and June. 

Declare and initialize a variable to the rain fall for each month. 
Compute the average, and write out the results, something like:  

Rainfall for April:  12 
Rainfall for May : 14
Rainfall for June: 8
 Average rainfall: 11.333333 
To get the numerical values to line up use the tabulation character '\t' as part of the character string in the output statements. Check that your program prints the correct results. There is a beginner's error lurking in this program too! Did you fall victim to it?  
 
*/



public class Exercise6__AverageRainFall {
    public static void main(String[] args) {
        
        float rainfall_Aptil = 12;
        float rainfall_may   = 14;
        float rainfall_june  = 8;

        float Average = (rainfall_Aptil + rainfall_may + rainfall_june) / 3;
        System.out.println(" Average rainfall :"+ Average);
    }
    
}

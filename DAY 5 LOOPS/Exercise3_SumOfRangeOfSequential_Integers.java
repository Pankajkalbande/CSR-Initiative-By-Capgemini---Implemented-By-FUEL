/*Exercise 3 — Sum of a Range of Sequential Integers
Write a program that asks the user for two integers, low and high and then sums all the integers 
(inclusive) low through N. 
Enter low:
5
Enter high:
10
Sum = 45
Do this by noticing that the sum from low to high is the same as the sum from one to high minus 
the sum from one to (low-1). Calculate each of these by using the formula: 
sum = (n*(n+1))/2 */

import java.util.*;

public class Exercise3_SumOfRangeOfSequential_Integers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of low number:");
        int l = sc.nextInt();
        System.out.println("Enter the value of high number:");
        int h = sc.nextInt();
        int i;
        int sum = 0;
        int fsum = 0;
        int n = l - 1;
        for (i = l; i <= h; i = i + 1)
            sum = sum + i;
        fsum = (n * (n + 1)) / 2;
        {

            System.out.println(sum);
            System.out.println(fsum);
        }
    }

}

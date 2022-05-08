
/*Exercise 1 — Run of Integers
Write a program that asks the user for a starting value and an ending value and then writes all the
integers (inclusive) between those two values.
Enter Start:
5
Enter End:
9
5
6
7
8
9
*/
import java.util.*;

class Exercise1_RunOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting a number:");
        int a = sc.nextInt();
        System.out.println("Enter Ending a number: ");
        int b = sc.nextInt();
        int i = 0;
        for (i = a; i <= b; i = i + 1) {
            System.out.println(i + " ");
        }
    }
}
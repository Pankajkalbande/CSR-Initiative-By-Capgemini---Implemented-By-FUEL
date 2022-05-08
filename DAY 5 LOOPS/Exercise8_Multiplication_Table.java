// Write program to print multiplication table of a given number

import java.util.*;

public class Exercise8_Multiplication_Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the of which you need table:");

        int table = 0;

        int n = sc.nextInt();
        for (int i = 0; i <= 10; i++)

        {
            table = n * i;
            System.out.println(table);
        }

    }

}

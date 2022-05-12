
import java.util.*;

public class Exercise2_SumOfSequential_Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int i;
        int sum = 0;
        int sumbyformula = 0;
        for (i = 1; i <= n; i = i + 1)
            sum = sum + i;
        sumbyformula = (n * (n + 1)) / 2;
        {
            System.out.println(sum);
            System.out.println(sumbyformula);

        }
    }

}

import java.util.*;

public class Exercise4_PieEatingContest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight of contestant in pounds:");

        int a = sc.nextInt();

        if (a >= 100 && a <= 250) {
            System.out.println("contestant is eligible ");
        } else {
            System.out.println("contestant is not eligible ");
        }
    }

}

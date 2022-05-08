// Write program to calculate power of number (a raise to b) using while & for loop


public class Exercise10_PowerOfNumber_WhileLoop {
    public static void main(String[] args) {
        int base = 3, exponent = 4;

    long result = 1;

    while (exponent != 0) {
      result *= base;
      --exponent;
    }

    System.out.println("Answer = " + result);
    }
    
}

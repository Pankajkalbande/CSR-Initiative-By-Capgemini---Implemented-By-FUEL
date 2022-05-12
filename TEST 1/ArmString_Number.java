
public class ArmString_Number {
	public static void main(String[] args) {

		int number;
		int x, y, z;
		int sum = 0;
		System.out.print("Armstrong numbers range between 1 to 999 is :\n");
		for (int i = 1; i <= 999; i++) {
			number = i;
			while (number > 0) {
				y = number % 10;
				sum = sum + (y * y * y);
				number = number / 10;
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
			sum = 0;
		}
	}
}

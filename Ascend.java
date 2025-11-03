// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int ran = Integer.parseInt(args[0]);
		int num1 = (int) (Math.random() * (ran + 1));
        int num2 = (int) (Math.random() * (ran + 1));
        int num3 = (int) (Math.random() * (ran + 1)); 
        System.out.println(num1 + " " + num2 + " " + num3);
        int small = Math.min(num1, Math.min(num2, num3));
        int large = Math.max(num1, Math.max(num2, num3));
        int med = (num1 + num2 + num3) - small - large;
        System.out.println(small + " " + med + " " + large);

	}
}

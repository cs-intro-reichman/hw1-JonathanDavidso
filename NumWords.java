// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
public static void main(String args[]) {
	 int num = Integer.parseInt(args[0]);
int hundreds = num / 100;
int tens = (num / 10) % 10;
int units = num % 10;
System.out.println("The number is: " + num);
System.out.println("Hundreds: " + hundreds);
System.out.println("Tens: " + tens);
System.out.println("Units: " + units);

	}
}

// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int P = Integer.parseInt(args[0]);
		double r = Double.parseDouble(args[1]);
        int t = Integer.parseInt(args[2]);
        double rateMultiplier = 1 + r / 100.0;
        double fv = P * Math.pow(rateMultiplier, t);
		int fv2 = (int) fv;
		System.out.println("The future value of your investment is: " + fv2);
	}
}
// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int numberOfTerms = Integer.parseInt(args[0]);
		double sum = 0;
		double divisor = 1;
		int multiplier = 1;
		for(int i = 0; i < numberOfTerms; i++){
			sum += (1/divisor) * multiplier;
			multiplier *= -1;
			divisor += 2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + sum * 4);
	}
}

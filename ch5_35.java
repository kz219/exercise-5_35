/*
(Summation) Write a program to compute the following summation.
1 / (1 + v2) + 1 / (v2 + v3) + 1 / (v3 + v4) + ... +  1 / (v624 + v625)
*/

public class ch5_35 {
	public static void main(String [] args) {
		
		double summation = 0.0;
		
		for (double i = 1.0; i <= 624.0; i++) {
			summation += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
		}
		System.out.println("Summation " + summation);
	}

}

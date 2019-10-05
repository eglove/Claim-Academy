package savingsCalc;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SavingsCalc {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.###");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input present value: ");
		int pv = input.nextInt();
		System.out.print("Input rate: ");
		double rate = input.nextDouble();
		System.out.print("Input time: ");
		int time = input.nextInt();
		
		System.out.println(df.format(savings(pv, rate, time)));

	}
	
	public static double savings(int pv, double rate, int time) {
		
		rate = rate / 100;
		return pv * (1 + (rate * time));
	}
}

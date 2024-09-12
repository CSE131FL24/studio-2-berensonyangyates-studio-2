package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double startAmount;
		System.out.print("Start amount: ");
		startAmount = in.nextDouble();
		
		double winLimit;
		System.out.print("Win limit: ");
		winLimit = in.nextDouble();

		int winChance;
		System.out.print("Win chance (out of 100): ");
		winChance = in.nextInt();
		
		while (startAmount < winLimit && startAmount > 0) {
			int randNum = (int)(Math.random() * 100) +1;
			
			if (randNum <= winChance) {
				startAmount = startAmount + 1;
				System.out.println("Success: " +startAmount+ " Win");
			}
			else {
				startAmount = startAmount - 1;
				System.out.println("Ruin: " +startAmount+ " Lose");
			}
			
			if (startAmount < 1) {
				System.out.print("game over");
			}
			
				
			}
		}
	}

package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the start amount of money: ");
		int startAmount = in.nextInt();
		System.out.print("Enter the win chance: ");
		double winChance = in.nextDouble();
		System.out.print("Enter the win limit: ");
		double winLimit = in.nextDouble();
		System.out.print("Enter the days of simulation: ");
		int totalSimulations = in.nextInt();
		
		int Simulation = 1;
		while(Simulation <= totalSimulations) {
			int round = 0;
			int Amount = startAmount;
			while(startAmount < winLimit && startAmount > 0) {
				int win = 0;
				int lose = 0;
				
				double random = (double)(Math.random());
				if(random < winChance) {
					Amount = Amount + 1;
					win++;
				}
				else {
					Amount = Amount - 1;
					lose++;
				}
				
			}
			round++;
			if(startAmount == winLimit) {
				System.out.println("Simulation " + Simulation + ": " + round + " WIN");
			}
			else if(startAmount <= 0) {
				System.out.println("Simulation " + Simulation + ": " + round + " LOSE");
			}
			
			Simulation++;
		}
	}
}



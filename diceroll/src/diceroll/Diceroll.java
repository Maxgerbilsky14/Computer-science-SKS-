package diceroll;
import java.util.Random;
public class Diceroll {
	public static void main(String[] args) {
		
		int atte = 1;
		int totalattempts = 0;
		int i = 50;
		
		while (i>0) {
		
		Random rand=new Random();
		int upperbound=6;
		int diceRoll=rand.nextInt(upperbound) + 1;
		
		
		
		
		if(diceRoll != 6) {
			atte++;
		}
		else {
			System.out.println("number of tries: " + atte);
			totalattempts += atte;
			atte = 1;
			i--;	
					
		}
		
		}
		
		System.out.println("the average number of attempts is: " + (double)totalattempts / 50 );
		
		// TODO Auto-generated method stub
	}
}


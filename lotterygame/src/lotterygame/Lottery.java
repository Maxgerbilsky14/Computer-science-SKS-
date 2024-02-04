package lotterygame;
import java.util.Random;
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		
		
		while(1>0) {
			Random rand = new Random();
			int upperbound = 10;
			
			int lotterynumber1= rand.nextInt(upperbound);
		

			Random rand1 = new Random();
			int upperbound1 = 10;
			
			int lotterynumber2= rand.nextInt(upperbound1);
			
			
			Random rand2 = new Random();
			int upperbound2 = 10;
			
			int lotterynumber3= rand.nextInt(upperbound2);
			
			System.out.println("the lottery numbers are: " + lotterynumber1 + ", " + lotterynumber2 + ", " + lotterynumber3);
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("enter your first single digit number: ");
		int firstnumber = scanner1.nextInt();
		
		if(firstnumber > 9 || firstnumber < 0) {
			System.out.println("enter a digit between 0 and 9");
			continue;
			
			
		}
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("enter your second single digit number: ");
		int secondnumber = scanner2.nextInt();
		
		if(secondnumber > 9 || secondnumber < 0) {
			System.out.println("enter a digit between 0 and 9");
			continue;
			
			
		}
		
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("enter your third single digit number: ");
		int thirdnumber = scanner3.nextInt();

		if(thirdnumber > 9 || thirdnumber < 0) {
			System.out.println("enter a digit between 0 and 9");
			continue;
			
			
		}
		
		
		
		
		 // if(firstnumber == secondnumber || firstnumber == thirdnumber || secondnumber == thirdnumber) {
		//	System.out.println("cant repeat digits. Please start again");
		//	break;
		//}
		
		
	
		
		
		int matchingnumbers = 0;
		
		if (lotterynumber1 == firstnumber && lotterynumber2 == secondnumber && lotterynumber3 == thirdnumber) {
			System.out.println("You just Won the JACKPOT!");
			matchingnumbers = 4;
		}
			else {
		
		if (lotterynumber1 == firstnumber || lotterynumber1 == secondnumber || lotterynumber1 == thirdnumber) {
			matchingnumbers++;
			lotterynumber1 = -1;
			
		}
		if (lotterynumber2 == firstnumber || lotterynumber2 == secondnumber || lotterynumber2 == thirdnumber) {
			matchingnumbers++;
			lotterynumber2 = -2;
		}
		if (lotterynumber3 == firstnumber || lotterynumber3 == secondnumber || lotterynumber3 == thirdnumber) {
			matchingnumbers++;
			lotterynumber3 = -3;
		}
		
		if (firstnumber == lotterynumber1 && firstnumber == lotterynumber2 && lotterynumber2 != lotterynumber1) {
			matchingnumbers--;
		}
		
		if (firstnumber == lotterynumber3 && firstnumber == lotterynumber2 && lotterynumber2 != lotterynumber3) {
			matchingnumbers--;
		}
		
		if(firstnumber == lotterynumber1 && firstnumber == lotterynumber3 && lotterynumber3 != lotterynumber1) {
			matchingnumbers--;
		}
		
		if (secondnumber == lotterynumber1 && secondnumber == lotterynumber2 && lotterynumber2 != lotterynumber1) {
			matchingnumbers--;
		}
		
		if (secondnumber == lotterynumber3 && secondnumber == lotterynumber2 && lotterynumber3 != lotterynumber2) {
			matchingnumbers--;
		}
		
		if(secondnumber == lotterynumber1 && secondnumber == lotterynumber3 && lotterynumber3 != lotterynumber1) {
			matchingnumbers--;
		}
		
		if (thirdnumber == lotterynumber1 && thirdnumber == lotterynumber2 && lotterynumber1 != lotterynumber2) {
			matchingnumbers--;
		}
		
		if (thirdnumber == lotterynumber3 && thirdnumber == lotterynumber2 && lotterynumber2 != lotterynumber3) {
			matchingnumbers--;
		}
		
		if(thirdnumber == lotterynumber1 && lotterynumber3 == thirdnumber && lotterynumber3 != lotterynumber1) {
			matchingnumbers--;
		}
		}
		
		
		
		
		if (matchingnumbers == 1) {
			System.out.println("you won $10!");
		}
		if (matchingnumbers == 2) {
			System.out.println("you won $100!");
		}
		if (matchingnumbers == 3) {
			System.out.println("you won $1000");
		}
		
		if (matchingnumbers == 0) {
			System.out.println("Better luck next time!");
		}
		
		
	
		Scanner goagain = new Scanner(System.in);
		System.out.println("do you want to play again? (yes/no) ");
		String goagaininput = goagain.next();
		
		if(goagaininput.equals("yes")) {
		
		}
		else {
			break;
		
		
		}
	
		
		}
			
		}

	
	}
		
		
		// TODO Auto-generated method stub

	
	


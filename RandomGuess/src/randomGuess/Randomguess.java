package randomGuess;
import java.util.Random;
import java.util.Scanner;
public class Randomguess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int attempts = 0;
		
		
		Random rand=new Random();
		int upperbound=1000;
		int randomnum=rand.nextInt(upperbound) + 1;
		
		
		
		
		System.out.println(randomnum);
		
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int inputguess = scanner.nextInt();
		
		
		
		
		while (inputguess != randomnum) {
			attempts++;
			
			
			if (inputguess > randomnum) {
				System.out.println("too high");
			}
				else if (inputguess < randomnum) {
					System.out.println("too low");
				}
					System.out.println("Enter a number: ");
					scanner = new Scanner(System.in);
					 inputguess = scanner.nextInt();
					
					 
					 if (inputguess == randomnum) {
						 System.out.println("Correct!, the number of attempts was: "+ attempts);
					 }
					 
					
					
				}
			
			
			
			
		}
		
		
		

	}



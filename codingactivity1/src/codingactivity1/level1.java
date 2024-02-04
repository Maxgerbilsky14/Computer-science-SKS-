package codingactivity1;
import java.util.Scanner;
public class level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		level4();
		

	}
	
	public static void level1()
	
	{
		
		Scanner firstintinput = new Scanner (System.in);
		System.out.println("enter the first integer: ");
		double firstint = firstintinput.nextInt();
		

		Scanner secondintinput = new Scanner (System.in);
		System.out.println("enter the second integer: ");
		double  secondint = secondintinput.nextInt();

		Scanner thirdintinput = new Scanner (System.in);
		System.out.println("enter the first integer: ");
		double  thirdint = thirdintinput.nextInt();
		
		double smallest = firstint;
		
		if(firstint<smallest) {
			
			smallest = firstint;
			
		}
		
	if (thirdint<smallest) {
		smallest = thirdint;
	}
	
	double average = ((firstint + secondint + thirdint)/3);
	
	System.out.println("the smallest integer is: "+ smallest);
	System.out.println("the average is  "+ average);
	
	
	
		
		
		
	}

	public static void level4() {
		int lastdigit, addlastdigit = 0, int1 = 0, middledigit = 0;
		
		System.out.println("enter the integer: ");
		
		Scanner int1input = new Scanner (System.in);
		 int1 = int1input.nextInt();
		
	
		 lastdigit = int1 % 10;
		 middledigit= int1 % 10;
		 
	
		 
		// remove last digit from number
	
		
		
		
		System.out.println(lastdigit );
		System.out.println(middledigit);
		System.out.println(int1 + lastdigit + middledigit);
		
		
		
		
	

	}}

package jobcalculator;
import java.util.Scanner;
public class jobcalculatorclass {
	public static void main(String[] args) {
		
		
		//welcoming message
		System.out.println("Welcome to the job calculator!");
		
		//calling the method
		jobcalculator();
		
	}
	
public static void jobcalculator() {
while (1>0) {
		
		Scanner jobnameinput = new Scanner(System.in);
		System.out.println("What is the name of your job?");
		String jobname = jobnameinput.next();
		
		//asks for the cost of the materials
		
		Scanner materialsinput = new Scanner(System.in);
		System.out.println("What is the cost of your materials?");
		double materials = materialsinput.nextDouble();
		
		//asks for the number of hours worked
		
		Scanner hoursworkedinput = new Scanner(System.in);
		System.out.println("How many hours do you plan on working?");
		double hoursworked = hoursworkedinput.nextDouble();
		
		//asks for the number of hours spent traveling
	
		Scanner travelhoursinput = new Scanner(System.in);
		System.out.println("How many hours do you plan on travelling?");
		double travelhours = travelhoursinput.nextDouble();
		
		if (materials <= 0) {
			System.out.println("one of the inputs is invalid");
			break;
			
		}
		
		if (hoursworked <=0) {
			System.out.println("THE JOB WAS NOT DONE / INVALID INPUT");
			break;
		}
		if (travelhours <0) {
			System.out.println("one of the inputs is invalid");
			break;
		}
		
		
				System.out.println("here is your summary:");
				//print job name
				System.out.println("JOB: " + jobname);
				//print materials cost
				System.out.println("materials cost: " + materials);
				//print cost of working hours
				System.out.println("being in the job cost: " + (hoursworked * 35));
				//print cost of travel
				System.out.println("travel time cost: "+ (travelhours * 12));
				//print total repair cost
				System.out.println("your total cost repair cost will be: " + (materials + (hoursworked * 35)+ (travelhours * 12) ));
				
				System.out.println("...PRESS (y) TO START AGAIN...");
				Scanner enterint = new Scanner(System.in);
				String enter = enterint.next();
				
				if (enter.equals("y")) {
					
				}
				else {
					System.out.println("See ya!");
					break;
				}
				
				
}
}

}




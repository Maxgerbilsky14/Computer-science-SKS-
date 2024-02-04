package helloworld;
import java.util.Scanner;

public class Helloworld3 {

	public static void main(String[] args) {
		
		// name question and input
		String question = "what is your name?";
		System.out.print(question);
		Scanner input = new Scanner(System.in);
		
		
		String name;
		
		name = input.nextLine();
		
		
	
		System.out.print(" how old are you?");
		
		Scanner input2 = new Scanner(System.in);
		String age; 
		age = input2.nextLine();
		
		
System.out.print(" whats your gpa?");
		
		Scanner input3 = new Scanner(System.in);
		String gpa; 
		gpa = input2.nextLine();
		
		
		System.out.print("name:" + name+ " ");
		
		System.out.print("age: "+ age+" ");
		
		System.out.print( "gpa: " + gpa+" ");
		
		
}
}


package firstprojectforclass;
import java.util.Scanner; //IMPORT THE SCANNER UTILITIES 
public class firstpojforclass {

	public static void main(String[] args) {
		
		while (true) {
		
		Scanner scanner = new Scanner(System.in); //introducing the scanner variable for input
		 
		 
		System.out.print("Enter first digit: ");  //gets first digit of a 2 digit number
        int number1 = scanner.nextInt();
        
        // the input is stored in the variable named "number1"

        System.out.print("Enter second digit: "); //gets the 2nd digit
        int number2 = scanner.nextInt();
        
        // the input is stored in the variable named "number2"
        
       Scanner symbolScanner = new Scanner(System.in);
        System.out.print("enter math operation symbol you want to use");
        String symbol = symbolScanner.next(); // symbol is a CHAR not a STRING
        
        // asks to input the math operation type you want your two digits to do. 
        
       
        
        // set of if statements to execute the prompted symbol with the 2 digits provided
        
       
     // ADDITION IF STATEMENT
        
        if (symbol.equals("+")) {
        	
    System.out.println ("your answer is: " + (number1 + number2));
        
        		
        } // SUBSTRACTION IF STATEMENT
 
        if (symbol.equals("-")) {
        	
	 System.out.println ("your answer is: "+ (number1 - number2));
        	
	 
        } // MULTIPLICATION IF STATEMENT

        if (symbol.equals("*")) {
 	
	 System.out.println ("your answer is: " +(number1 * number2));
	 
 	
        } // DIVISION IF STATEMENT

        if (symbol.equals("/")) {
 	
	 System.out.println ("your answer is: " +(number1 / number2));
	 
	
	 
        } // MODULE IF STATEMENT

        if (symbol.equals("%")) {
	 	
	 System.out.println ("your answer is: " + (number1 % number2));
	 	
	 }
        
        
        // break the loop of while (true) if user input = no
        Scanner returnScanner = new Scanner(System.in);
        System.out.println("would you like to do another operation? yes/no: ") ;
        String returninput = returnScanner.nextLine();
        
        
        
        if (returninput.equals("no"))
        {
        	System.out.print("thanks for using this calculator! see you next time");
        break;
        }
        
;		// TODO Auto-generated method stub

	}
	}
}




		



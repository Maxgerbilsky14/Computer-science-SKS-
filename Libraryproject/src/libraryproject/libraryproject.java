package libraryproject;
import java.util.Scanner;
public class libraryproject {

	public static void main(String[] args) {
		

		
		// database of variables
		int TheKiller = 1;
		int Cookingbook = 1;
		int book1984 = 1;
		String TheKillerstatus;
		String CookingBookstatus;
		String Book1984status;
		
	
		// main menu set up
		while (true) {
		 Scanner scanner1 = new Scanner(System.in);
		System.out.println("Welcome to the GERBILSKY'S National library! please choose an option from below: (1,2,3)");
		System.out.println(" ");
		System.out.println("1. Check out a book");
		System.out.println("2. Return a book");
		System.out.println("3. Check book status");
		String libraryoptions = scanner1.next();
		
		
		
		
		// OPTION 1 
		
		if (libraryoptions.equals("1")) {
			
			System.out.println("Choose a book to check out from the list: ");
			System.out.println(" ");
			 Scanner scanner2 = new Scanner(System.in);
			 
			
			
			if (TheKiller == 1) {
				System.out.println(" 1 - The killer / AVBAILABLE");
				System.out.println(" ");
				
			}
			else {
				System.out.println(" 1 - The killer / OUT OF STOCK");
				System.out.println(" ");
				
			}
			
			if (Cookingbook == 1) {
				System.out.println(" 2 - Cooking book / AVBAILABLE");
				System.out.println(" ");
			}
			else {
				System.out.println(" 2 - Cooking book / OUT OF STOCK");
				System.out.println(" ");
				
			}
			
			if(book1984 == 1) {
				System.out.println(" 3 - book1984 / AVBAILABLE");
				System.out.println(" ");
			}
			else {
				System.out.println(" 3 - book1984 / AVBAILABLE / OUT OF STOCK");
				System.out.println(" ");
				
			}
			 String choosebook = scanner2.next();
			 
			 Scanner exitorcontinue = new Scanner(System.in);
			
			if (choosebook.equals("1")) {
				System.out.println("you succsefully checked out the book /THE KILLER/");
				TheKiller = 0;
				System.out.println("would you like to return to the main menu? (Y/N)");
				String exitorcontinue1 = exitorcontinue.next();
				if (exitorcontinue1.equals("y")) {
					System.out.println("Ok"); }
					else {
						break;
					}
				
			}
			
		
			if (choosebook.equals("2")) {
				System.out.println("you succsefully checked out the book /COOKING BOOK/");
				Cookingbook = 0;
				System.out.println("would you like to return to the main menu? (Y/N)");
				String exitorcontinue1 = exitorcontinue.next();
				if (exitorcontinue1.equals("y")) {
					System.out.println("Ok"); }
					else {
						break;
					}
			}
			
			if (choosebook.equals("3")) {
				System.out.println("you succsefully checked out the book /BOOK1984/");
				book1984 = 0;
				System.out.println("would you like to return to the main menu? (Y/N)");
				String exitorcontinue1 = exitorcontinue.next();
				if (exitorcontinue1.equals("y")) {
					System.out.println("Ok"); }
					else {
						break;
					}
			}
			
			
			
		}
		
		
		
		
		
		// OPTION 2
		
		if(libraryoptions.equals("2")) {
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("Choose a book to return");
			
			
			if (TheKiller == 0) {
				System.out.println(" 1 - The killer / UNRETURNED");
				
			}
			
			if (Cookingbook == 0) {
				System.out.println(" 2 - Cooking book / UNRETURNED");
			}
			
			if(book1984 == 0) {
				System.out.println(" 3 - book1984 / UNRETURNED");
			}
			
			if (TheKiller == 1) {
				System.out.println("The killer / ON STOCK");
				
			}
			
			if (Cookingbook == 1) {
				System.out.println("Cooking book / ON STOCK");
			}
			
			if(book1984 == 1) {
				System.out.println("book1984 / ON STOCK");
			}
			
			Scanner exitorcontinue = new Scanner(System.in);
			String returnbook = scanner3.next();
			
			if(returnbook.equals("1") && TheKiller == 0) {
				System.out.println("you have returned the book /The Killer/");
				TheKiller = 1;}
			else if (returnbook.equals("1") && TheKiller == 1) {
					System.out.println("you cant return this book");
				}
				
					
			
			if(returnbook.equals("2")&& Cookingbook == 0) {
				System.out.println("you have returned the book /Cooking Book/");
				Cookingbook = 1;}
			else  if (returnbook.equals("2")&& Cookingbook == 1) {
					System.out.println("you cant return this book");
					
}
			if(returnbook.equals("3")&& book1984 == 0) {
				System.out.println("you have returned the book /book 1984/");
				book1984 = 1;}
			else if(returnbook.equals("3")&& book1984 == 1) {
					System.out.println("you cant return this book");
					
					
				}
				System.out.println("would you like to return to the main menu? (Y/N)");
				String exitorcontinue1 = exitorcontinue.next();
				if (exitorcontinue1.equals("y")) {
					System.out.println("Ok"); }
					else {
						break;
					}
			
			
		}
		

		if(TheKiller == 0) {
			 TheKillerstatus = "Not on Stock";
		}
		else {
			TheKillerstatus = "abvailable";
			
		}
		if(Cookingbook == 0) {
			CookingBookstatus = "Not on Stock";
		}
		else {
			CookingBookstatus = "abvailable";
			
		}
		if(book1984 == 0) {
			Book1984status = "Not on Stock";
		}
		else {
			Book1984status = "abvailable";
			
			
		}
		
		
		
		
		
		//OPTION 3
	if(libraryoptions.equals("3")) {
			
			System.out.println("TheKiller: "+ TheKillerstatus);
			System.out.println(" ");
			System.out.println("Cooking Book: "+ CookingBookstatus);
			System.out.println(" ");
			System.out.println("Book 1984: "+ Book1984status);
			System.out.println(" ");
			System.out.println("would you like to return to the main menu? (Y/N)");
			Scanner exitorcontinue4 = new Scanner(System.in);
			String exitorcontinue5 = exitorcontinue4.next();
			if (exitorcontinue5.equals("y")) {
				System.out.println("Ok"); }
				else {
					break;
				}
		
		
		
		}
	
		
		
			
		

	}

	}}

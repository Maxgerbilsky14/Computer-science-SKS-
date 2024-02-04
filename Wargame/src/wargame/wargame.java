package wargame;
import java.util.Random;
import java.util.Scanner;

public class wargame {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("hello, welcome to the war game, press 'enter' start playing: ");
		String welcome = scanner.nextLine();
		// TODO Auto-generated method stub
		boolean gameon = true;
		while (gameon == true) {
			
		
		if (welcome.equals("")) {
			wargame();
			 scanner= new Scanner(System.in);
			 System.out.println(" ");
			System.out.println("PRESS ENTER TO PLAY AGAIN (or input a character to exit) : ");
			 welcome = scanner.nextLine();
			
			
		}
		else {
			System.out.println("are you sure you dont want to play?(yes/no)");
			Scanner scanner1 = new Scanner(System.in);
			String question = scanner1.next();
			if (question.equals("no")) {
				 gameon = true;
				wargame();
				
			}
			else {
				System.out.println("see you next time!");
				gameon = false;
				break;
			}
		}}
		}
		
			public static void wargame() {
				
				boolean gameon = true;
				while (gameon == true) {
				
		Random rand1=new Random();
		int upperbound=13;
		int firstone=rand1.nextInt(upperbound) + 1;
		//second player
		Random rand5=new Random();
		int upperbound5=13;
		int secondone=rand5.nextInt(upperbound) + 1;
		
		// make sure they are not the same 
		
		int signcheck1 = 0;
				int signcheck2 = 0;
				Random rand2=new Random();
				int upperbound1=4;
				int select1=rand2.nextInt(upperbound1) + 1;
				
				Random rand4=new Random();
				 upperbound1=4;
				 signcheck2 = 0;
				int select2=rand4.nextInt(upperbound1) + 1;
			
				if(firstone == secondone && select1 == select2) {
					
					
					
					
						wargame();
						break;
						
						
						
					}
					else {
					
					}
				
					
				

					
		
		// search for a card between 2 and 10
		if (firstone >= 2 && firstone <= 10) {
 signcheck1 = 0;
			 rand2=new Random();
			 upperbound1=4;
			 select1=rand2.nextInt(upperbound1) + 1;
			
			switch (select1) {
			case 1:
				System.out.println("my card is: " + firstone + " clubs");
				signcheck1 = 1;
				break;
				
			case 2:
				System.out.println("my card is: " + firstone + " diamonds");
				signcheck1 = 2;
				break;
			case 3:
				System.out.println("my card is: " + firstone + " hearts");
				signcheck1 = 3;
				break;
				
			case 4: 
				
				System.out.println("my card is: " + firstone + " spades");
				signcheck1 = 4;
				break;
			}
			}
		
		
		// ace search for player number one 
		if (firstone == 1) {
			 rand2=new Random();
			 upperbound1=4;
			 select1=rand2.nextInt(upperbound1) + 1;
			 signcheck1 = 0;
			switch (select1) {
			case 1:
				System.out.println("my card is: " + "ace " + "clubs");
				signcheck1 = 1;
				break;
				
			case 2:
				System.out.println("my card is: " + "ace " + "diamonds");
				signcheck1 = 2;
				break;
				
			case 3:
				System.out.println("my card is: " + "ace " + "hearts");
				signcheck1 = 3;
				break;
				
			case 4: 
				System.out.println("my card is: " + "ace " + "spades");
				signcheck1 = 4;
				break;
			}
			
		}
		//
		if (firstone <= 13 && firstone >= 11) {
			 signcheck1 = 0;
			if (firstone == 11) {
				 rand2=new Random();
				int upperbound2=4;
				 select1=rand2.nextInt(upperbound2) + 1;
				switch (select1) {
				case 1:
					System.out.println("my card is: " + "jack " + "clubs");
					signcheck1 = 1;
					break;
					
				case 2:
					System.out.println("my card is: " + "jack " + "diamonds");
					signcheck1 = 2;
					break;
					
				case 3:
					System.out.println("my card is: " + "jack " + "hearts");
					signcheck1 = 3;
					break;
					
				case 4: 
					System.out.println("my card is: " + "jack " + "spades");
					signcheck1 = 4;
					break;
				}
				
				
				
			}
			if (firstone == 12) {
				 rand2=new Random();
				int upperbound2=4;
				
				 select1=rand2.nextInt(upperbound2) + 1;
				switch (select1) {
				case 1:
					System.out.println("my card is: " + "queen " + "clubs");
					signcheck1 = 1;
					break;
					
				case 2:
					System.out.println("my card is: " + "queen " + "diamonds");
					signcheck1 = 2;
					break;
					
				case 3:
					System.out.println("my card is: " + "queen " + "hearts");
					signcheck1 = 3;
					break;
					
				case 4: 
					System.out.println("my card is: " + "queen " + "spades");
					signcheck1 = 4;
					break;
				}
			}
			if (firstone == 13) {
				 rand2=new Random();
				int upperbound2=4;
				 select1=rand2.nextInt(upperbound2) + 1;
				switch (select1) {
				case 1:
					System.out.println("my card is: " + "king" + "clubs");
					signcheck1 = 1;
					break;
					
				case 2:
					System.out.println("my card is: " + "king " + "diamonds");
					signcheck1 = 2;
					break;
					
				case 3:
					System.out.println("my card is: " + "king " + "hearts");
					signcheck1 = 3;
					break;
					
				case 4: 
					System.out.println("my card is: " + "king " + "spades");
					signcheck1 = 4;
					break;
				}
			}
				
				
			
			
		}
		
		if (secondone >= 2 && secondone <= 10) {

			 rand4=new Random();
			 upperbound1=4;
			 signcheck2 = 0;
			 select2=rand4.nextInt(upperbound1) + 1;
			
			switch (select2) {
			case 1:
				System.out.println("your card is: " + secondone + " clubs");
				 signcheck2 = 1;
				break;
				
			case 2:
				System.out.println("your card is: " + secondone + " diamonds");
				 signcheck2 = 2;
				break;
			case 3:
				System.out.println("your card is: " + secondone + " hearts");
				 signcheck2 = 3;
				break;
				
			case 4: 
				System.out.println("your card is: " + secondone + " spades");
				 signcheck2 = 4;
				break;
			}
			}
		
		
		// ace search for player number one 
		if (secondone == 1) {
			 rand4=new Random();
			 upperbound1=4;
			 select2=rand4.nextInt(upperbound1) + 1;
			  signcheck2 = 0;
			switch (select2) {
			case 1:
				System.out.println("your card is: " + "ace " + "clubs");
				 signcheck2 = 1;
				break;
				
			case 2:
				System.out.println("your card is: " + "ace " + "diamonds");
				 signcheck2 = 2;
				break;
				
			case 3:
				System.out.println("your card is: " + "ace " + "hearts");
				 signcheck2 = 3;
				break;
				
			case 4: 
				System.out.println("your card is: " + "ace " + "spades");
				 signcheck2 = 4;
				break;
			}
			
		}
		
		if (secondone <= 13 && secondone >= 11) {
			
			if (secondone == 11) {
				 rand4=new Random();
				int upperbound2=4;
				  signcheck2 = 0;
				 select2=rand4.nextInt(upperbound2) + 1;
				switch (select2) {
				case 1:
					System.out.println("your card is: " + "jack " + "clubs");
					 signcheck2 = 1;
					break;
					
				case 2:
					System.out.println("your card is: " + "jack " + "diamonds");
					 signcheck2 = 2;
					break;
					
				case 3:
					System.out.println("your card is: " + "jack " + "hearts");
					 signcheck2 = 3;
					break;
					
				case 4: 
					System.out.println("your card is: " + "jack " + "spades");
					 signcheck2 = 4;
					break;
				}
				
				
				
			}
			if (secondone == 12) {
				 rand4=new Random();
				int upperbound2=4;
				  signcheck2 = 0;
				 select2=rand4.nextInt(upperbound2) + 1;
				switch (select2) {
				case 1:
					System.out.println("your card is: " + "queen " + "clubs");
					 signcheck2 = 1;
					break;
					
				case 2:
					System.out.println("your card is: " + "queen " + "diamonds");
					 signcheck2 = 2;
					break;
					
				case 3:
					System.out.println("your card is: " + "queen " + "hearts");
					 signcheck2 = 3;
					break;
					
				case 4: 
					System.out.println("your card is: " + "queen " + "spades");
					 signcheck2 = 4;
					break;
				}
			}
			if (secondone == 13) {
				 rand4=new Random();
				int upperbound2=4;
				 signcheck2 = 0;
				 select2=rand4.nextInt(upperbound2) + 1;
				switch (select2) {
				case 1:
					System.out.println("your card is: " + "king" + "clubs");
					 signcheck2 = 1;
					break;
					
				case 2:
					System.out.println("your card is: " + "king " + "diamonds");
					 signcheck2 = 2;
					break;
					
				case 3:
					System.out.println("your card is: " + "king " + "hearts");
					 signcheck2 = 3;
					break;
					
				case 4: 
					System.out.println("your card is: " + "king " + "spades");
					 signcheck2 = 4;
					break;
				}
			}
				
				
			
			
		}
		if (firstone == 1) {
			System.out.println("you lost");
		}
		else if (secondone == 1) {
			System.out.println("you won");
			}
		else if (firstone > secondone) {
			System.out.println("you lost");
			}
		else if (firstone < secondone){
			System.out.println("you won");
		}
			else if (firstone == secondone && signcheck1 != signcheck2){
				
				System.out.println("TIE the values for each sign are: ");
				System.out.println("clubs = 1");
				System.out.println("diamond = 2");
				System.out.println("hearts = 3");
				System.out.println("spades = 4");
				
				if (signcheck1 > signcheck2) {
					System.out.println("you lost");
				}
					else if (signcheck1 < signcheck2) {
						System.out.println("you won");
						
					
				}
		}
		
			
				break;
					}
			

		}}
		

			
		
	
		
		
	
	
		


	



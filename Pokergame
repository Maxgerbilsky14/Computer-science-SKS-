package organizedpoker;

import java.util.Random;
import java.util.Scanner;

public class organizedpokergame {

	public static void main(String[] args) {
		
		// game on or off boolean and scanner for game loop
		boolean gameon = false;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("hello, welcome to the poker game, press 'y' start playing: ");
		String welcome = scanner.next();
		
		if(welcome.equals("y")) {
			gameon = true;
		}
		else {
			gameon = false;
		}
		
		while (gameon == true) {
		
		
		// creating first player randioms for numbers
		Random rand1=new Random();
		int upperbound=13;
		int firstone=rand1.nextInt(upperbound) + 1;
		
		 rand1=new Random();
		 upperbound=13;
		int secondone=rand1.nextInt(upperbound) + 1;
		
		 rand1=new Random();
		 upperbound=13;
		int thirdone=rand1.nextInt(upperbound) + 1;
		
		 rand1=new Random();
		 upperbound=13;
		int fourthone=rand1.nextInt(upperbound) + 1;
		
		 rand1=new Random();
		 upperbound=13;
		int fifthone=rand1.nextInt(upperbound) + 1;
		
		
		// creating first player randoms for suits
		
		Random suitsrand =new Random();
		int upperbound1=4;
		int suitsrandom1=suitsrand.nextInt(upperbound1) + 1;
		
		 suitsrand =new Random();
		 upperbound1=4;
		int suitsrandom2=suitsrand.nextInt(upperbound1) + 1;
		
		
		 suitsrand =new Random();
		 upperbound1=4;
		int suitsrandom3=suitsrand.nextInt(upperbound1) + 1;
		
		
		 suitsrand =new Random();
		 upperbound1=4;
		int suitsrandom4=suitsrand.nextInt(upperbound1) + 1;
		
		
		 suitsrand =new Random();
		 upperbound1=4;
		int suitsrandom5=suitsrand.nextInt(upperbound1) + 1;
		
		
		// creating second player randoms for numbers
		
		Random rand2=new Random();
		 upperbound=13;
		int firstone2=rand2.nextInt(upperbound) + 1;
		
		 rand2=new Random();
		 upperbound=13;
		int secondone2=rand2.nextInt(upperbound) + 1;
		
		 rand2=new Random();
		 upperbound=13;
		int thirdone2=rand2.nextInt(upperbound) + 1;
		
		 rand2=new Random();
		 upperbound=13;
		int fourthone2=rand2.nextInt(upperbound) + 1;
		
		 rand2=new Random();
		 upperbound=13;
		int fifthone2=rand2.nextInt(upperbound) + 1;
		
		
		
		// creating second player random for suits
		
		Random suitsrand2 =new Random();
		 upperbound1=4;
		int suitsrandom6=suitsrand2.nextInt(upperbound1) + 1;
		
		 suitsrand2 =new Random();
		 upperbound1=4;
		int suitsrandom7=suitsrand2.nextInt(upperbound1) + 1;
		
		
		 suitsrand2 =new Random();
		 upperbound1=4;
		int suitsrandom8=suitsrand2.nextInt(upperbound1) + 1;
		
		
		 suitsrand2 =new Random();
		 upperbound1=4;
		int suitsrandom9=suitsrand2.nextInt(upperbound1) + 1;
		
		
		 suitsrand2 =new Random();
		 upperbound1=4;
		int suitsrandom10=suitsrand2.nextInt(upperbound1) + 1;

		
		
		//strings for methods

		String firstcard = "";
		
		String secondcard = "";
		
		String thirdcard = "";
		
		String fourthcard = "";
		
		String fifthcard = "";

		
		
		String firstcard2 = "";
		
		String secondcard2 = "";
		
		String thirdcard2 = "";
		
		String fourthcard2 = "";
		
		String fifthcard2 = "";

	
		
// card generator methods
		
		
	
		firstcard = firstcardgenerator(firstcard, firstone, suitsrandom1 );
		secondcard = secondcardgenerator(secondcard, secondone, suitsrandom2);
		thirdcard = thirdcardgenerator(thirdcard, thirdone, suitsrandom3);
		fourthcard = fourthcardgenerator(fourthcard, fourthone, suitsrandom4);
		fifthcard = fifthcardgenerator(fifthcard, fifthone, suitsrandom5);
		
		
		
		firstcard2 = firstcardgenerator2(firstcard, firstone2, suitsrandom6 );
		secondcard2 = secondcardgenerator2(secondcard, secondone2, suitsrandom7);
		thirdcard2 = thirdcardgenerator2(thirdcard, thirdone2, suitsrandom8);
		fourthcard2 = fourthcardgenerator2(fourthcard, fourthone2, suitsrandom9);
		fifthcard2 = fifthcardgenerator2(fifthcard, fifthone2, suitsrandom10);
		
		
// create organized arrays 
		
		 int[] organizearray = {firstone, secondone, thirdone, fourthone, fifthone};
		 int[] organizearray1 = {firstone2, secondone2, thirdone2, fourthone2, fifthone2};
		 
		 int[] organizearraysuits = {suitsrandom1, suitsrandom2, suitsrandom3, suitsrandom4, suitsrandom5};
		 int[] organizearraysuits1 = {suitsrandom6, suitsrandom7, suitsrandom8, suitsrandom9 ,suitsrandom10};
		 
		
		
		
		// print the game
		
	System.out.println("Player1: ");
		    System.out.println(" ");
		    System.out.println(firstcard + " || " + secondcard + " || " + thirdcard + " || " + fourthcard  + " || " + fifthcard);
		   
				
		    System.out.println(" ");
		  
		    
		    System.out.println("Player2: ");
		    System.out.println(" ");
		    System.out.println(firstcard2 + " || " + secondcard2 + " || " + thirdcard2 + " || " + fourthcard2  + " || " + fifthcard2);
		    System.out.println(" ");
			  
		    
		 boolean royalflush2 = false;
		 boolean straightflush2 = false;
		 boolean fourofakind2 = false;
		 boolean pair2 = false;
		   boolean flush2 = false;
		   boolean twopair2 = false;
		   boolean straight2= false;
		   boolean threeofakind2 = false;
		   boolean fullhouse2 = false;
		   
		   
		   boolean threeofakind4 = false;
		   boolean royalflush4 = false;
		   boolean straightflush4 = false;
		   boolean fourofakind4 = false;
		   boolean pair4 = false;
		   boolean flush4 = false;
		boolean twopair4 = false;
		   boolean straight4 = false;
		   boolean fullhouse4 = false;
		    
		   
		   threeofakind2 = threeofakind(organizearray, threeofakind2);
		   
		royalflush2 =  royalflush1(organizearray, organizearraysuits, royalflush2);
		    
		 
		straightflush2 =   straightflush1(organizearray, organizearraysuits, straightflush2);
		    
		 
		fourofakind2 =   fourofakind(organizearray, fourofakind2);
		    
		flush2 = flush(organizearray, organizearraysuits, flush2);
		
		 pair2 = pair(organizearray, pair2);
		 
		 twopair2 = twopair(organizearray, twopair2);
		 
		 straight2= straight(organizearray, straight2);
		 
		 threeofakind2 = threeofakind(organizearray, threeofakind2);
		 
		 
		 
		 royalflush4 =  royalflush4(organizearray1, organizearraysuits1, royalflush4);
		    
		 
			straightflush4 =   straightflush4(organizearray1, organizearraysuits1, straightflush4);
			    
			 
			fourofakind4 =   fourofakind4(organizearray1, fourofakind4);
			    
			flush4 = flush4(organizearray1, organizearraysuits1, flush4);
			
			 pair4 = pair4(organizearray1, pair4);
			 
			 twopair4 = twopair4(organizearray1, twopair4);
			 straight4= straight4(organizearray1, straight4);
			 threeofakind4 = threeofakind4(organizearray1, threeofakind4);
			 
			 
			 
			 
			 
				 int highestvalue1 = organizearray[0];
	
			        for (int a = 1; a < organizearray.length; a++) {
			            if (organizearray[a] > highestvalue1) {
			                highestvalue1 = organizearray[a];
			            }
			        }
			        
		        int highestvalue2 = organizearray1[0];

		        for (int b = 1; b < organizearray1.length; b++) {
		            if (organizearray1[b] > highestvalue2) {
		                highestvalue2 = organizearray1[b];
		            }
		        }
		        
		        int smallestvalue = organizearray[0];

		        for (int c = 1; c < organizearray.length; c++) {
		            if (organizearray[c] < smallestvalue) {
		            	smallestvalue = organizearray[c];
		            }
		        }
		        
		        int smallestvalue2 = organizearray1[0];

		        for (int d = 1; d < organizearray1.length; d++) {
		            if (organizearray1[d] < smallestvalue2) {
		            	smallestvalue2 = organizearray1[d];
		            }
		        }
			 
		 
		int player1 = 0;
		int player2 = 0;
		
		String hand1 = "";
		String hand2 = "";
		    
		    
		    if(royalflush2) {
		    	player1 = 10;
		    
		    }
		    if(straightflush2) {
		    	player1 = 9;
		    
		    }
		    if(fourofakind2) {
		    	player1 = 8;
		    	
		    }
		    if(pair2) {
		    	player1 = 2;
		    
		    }
		    if (flush2) {
		    	player1 = 7;
		    
		    	
		    }
		    if(twopair2) {
		    	player1 = 3;
		    	
		    }
		   if (straight2) {
			   player1 = 5;
		   }
		
		   if(threeofakind2) {
			   player1 = 4;
		   }
		  

	
	 if(royalflush4) {
	    	player2 = 10;
	    }
	    if(straightflush4) {
	    	player2 = 9;
	    }
	    if(fourofakind4) {
	    	player2 = 8;
	    }
	    if(pair4) {
	    	player2 = 2;
	    }
	    if (flush4) {
	    	player2 = 7;
	    	
	    }
	    if(twopair4) {
	    	player2 = 3;
	    }
	    if (straight4) {
			   player2 = 5;
		   }
		
	    if(threeofakind4) {
			   player2 = 4;
		   }
	   
	    
	    
	      if(player1 == player2) {
	    	  
	    	  
	    	  if (smallestvalue == 1) {
	    		  player1 = 1;
	    		  hand1 = "highcard";
	    		  
	    	  }
	    	  else  if(smallestvalue2 == 1) {
	    		  player2 = 1;
	    		  hand2 = "highcard";
	    		  
	    	  }
	    	  else	   if (highestvalue1 > highestvalue2) {
				   player1 = 1;
				   hand1 = "highcard";
			   }
			   else   if (highestvalue1 < highestvalue2) {
				   player2 = 1;
				   hand2 = "highcard";
			   }
		   }

		 
	     
	
	
	
	switch (player1){
	
	case 1:
		hand1 = "highcard";
	break;
	case 2:
		hand1 = "pair";
		break;
	case 3:
		hand1 = "twopair";
		break;
	case 4:
		hand1 = "threeofakind";
		break;
	case 5:
		hand1 = "straight";
		break;
	case 6:
		hand1 = "flush";
		break;
	case 7:
		hand1 = "fullhouse";
		break;
	case 8:
		hand1 = "fourofakind";
		break;
	case 9:
		hand1 = "straightflush";
		break;
	case 10:
		hand1 = "royalflush";
		break;
		
	}
switch (player2){
	
	case 1:
		hand2 = "highcard";
	break;
	case 2:
		hand2 = "pair";
		break;
	case 3:
		hand2 = "twopair";
		break;
	case 4:
		hand2 = "threeofakind";
		break;
	case 5:
		hand2 = "straight";
		break;
	case 6:
		hand2 = "flush";
		break;
	case 7:
		hand2 = "fullhouse";
		break;
	case 8:
		hand2 = "fourofakind";
		break;
	case 9:
		hand2 = "straightflush";
		break;
	case 10:
		hand2 = "royalflush";
		break;
		
	}

if (player1 > player2) {
	System.out.println("player1 has won with a: "+ hand1 + " against: "+ hand2);
}
else if (player1 < player2) {
	System.out.println("player2 has won with a: "+ hand2 + " against: "+ hand1);
}
else if (player1 == player2) {
	System.out.println("tie with player1: "+ hand1 + " against player2: "+ hand2);
	
}

scanner= new Scanner(System.in);
System.out.println(" ");

System.out.println("do you want to keep playing? (press enter): ");
 welcome = scanner.nextLine();

if(welcome.equals("")) {
	gameon = true;
	
}
else {
	gameon = false;
}


			
		
	}
	
	
	}
	
   
	public static boolean royalflush1(int[] organizearray, int[] organizearraysuits, boolean royalflush) {
		
			royalflush = false;
			  if (organizearraysuits[0] == organizearraysuits[1] && organizearraysuits[1] == organizearraysuits[2] && organizearraysuits[2] == organizearraysuits[3] && organizearraysuits[3] == organizearraysuits[4]) {

			      
			        if ((organizearray[4] - 1 == organizearray[3]) && (organizearray[3] - 1 == organizearray[2]) && (organizearray[2] - 1 == organizearray[1]) && (organizearray[1] - 1 == organizearray[0])) {

			          
			            if (organizearray[0] == 10 && organizearray[1] == 11 && organizearray[2] == 12 && organizearray[3] == 13 && organizearray[4] == 1) {
			                royalflush = true;
			            }}}
			return royalflush;
		}
	
	
	
	
	public static boolean straightflush1(int[] organizearray, int[] organizearraysuits, boolean straightflush) {
		straightflush = false;
		 if (organizearraysuits[0] == organizearraysuits[1] && organizearraysuits[1] == organizearraysuits[2] && organizearraysuits[2] == organizearraysuits[3] && organizearraysuits[3] == organizearraysuits[4]) {
		        
		       
		        if ((organizearray[4] - 1 == organizearray[3]) && (organizearray[3] - 1 == organizearray[2]) && (organizearray[2] - 1 == organizearray[1]) && (organizearray[1] - 1 == organizearray[0])) {
		            
		            straightflush = true;
		        }
		    }
		return straightflush;
		
	}
	
	
	
	public static boolean flush (int[] organizearray,int[] organizearraysuits, boolean flush ) {
		flush = false;
		 if (organizearraysuits[0] == organizearraysuits[1] && organizearraysuits[1] == organizearraysuits[2] && organizearraysuits[2] == organizearraysuits[3] && organizearraysuits[3] == organizearraysuits[4]) {
			 flush = true;
		 }
	
		return flush;
	}
	
	
	
	public static boolean fourofakind(int[] organizearray, boolean fourmatch) {
		  fourmatch = false;

		 if (organizearray[0] == organizearray[1] && organizearray[0] == organizearray[2] && organizearray[0] == organizearray[3]) {
		     fourmatch = true;
		 } else if (organizearray[0] == organizearray[1] && organizearray[0] == organizearray[2] && organizearray[0] == organizearray[4]) {
		     fourmatch = true;
		 } else if (organizearray[0] == organizearray[1] && organizearray[0] == organizearray[3] && organizearray[0] == organizearray[4]) {
		     fourmatch = true;
		 } else if (organizearray[0] == organizearray[2] && organizearray[0] == organizearray[3] && organizearray[0] == organizearray[4]) {
		     fourmatch = true;
		 } else if (organizearray[1] == organizearray[2] && organizearray[1] == organizearray[3] && organizearray[1] == organizearray[4]) {
		     fourmatch = true;
		 }
		 
		 return fourmatch;
	}
	
	
	
	public static boolean pair(int[] organizearray, boolean pair) {
		
		boolean match = false;
		if (organizearray[0] == organizearray[1] || organizearray[0] == organizearray[2] || organizearray[0] == organizearray[3] || organizearray[0] == organizearray[4]) {
			
			 match = true;
			 
			
	        } else if (organizearray[1] == organizearray[2] || organizearray[1] == organizearray[3] || organizearray[1] == organizearray[4]) {
	        	
	        	match = true;
				
	        } else if (organizearray[2] == organizearray[3] || organizearray[2] == organizearray[4]) {
	        	
	        	match = true;
				
	        } else if (organizearray[3] == organizearray[4]) {
	        	
	        	match = true;
				
	        }
		
		
		if (match == true) {
			pair = true;
			
		}
		return pair;

	}
	
	public static boolean twopair(int[] organizearray, boolean twopair) {
		twopair = false;
		

		    if ((organizearray[0] == organizearray[1] && (organizearray[2] == organizearray[3] || organizearray[2] == organizearray[4] || organizearray[3] == organizearray[4]))
		        || (organizearray[1] == organizearray[2] && organizearray[3] == organizearray[4])) {
		        twopair = true;
		    }

	
		

		
		return twopair;
	}
	
	
	public static boolean straight (int[] organizearray, boolean straight) {
		straight = false;
		if ((organizearray[4] - 1 == organizearray[3]) && (organizearray[3] - 1 == organizearray[2]) && (organizearray[2] - 1 == organizearray[1]) && (organizearray[1] - 1 == organizearray[0])) {
            
		
			straight = true;
		}
			
				
				return straight;
		
	}
	
	public static boolean threeofakind(int[] organizearray, boolean threeofakind) {
		threeofakind = false;
		 if ((organizearray[0] == organizearray[1] && organizearray[1] == organizearray[2]) || (organizearray[0] == organizearray[1] && organizearray[1] == organizearray[3])  || (organizearray[0] == organizearray[1] && organizearray[1] == organizearray[4]) || (organizearray[0] == organizearray[2] && organizearray[2] == organizearray[3]) || (organizearray[0] == organizearray[2] && organizearray[2] == organizearray[4]) || (organizearray[0] == organizearray[3] && organizearray[3] == organizearray[4]) || (organizearray[1] == organizearray[2] && organizearray[2] == organizearray[3]) || (organizearray[1] == organizearray[2] && organizearray[2] == organizearray[4]) || (organizearray[1] == organizearray[3] && organizearray[3] == organizearray[4]) || (organizearray[2] == organizearray[3] && organizearray[3] == organizearray[4])) {
		            threeofakind = true;
		        }
		return threeofakind;
	}

	
	public static boolean fullhouse(int[] organizearray, boolean fullhouse) {
		fullhouse = false;
		 if ((organizearray[0] == organizearray[1] && organizearray[1] == organizearray[2] && organizearray[3] == organizearray[4]) || (organizearray[0] == organizearray[1] && organizearray[1] == organizearray[3] && organizearray[2] == organizearray[4]) || (organizearray[0] == organizearray[1] && organizearray[1] == organizearray[4] && organizearray[2] == organizearray[3]) || (organizearray[0] == organizearray[2] && organizearray[2] == organizearray[3] && organizearray[1] == organizearray[4]) || (organizearray[0] == organizearray[2] && organizearray[2] == organizearray[4] && organizearray[1] == organizearray[3]) || (organizearray[0] == organizearray[3] && organizearray[3] == organizearray[4] && organizearray[1] == organizearray[2]) || (organizearray[1] == organizearray[2] && organizearray[2] == organizearray[3] && organizearray[0] == organizearray[4]) || (organizearray[1] == organizearray[2] && organizearray[2] == organizearray[4] && organizearray[0] == organizearray[3]) || (organizearray[1] == organizearray[3] && organizearray[3] == organizearray[4] && organizearray[0] == organizearray[2]) || (organizearray[2] == organizearray[3] && organizearray[3] == organizearray[4] && organizearray[0] == organizearray[1])) {
		            fullhouse = true;
		        }
		 return fullhouse;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean royalflush4(int[] organizearray, int[] organizearraysuits, boolean royalflush) {
		
		royalflush = false;
		  if (organizearraysuits[0] == organizearraysuits[1] && organizearraysuits[1] == organizearraysuits[2] && organizearraysuits[2] == organizearraysuits[3] && organizearraysuits[3] == organizearraysuits[4]) {

		      
		        if ((organizearray[4] - 1 == organizearray[3]) && (organizearray[3] - 1 == organizearray[2]) && (organizearray[2] - 1 == organizearray[1]) && (organizearray[1] - 1 == organizearray[0])) {

		          
		            if (organizearray[0] == 10 && organizearray[1] == 11 && organizearray[2] == 12 && organizearray[3] == 13 && organizearray[4] == 1) {
		                royalflush = true;
		            }}}
		return royalflush;
	}




public static boolean straightflush4(int[] organizearray, int[] organizearraysuits, boolean straightflush) {
	straightflush = false;
	 if (organizearraysuits[0] == organizearraysuits[1] && organizearraysuits[1] == organizearraysuits[2] && organizearraysuits[2] == organizearraysuits[3] && organizearraysuits[3] == organizearraysuits[4]) {
	        
	       
	        if ((organizearray[4] - 1 == organizearray[3]) && (organizearray[3] - 1 == organizearray[2]) && (organizearray[2] - 1 == organizearray[1]) && (organizearray[1] - 1 == organizearray[0])) {
	            
	            straightflush = true;
	        }
	    }
	return straightflush;
	
}



public static boolean flush4 (int[] organizearray,int[] organizearraysuits, boolean flush ) {
	flush = false;
	 if (organizearraysuits[0] == organizearraysuits[1] && organizearraysuits[1] == organizearraysuits[2] && organizearraysuits[2] == organizearraysuits[3] && organizearraysuits[3] == organizearraysuits[4]) {
		 flush = true;
	 }

	return flush;
}



public static boolean fourofakind4(int[] organizearray, boolean fourmatch) {
	  fourmatch = false;

	 if (organizearray[0] == organizearray[1] && organizearray[0] == organizearray[2] && organizearray[0] == organizearray[3]) {
	     fourmatch = true;
	 } else if (organizearray[0] == organizearray[1] && organizearray[0] == organizearray[2] && organizearray[0] == organizearray[4]) {
	     fourmatch = true;
	 } else if (organizearray[0] == organizearray[1] && organizearray[0] == organizearray[3] && organizearray[0] == organizearray[4]) {
	     fourmatch = true;
	 } else if (organizearray[0] == organizearray[2] && organizearray[0] == organizearray[3] && organizearray[0] == organizearray[4]) {
	     fourmatch = true;
	 } else if (organizearray[1] == organizearray[2] && organizearray[1] == organizearray[3] && organizearray[1] == organizearray[4]) {
	     fourmatch = true;
	 }
	 
	 return fourmatch;
}



public static boolean pair4(int[] organizearray, boolean pair) {
	
	boolean match = false;
	if (organizearray[0] == organizearray[1] || organizearray[0] == organizearray[2] || organizearray[0] == organizearray[3] || organizearray[0] == organizearray[4]) {
		
		 match = true;
		 
		
        } else if (organizearray[1] == organizearray[2] || organizearray[1] == organizearray[3] || organizearray[1] == organizearray[4]) {
        	
        	match = true;
			
        } else if (organizearray[2] == organizearray[3] || organizearray[2] == organizearray[4]) {
        	
        	match = true;
			
        } else if (organizearray[3] == organizearray[4]) {
        	
        	match = true;
			
        }
	
	
	if (match == true) {
		pair = true;
		
	}
	return pair;

}

public static boolean twopair4(int[] organizearray, boolean twopair) {
	twopair = false;


	    if ((organizearray[0] == organizearray[1] && (organizearray[2] == organizearray[3] || organizearray[2] == organizearray[4] || organizearray[3] == organizearray[4]))
	        || (organizearray[1] == organizearray[2] && organizearray[3] == organizearray[4])) {
	        twopair = true;
	    }

	

	
	return twopair;
}

public static boolean straight4 (int[] organizearray, boolean straight) {
	straight = false;
	if ((organizearray[4] - 1 == organizearray[3]) && (organizearray[3] - 1 == organizearray[2]) && (organizearray[2] - 1 == organizearray[1]) && (organizearray[1] - 1 == organizearray[0])) {
        
	
		straight = true;
	}
		
			
			return straight;
	
}

public static boolean threeofakind4(int[] organizearray, boolean threeofakind) {
	threeofakind = false;
	 if ((organizearray[0] == organizearray[1] && organizearray[1] == organizearray[2]) || (organizearray[0] == organizearray[1] && organizearray[1] == organizearray[3]) || (organizearray[0] == organizearray[1] && organizearray[1] == organizearray[4]) || (organizearray[0] == organizearray[2] && organizearray[2] == organizearray[3]) || (organizearray[0] == organizearray[2] && organizearray[2] == organizearray[4]) || (organizearray[0] == organizearray[3] && organizearray[3] == organizearray[4]) || (organizearray[1] == organizearray[2] && organizearray[2] == organizearray[3]) || (organizearray[1] == organizearray[2] && organizearray[2] == organizearray[4]) || (organizearray[1] == organizearray[3] && organizearray[3] == organizearray[4]) || (organizearray[2] == organizearray[3] && organizearray[3] == organizearray[4])) {
	            threeofakind = true;
	        }
	return threeofakind;
}

public static boolean fullhouse4(int[] organizearray, boolean fullhouse) {
	fullhouse = false;
	 if ((organizearray[0] == organizearray[1] && organizearray[1] == organizearray[2] && organizearray[3] == organizearray[4])  || (organizearray[0] == organizearray[1] && organizearray[1] == organizearray[3] && organizearray[2] == organizearray[4]) || (organizearray[0] == organizearray[1] && organizearray[1] == organizearray[4] && organizearray[2] == organizearray[3]) || (organizearray[0] == organizearray[2] && organizearray[2] == organizearray[3] && organizearray[1] == organizearray[4]) || (organizearray[0] == organizearray[2] && organizearray[2] == organizearray[4] && organizearray[1] == organizearray[3]) || (organizearray[0] == organizearray[3] && organizearray[3] == organizearray[4] && organizearray[1] == organizearray[2])  || (organizearray[1] == organizearray[2] && organizearray[2] == organizearray[3] && organizearray[0] == organizearray[4]) || (organizearray[1] == organizearray[2] && organizearray[2] == organizearray[4] && organizearray[0] == organizearray[3]) || (organizearray[1] == organizearray[3] && organizearray[3] == organizearray[4] && organizearray[0] == organizearray[2]) || (organizearray[2] == organizearray[3] && organizearray[3] == organizearray[4] && organizearray[0] == organizearray[1])) {
	            fullhouse = true;
	        }
	 return fullhouse;
}




	
	
		
		
		
	
	
	
	
	

	public static String firstcardgenerator(String firstcard, int firstone, int suitsrandom ) {
		
		 



		 
		String suits1 [] = {"clubs", "diamonds", "hearts","spades"};




		if (firstone > 1 && firstone < 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = firstone + (suits1[0]);
			break;
		case 2:
			firstcard = firstone + (suits1[1]);
			break;
		case 3: 
			firstcard = firstone + (suits1[2]);
			break;
		case 4: 
			firstcard = firstone + (suits1[3]);
			break;
			


		}
		}
		if (firstone == 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = "jack "+ (suits1[0]);
			break;
		case 2:
			firstcard = "jack " + (suits1[1]);
			break;
		case 3: 
			firstcard = "jack " + (suits1[2]);
			break;
		case 4: 
			firstcard = "jack " + (suits1[3]);
			break;
			

			
		}

		}
		if (firstone == 12) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "queen "+ (suits1[0]);
					break;
				case 2:
					firstcard = "queen " + (suits1[1]);
					break;
				case 3: 
					firstcard = "queen " + (suits1[2]);
					break;
				case 4: 
					firstcard = "queen " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 13) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "king "+ (suits1[0]);
					break;
				case 2:
					firstcard = "king " + (suits1[1]);
					break;
				case 3: 
					firstcard = "king " + (suits1[2]);
					break;
				case 4: 
					firstcard = "king " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 1) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "ace "+ (suits1[0]);
					break;
				case 2:
					firstcard = "ace " + (suits1[1]);
					break;
				case 3: 
					firstcard = "ace " + (suits1[2]);
					break;
				case 4: 
					firstcard = "ace " + (suits1[3]);
					break;
					
				
					
				}
		firstone = 14;
				
			}

		return firstcard;



		}


		public static String secondcardgenerator(String firstcard, int firstone, int suitsrandom) {
			
			



		// TODO Auto-generated method stub
		 
		String suits1 [] = {"clubs", "diamonds", "hearts","spades"};




		if (firstone > 1 && firstone < 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = firstone + (suits1[0]);
			break;
		case 2:
			firstcard = firstone + (suits1[1]);
			break;
		case 3: 
			firstcard = firstone + (suits1[2]);
			break;
		case 4: 
			firstcard = firstone + (suits1[3]);
			break;
			


		}
		}
		if (firstone == 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = "jack "+ (suits1[0]);
			break;
		case 2:
			firstcard = "jack " + (suits1[1]);
			break;
		case 3: 
			firstcard = "jack " + (suits1[2]);
			break;
		case 4: 
			firstcard = "jack " + (suits1[3]);
			break;
			

			
		}

		}
		if (firstone == 12) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "queen "+ (suits1[0]);
					break;
				case 2:
					firstcard = "queen " + (suits1[1]);
					break;
				case 3: 
					firstcard = "queen " + (suits1[2]);
					break;
				case 4: 
					firstcard = "queen " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 13) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "king "+ (suits1[0]);
					break;
				case 2:
					firstcard = "king " + (suits1[1]);
					break;
				case 3: 
					firstcard = "king " + (suits1[2]);
					break;
				case 4: 
					firstcard = "king " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 1) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "ace "+ (suits1[0]);
					break;
				case 2:
					firstcard = "ace " + (suits1[1]);
					break;
				case 3: 
					firstcard = "ace " + (suits1[2]);
					break;
				case 4: 
					firstcard = "ace " + (suits1[3]);
					break;
					
				
					
				}
		firstone = 14;
				
			}


		return firstcard;



		}


		public static String thirdcardgenerator(String firstcard, int firstone, int suitsrandom) {
			
			


		// TODO Auto-generated method stub
		 
		String suits1 [] = {"clubs", "diamonds", "hearts","spades"};




		if (firstone > 1 && firstone < 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = firstone + (suits1[0]);
			break;
		case 2:
			firstcard = firstone + (suits1[1]);
			break;
		case 3: 
			firstcard = firstone + (suits1[2]);
			break;
		case 4: 
			firstcard = firstone + (suits1[3]);
			break;
			


		}
		}
		if (firstone == 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = "jack "+ (suits1[0]);
			break;
		case 2:
			firstcard = "jack " + (suits1[1]);
			break;
		case 3: 
			firstcard = "jack " + (suits1[2]);
			break;
		case 4: 
			firstcard = "jack " + (suits1[3]);
			break;
			

			
		}

		}
		if (firstone == 12) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "queen "+ (suits1[0]);
					break;
				case 2:
					firstcard = "queen " + (suits1[1]);
					break;
				case 3: 
					firstcard = "queen " + (suits1[2]);
					break;
				case 4: 
					firstcard = "queen " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 13) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "king "+ (suits1[0]);
					break;
				case 2:
					firstcard = "king " + (suits1[1]);
					break;
				case 3: 
					firstcard = "king " + (suits1[2]);
					break;
				case 4: 
					firstcard = "king " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 1) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "ace "+ (suits1[0]);
					break;
				case 2:
					firstcard = "ace " + (suits1[1]);
					break;
				case 3: 
					firstcard = "ace " + (suits1[2]);
					break;
				case 4: 
					firstcard = "ace " + (suits1[3]);
					break;
					
				
					
				}
		firstone = 14;
				
			}

		return firstcard;



		}

		public static String fourthcardgenerator(String firstcard, int firstone,  int suitsrandom) {
			
			



		// TODO Auto-generated method stub
		 
		String suits1 [] = {"clubs", "diamonds", "hearts","spades"};



		if (firstone > 1 && firstone < 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = firstone + (suits1[0]);
			break;
		case 2:
			firstcard = firstone + (suits1[1]);
			break;
		case 3: 
			firstcard = firstone + (suits1[2]);
			break;
		case 4: 
			firstcard = firstone + (suits1[3]);
			break;
			


		}
		}
		if (firstone == 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = "jack "+ (suits1[0]);
			break;
		case 2:
			firstcard = "jack " + (suits1[1]);
			break;
		case 3: 
			firstcard = "jack " + (suits1[2]);
			break;
		case 4: 
			firstcard = "jack " + (suits1[3]);
			break;
			

			
		}

		}
		if (firstone == 12) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "queen "+ (suits1[0]);
					break;
				case 2:
					firstcard = "queen " + (suits1[1]);
					break;
				case 3: 
					firstcard = "queen " + (suits1[2]);
					break;
				case 4: 
					firstcard = "queen " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 13) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "king "+ (suits1[0]);
					break;
				case 2:
					firstcard = "king " + (suits1[1]);
					break;
				case 3: 
					firstcard = "king " + (suits1[2]);
					break;
				case 4: 
					firstcard = "king " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 1) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "ace "+ (suits1[0]);
					break;
				case 2:
					firstcard = "ace " + (suits1[1]);
					break;
				case 3: 
					firstcard = "ace " + (suits1[2]);
					break;
				case 4: 
					firstcard = "ace " + (suits1[3]);
					break;
					
				
					
				}
		firstone = 14;
				
			}


		return firstcard;



		}


		public static String fifthcardgenerator(String firstcard, int firstone, int suitsrandom) {
			
			



		// TODO Auto-generated method stub
		 
		String suits1 [] = {"clubs", "diamonds", "hearts","spades"};




		if (firstone > 1 && firstone < 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = firstone + (suits1[0]);
			break;
		case 2:
			firstcard = firstone + (suits1[1]);
			break;
		case 3: 
			firstcard = firstone + (suits1[2]);
			break;
		case 4: 
			firstcard = firstone + (suits1[3]);
			break;
			


		}
		}
		if (firstone == 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = "jack "+ (suits1[0]);
			break;
		case 2:
			firstcard = "jack " + (suits1[1]);
			break;
		case 3: 
			firstcard = "jack " + (suits1[2]);
			break;
		case 4: 
			firstcard = "jack " + (suits1[3]);
			break;
			

			
		}

		}
		if (firstone == 12) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "queen "+ (suits1[0]);
					break;
				case 2:
					firstcard = "queen " + (suits1[1]);
					break;
				case 3: 
					firstcard = "queen " + (suits1[2]);
					break;
				case 4: 
					firstcard = "queen " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 13) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "king "+ (suits1[0]);
					break;
				case 2:
					firstcard = "king " + (suits1[1]);
					break;
				case 3: 
					firstcard = "king " + (suits1[2]);
					break;
				case 4: 
					firstcard = "king " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 1) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "ace "+ (suits1[0]);
					break;
				case 2:
					firstcard = "ace " + (suits1[1]);
					break;
				case 3: 
					firstcard = "ace " + (suits1[2]);
					break;
				case 4: 
					firstcard = "ace " + (suits1[3]);
					break;
					
				
					
				}
		firstone = 14;
				
		}
		return firstcard;



		}

		public static String firstcardgenerator2(String firstcard, int firstone, int suitsrandom ) {
			
			 



			 
		String suits1 [] = {"clubs", "diamonds", "hearts","spades"};




		if (firstone > 1 && firstone < 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = firstone + (suits1[0]);
			break;
		case 2:
			firstcard = firstone + (suits1[1]);
			break;
		case 3: 
			firstcard = firstone + (suits1[2]);
			break;
		case 4: 
			firstcard = firstone + (suits1[3]);
			break;
			


		}
		}
		if (firstone == 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = "jack "+ (suits1[0]);
			break;
		case 2:
			firstcard = "jack " + (suits1[1]);
			break;
		case 3: 
			firstcard = "jack " + (suits1[2]);
			break;
		case 4: 
			firstcard = "jack " + (suits1[3]);
			break;
			

			
		}

		}
		if (firstone == 12) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "queen "+ (suits1[0]);
					break;
				case 2:
					firstcard = "queen " + (suits1[1]);
					break;
				case 3: 
					firstcard = "queen " + (suits1[2]);
					break;
				case 4: 
					firstcard = "queen " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 13) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "king "+ (suits1[0]);
					break;
				case 2:
					firstcard = "king " + (suits1[1]);
					break;
				case 3: 
					firstcard = "king " + (suits1[2]);
					break;
				case 4: 
					firstcard = "king " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 1) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "ace "+ (suits1[0]);
					break;
				case 2:
					firstcard = "ace " + (suits1[1]);
					break;
				case 3: 
					firstcard = "ace " + (suits1[2]);
					break;
				case 4: 
					firstcard = "ace " + (suits1[3]);
					break;
					
				
					
				}
		firstone = 14;
				
			}

		return firstcard;



		}


		public static String secondcardgenerator2(String firstcard, int firstone, int suitsrandom) {
			
			



		// TODO Auto-generated method stub
		 
		String suits1 [] = {"clubs", "diamonds", "hearts","spades"};




		if (firstone > 1 && firstone < 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = firstone + (suits1[0]);
			break;
		case 2:
			firstcard = firstone + (suits1[1]);
			break;
		case 3: 
			firstcard = firstone + (suits1[2]);
			break;
		case 4: 
			firstcard = firstone + (suits1[3]);
			break;
			


		}
		}
		if (firstone == 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = "jack "+ (suits1[0]);
			break;
		case 2:
			firstcard = "jack " + (suits1[1]);
			break;
		case 3: 
			firstcard = "jack " + (suits1[2]);
			break;
		case 4: 
			firstcard = "jack " + (suits1[3]);
			break;
			

			
		}

		}
		if (firstone == 12) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "queen "+ (suits1[0]);
					break;
				case 2:
					firstcard = "queen " + (suits1[1]);
					break;
				case 3: 
					firstcard = "queen " + (suits1[2]);
					break;
				case 4: 
					firstcard = "queen " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 13) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "king "+ (suits1[0]);
					break;
				case 2:
					firstcard = "king " + (suits1[1]);
					break;
				case 3: 
					firstcard = "king " + (suits1[2]);
					break;
				case 4: 
					firstcard = "king " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 1) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "ace "+ (suits1[0]);
					break;
				case 2:
					firstcard = "ace " + (suits1[1]);
					break;
				case 3: 
					firstcard = "ace " + (suits1[2]);
					break;
				case 4: 
					firstcard = "ace " + (suits1[3]);
					break;
					
				
					
				}
		firstone = 14;
				
			}

		return firstcard;



		}


		public static String thirdcardgenerator2(String firstcard, int firstone, int suitsrandom) {
			
			


		// TODO Auto-generated method stub
		 
		String suits1 [] = {"clubs", "diamonds", "hearts","spades"};




		if (firstone > 1 && firstone < 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = firstone + (suits1[0]);
			break;
		case 2:
			firstcard = firstone + (suits1[1]);
			break;
		case 3: 
			firstcard = firstone + (suits1[2]);
			break;
		case 4: 
			firstcard = firstone + (suits1[3]);
			break;
			


		}
		}
		if (firstone == 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = "jack "+ (suits1[0]);
			break;
		case 2:
			firstcard = "jack " + (suits1[1]);
			break;
		case 3: 
			firstcard = "jack " + (suits1[2]);
			break;
		case 4: 
			firstcard = "jack " + (suits1[3]);
			break;
			

			
		}

		}
		if (firstone == 12) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "queen "+ (suits1[0]);
					break;
				case 2:
					firstcard = "queen " + (suits1[1]);
					break;
				case 3: 
					firstcard = "queen " + (suits1[2]);
					break;
				case 4: 
					firstcard = "queen " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 13) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "king "+ (suits1[0]);
					break;
				case 2:
					firstcard = "king " + (suits1[1]);
					break;
				case 3: 
					firstcard = "king " + (suits1[2]);
					break;
				case 4: 
					firstcard = "king " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 1) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "ace "+ (suits1[0]);
					break;
				case 2:
					firstcard = "ace " + (suits1[1]);
					break;
				case 3: 
					firstcard = "ace " + (suits1[2]);
					break;
				case 4: 
					firstcard = "ace " + (suits1[3]);
					break;
					
				
					
				}
		firstone = 14;
				
			}

		return firstcard;



		}

		public static String fourthcardgenerator2(String firstcard, int firstone,  int suitsrandom) {
			
			



		// TODO Auto-generated method stub
		 
		String suits1 [] = {"clubs", "diamonds", "hearts","spades"};



		if (firstone > 1 && firstone < 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = firstone + (suits1[0]);
			break;
		case 2:
			firstcard = firstone + (suits1[1]);
			break;
		case 3: 
			firstcard = firstone + (suits1[2]);
			break;
		case 4: 
			firstcard = firstone + (suits1[3]);
			break;
			


		}
		}
		if (firstone == 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = "jack "+ (suits1[0]);
			break;
		case 2:
			firstcard = "jack " + (suits1[1]);
			break;
		case 3: 
			firstcard = "jack " + (suits1[2]);
			break;
		case 4: 
			firstcard = "jack " + (suits1[3]);
			break;
			

			
		}

		}
		if (firstone == 12) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "queen "+ (suits1[0]);
					break;
				case 2:
					firstcard = "queen " + (suits1[1]);
					break;
				case 3: 
					firstcard = "queen " + (suits1[2]);
					break;
				case 4: 
					firstcard = "queen " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 13) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "king "+ (suits1[0]);
					break;
				case 2:
					firstcard = "king " + (suits1[1]);
					break;
				case 3: 
					firstcard = "king " + (suits1[2]);
					break;
				case 4: 
					firstcard = "king " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 1) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "ace "+ (suits1[0]);
					break;
				case 2:
					firstcard = "ace " + (suits1[1]);
					break;
				case 3: 
					firstcard = "ace " + (suits1[2]);
					break;
				case 4: 
					firstcard = "ace " + (suits1[3]);
					break;
					
				
					
				}
		firstone = 14;
				
			}

		return firstcard;



		}


		public static String fifthcardgenerator2(String firstcard, int firstone, int suitsrandom) {
			
			



		// TODO Auto-generated method stub
		 
		String suits1 [] = {"clubs", "diamonds", "hearts","spades"};




		if (firstone > 1 && firstone < 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = firstone + (suits1[0]);
			break;
		case 2:
			firstcard = firstone + (suits1[1]);
			break;
		case 3: 
			firstcard = firstone + (suits1[2]);
			break;
		case 4: 
			firstcard = firstone + (suits1[3]);
			break;
			


		}
		}
		if (firstone == 11) {

		switch (suitsrandom) {

		case 1: 
			firstcard = "jack "+ (suits1[0]);
			break;
		case 2:
			firstcard = "jack " + (suits1[1]);
			break;
		case 3: 
			firstcard = "jack " + (suits1[2]);
			break;
		case 4: 
			firstcard = "jack " + (suits1[3]);
			break;
			

			
		}

		}
		if (firstone == 12) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "queen "+ (suits1[0]);
					break;
				case 2:
					firstcard = "queen " + (suits1[1]);
					break;
				case 3: 
					firstcard = "queen " + (suits1[2]);
					break;
				case 4: 
					firstcard = "queen " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 13) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "king "+ (suits1[0]);
					break;
				case 2:
					firstcard = "king " + (suits1[1]);
					break;
				case 3: 
					firstcard = "king " + (suits1[2]);
					break;
				case 4: 
					firstcard = "king " + (suits1[3]);
					break;
					
				
					
				}
				
			}
		if (firstone == 1) {

		switch (suitsrandom) {
				
				case 1: 
					firstcard = "ace "+ (suits1[0]);
					break;
				case 2:
					firstcard = "ace " + (suits1[1]);
					break;
				case 3: 
					firstcard = "ace " + (suits1[2]);
					break;
				case 4: 
					firstcard = "ace " + (suits1[3]);
					break;
					
				
					
				}
		firstone = 14;
				
			}

		return firstcard;



		}
		





































}






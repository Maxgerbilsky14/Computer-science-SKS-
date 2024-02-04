package pokergamereal;
import java.util.Random;

public class poker {

	public static void main(String[] args) {
		int player1 = 0;
		int player2 = 0;
		
		int royalflush = 10;
		int straightflush = 9;
		int fourofakind = 8;
		int fullhouse = 7;
		int flush = 6;
		int straight = 5;
		int threeofakind = 4;
		int twopair = 3;
		int pair = 2;
		int highcard = 1;
		
		
		String firstcard = "";
		
		String secondcard = "";
		
		String thirdcard = "";
		
		String fourthcard = "";
		
		String fifthcard = "";
		
		
		
		
		
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
		
		
	    
	  
		
		
	
		firstcard = firstcardgenerator(firstcard, firstone, suitsrandom1 );
		secondcard = secondcardgenerator(secondcard, secondone, suitsrandom2);
		thirdcard = thirdcardgenerator(thirdcard, thirdone, suitsrandom3);
		fourthcard = fourthcardgenerator(fourthcard, fourthone, suitsrandom4);
		fifthcard = fifthcardgenerator(fifthcard, fifthone, suitsrandom5);
	
		
		
		// TODO Auto-generated method stub

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
				
			}
		System.out.println(firstcard);
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
				
			}

		return firstcard;



		}
		






































}
}

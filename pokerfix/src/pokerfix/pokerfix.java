package pokerfix;
import java.util.Arrays;
import java.util.Random;

public class pokerfix {

	public static void main(String[] args) {
		
		// player score
		int player1 = 0;
		int player2 = 0;
		
		 String hand1 = "";
		 String hand2 ="";
		
		boolean match = false;
		boolean match1 = false;
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
		
		
		

		String firstcard = "";
		
		String secondcard = "";
		
		String thirdcard = "";
		
		String fourthcard = "";
		
		String fifthcard = "";
		

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

		
		
		String firstcard2 = "";
		
		String secondcard2 = "";
		
		String thirdcard2 = "";
		
		String fourthcard2 = "";
		
		String fifthcard2 = "";

	
		

	
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
		
		
		
		
		 int[] organizearray = {firstone, secondone, thirdone, fourthone, fifthone};
		 int[] organizearray1 = {firstone2, secondone2, thirdone2, fourthone2, fifthone2};
		 
		 
		 int pairscount = 0;

		 if (firstone == secondone || firstone == thirdone || firstone == fourthone || firstone == fifthone) {
		     pairscount++;
		 }
		 if (secondone == thirdone || secondone == fourthone || secondone == fifthone) {
		     pairscount++;
		 }
		 if (thirdone == fourthone || thirdone == fifthone) {
		     pairscount++;
		 }
		 if (fourthone == fifthone) {
		     pairscount++;
		 }

		 boolean threematch = false;

		 if (firstone == secondone && firstone == thirdone) {
		     threematch = true;
		 } else if (firstone == secondone && firstone == fourthone) {
		     threematch = true;
		 } else if (firstone == secondone && firstone == fifthone) {
		     threematch = true;
		 } else if (firstone == thirdone && firstone == fourthone) {
		     threematch = true;
		 } else if (firstone == thirdone && firstone == fifthone) {
		     threematch = true;
		 } else if (firstone == fourthone && firstone == fifthone) {
		     threematch = true;
		 } else if (secondone == thirdone && secondone == fourthone) {
		     threematch = true;
		 } else if (secondone == thirdone && secondone == fifthone) {
		     threematch = true;
		 } else if (secondone == fourthone && secondone == fifthone) {
		     threematch = true;
		 } else if (thirdone == fourthone && thirdone == fifthone) {
		     threematch = true;
		 }

		 boolean fourmatch = false;

		 if (firstone == secondone && firstone == thirdone && firstone == fourthone) {
		     fourmatch = true;
		 } else if (firstone == secondone && firstone == thirdone && firstone == fifthone) {
		     fourmatch = true;
		 } else if (firstone == secondone && firstone == fourthone && firstone == fifthone) {
		     fourmatch = true;
		 } else if (firstone == thirdone && firstone == fourthone && firstone == fifthone) {
		     fourmatch = true;
		 } else if (secondone == thirdone && secondone == fourthone && secondone == fifthone) {
		     fourmatch = true;
		 }

	 
	   if (firstone == secondone || firstone == thirdone || firstone == fourthone || firstone == fifthone) {
			player1 = 1;
			 match = true;
			 
			hand1 = "pair";
	        } else if (secondone == thirdone || secondone == fourthone || secondone == fifthone) {
	        	player1 = 1;
	        	match = true;
				hand1 = "pair";
	        } else if (thirdone == fourthone || thirdone == fifthone) {
	        	player1 = 1;
	        	match = true;
				hand1 = "pair";
	        } else if (fourthone == fifthone) {
	        	player1 = 1;
	        	match = true;
				hand1 = "pair";
	        }


	 Arrays.sort(organizearray);
	 int highest = organizearray[organizearray.length - 1];
	 
	 Arrays.sort(organizearray1);
	 int highest1 = organizearray1[organizearray1.length - 1];
	 
		
	 
	
		
		

		
			

		 if (firstone == 10 && secondone == 11 && thirdone == 12 && fourthone == 13 && fifthone == 1 &&
				    suitsrandom1 == suitsrandom2 && suitsrandom2 == suitsrandom3 && suitsrandom3 == suitsrandom4 && suitsrandom4 == suitsrandom5) {
				    player1 = 10;
				    hand1 = "royalflush";
				}
		
		else if((fifthone - 1 == fourthone) && (fourthone - 1 == thirdone)&& (thirdone - 1 == secondone)&& (secondone - 1 == firstone) && suitsrandom1 == suitsrandom2 && suitsrandom3 == suitsrandom4 && suitsrandom4 == suitsrandom5) {
			player1 = 9;
			hand1 = "straightflush";
		}
		else if (fourmatch) {
			player1 = 8;
			hand1 = "fourofakind";
		}
		 else if (threematch && match) {
	    	  player1 = 7;
	    	  hand1 = "fullhouse";
	      }
		else if (suitsrandom1 == suitsrandom2 && suitsrandom2 == suitsrandom3 && suitsrandom3 == suitsrandom4 && suitsrandom4 ==suitsrandom5) {
			player1 = 6;
			 hand1 = "flush";
		}
		
		
		else if	((fifthone - 1 == fourthone) && (fourthone - 1 == thirdone)&& (thirdone - 1 == secondone)&& (secondone - 1 == firstone)){
			player1 = 5;
			hand1 = "straight";
		}
		else if (threematch && pairscount == 1) {
			player1 = 4;
			hand1 = "threeofakind";
		}
		else if (pairscount ==2) {
			player1 = 3;
			hand1 = "twopair";
		}
		
		else  if (match) {
			player1 = 2;
			hand1 = "pair";
	        }

		
		 else if(highest < highest1) {
	    	  player1 = 1;
	    	  hand1 = "high card";
	    	
	      }
	      else if(highest > highest1) {
	    	  player2 = 1;
	    	  hand2 = "high card";
	    	
	      }
		
		



	
	
		 
		 
		  
	    
	
		
		// 2ND PLAYER
		
		
		 
		 
		 int pairscount1 = 0;

	        if (firstone2 == secondone2 || firstone2 == thirdone2 || firstone2 == fourthone2 || firstone2 == fifthone2) {
	        	pairscount1++;
	        }
	        if (secondone2 == thirdone2 || secondone2 == fourthone2 || secondone2 == fifthone2) {
	        	pairscount1++;
	        }
	        if (thirdone2 == fourthone2 || thirdone2 == fifthone2) {
	        	pairscount1++;
	        }
	        if (fourthone2 == fifthone2) {
	        	pairscount1++;
	        }
	      	
	      
		
	      boolean threematch2 = false;
	      
		  	if (firstone2 == secondone2 && firstone2 == thirdone2) {
		  		threematch2 = true;
			} else if (firstone2 == secondone2 && firstone2 == fourthone2) {
				threematch2 = true;
			} else if (firstone2 == secondone2 && firstone2 == fifthone2) {
				threematch2 = true;
			} else if (firstone2 == thirdone2 && firstone2 == fourthone2) {
				threematch2 = true;
			} else if (firstone2 == thirdone2 && firstone2 == fifthone2) {
				threematch2 = true;
			} else if (firstone2 == fourthone2 && firstone2 == fifthone2) {
				threematch2 = true;
			} else if (secondone2 == thirdone2 && secondone2 == fourthone2) {
				threematch2 = true;
			} else if (secondone2 == thirdone2 && secondone2 == fifthone2) {
				threematch2 = true;
			} else if (secondone2 == fourthone2 && secondone2 == fifthone2) {
				threematch2 = true;
			} else if (thirdone2 == fourthone2 && thirdone2 == fifthone2) {
				threematch2 = true;
			}
	      
		  	
			
		  	boolean fourmatch2 = false;

		
		 if (firstone2 == secondone2 && firstone2 == thirdone2 && firstone2 == fourthone2) {
			 fourmatch2 = true;
		 } else if (firstone2 == secondone2 && firstone2 == thirdone2 && firstone2 == fifthone2) {
			 fourmatch2 = true;
		 } else if (firstone2 == secondone2 && firstone2 == fourthone2 && firstone2 == fifthone2) {
			 fourmatch2 = true;
		 } else if (firstone2 == thirdone2 && firstone2 == fourthone2 && firstone2 == fifthone2) {
			 fourmatch2 = true;
		 } else if (secondone2 == thirdone2 && secondone2 == fourthone2 && secondone2 == fifthone2) {
			 fourmatch2 = true;
		 }
		 

		 if (firstone2 == secondone2 || firstone2 == thirdone2 || firstone2 == fourthone2 || firstone2 == fifthone2) {
				player2 = 1;
				pairscount1 =1;
				hand2 = "pair";
		        } else if (secondone2 == thirdone2 || secondone2 == fourthone2 || secondone2 == fifthone2) {
		        	player2 = 1;
		        	match1 = true;
					hand2 = "pair";
		        } else if (thirdone2 == fourthone2 || thirdone2 == fifthone2) {
		        	player2 = 1;
		        	match1 = true;
					hand2 = "pair";
		        } else if (fourthone2 == fifthone2) {
		        	player2 = 1;
		        	match1 = true;
					hand2 = "pair";
		        }

		 
		
		 
		 if (firstone2 == 10 && secondone2 == 11 && thirdone2 == 12 && fourthone2 == 13 && fifthone2 == 1 && suitsrandom6 == suitsrandom7 && suitsrandom7 == suitsrandom8 && suitsrandom8 == suitsrandom9 && suitsrandom9 == suitsrandom10) {
				    player2 = 10;
				    hand2 = "royalflush";
				}
	     
	      else if ((fifthone2 - 1 == fourthone2) && (fourthone2 - 1 == thirdone2) && (thirdone2 - 1 == secondone2) && (secondone2 - 1 == firstone2) && suitsrandom6 == suitsrandom7 && suitsrandom8 == suitsrandom9 && suitsrandom9 == suitsrandom10) {
	          player2 = 9;
	          hand2 = "straightflush";
	      }
	      else if(fourmatch2) {
	    	  player2 = 8;
	    	  hand2 = "fourofakind";
	      }
	      else if (threematch2 && match1) {
	    	  player2 = 7;
	    	  hand2 = "fullhouse";
	      }
	 
	     
	      else if (suitsrandom6 == suitsrandom7 && suitsrandom7 == suitsrandom8 && suitsrandom8 == suitsrandom9 && suitsrandom9 == suitsrandom10) {
	          player2 = 6;
	          hand2 = "flush";
	      }

	  
	      else if ((fifthone2 - 1 == fourthone2) && (fourthone2 - 1 == thirdone2) && (thirdone2 - 1 == secondone2) && (secondone2 - 1 == firstone2)) {
	          player2 = 5;
	          hand2 = "straight";
	      }
	
	      else if(threematch2) {
	    	  player2 = 4;
	    	  hand2 = "threeofakind";
	      }
	
		 

	        else if (pairscount1 == 2) {
	        	player2 = 3;
	        	hand2 = "twopair";
	        }
		
	      else  if (match) {
	    	  player2 = 2;
	    	  hand2 = "pair";
	    	  
		        }

	      else  {
	    	  if(highest < highest1) {
	    	  player2 = 1;
	    	  hand2 = "high card";
	    	  
	      }
	      else if(highest > highest1) {
	    	  player1 = 1;
	    	  hand1 = "high card";
	    	
	      }
	      }
	     
		 
	     
		 
		 //highest card 
		 
		
		 
		 
		
		 
		 
	      
	      System.out.println("Player1: ");
	      System.out.println(" ");
	      System.out.println(firstcard);
	      System.out.println(secondcard);
	      System.out.println(thirdcard);
	      System.out.println(fourthcard);
	      System.out.println(fifthcard);
			
	      System.out.println(" ");
	      System.out.println(" ");
	      
	      System.out.println("Player2: ");
	      System.out.println(" ");
	      System.out.println(firstcard2);
	      System.out.println(secondcard2);
	      System.out.println(thirdcard2);
	      System.out.println(fourthcard2);
	      System.out.println(fifthcard2);
			
	      
	      
			 if (player1> player2) {
				 System.out.println("player1 wins with the hand: " + hand1 + " against a: " + hand2);
			 }
			 if (player1< player2) {
				 System.out.println("player2 wins with the hand: " + hand2 + " against a: " + hand1);
			 }
		    
		
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



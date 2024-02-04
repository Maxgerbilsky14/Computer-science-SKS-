package pokergame;

import java.util.Random;
import java.util.Arrays;

public class pokergame {

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
		
		
		
		
		
		 int[] organizearray = {firstone, secondone, thirdone, fourthone, fifthone};
	
	        
	        
	      
	        int lowest = organizearray[0];
	        int highest = organizearray[0];
	        
	        for (int i = 1; i < organizearray.length; i++) {
	        	if (organizearray[i] < lowest) {
	        		 highest = lowest;
	        		lowest = organizearray[i];
	        	}
	        		else if (organizearray[i] > lowest && organizearray[i] != lowest) {
	        			 highest = organizearray[i];
	        			
	        		}	
	        	
	        	
	        }
	        
	        
	        
	        

	    	boolean firstpair = false;
	    	boolean secondpair = false;
	    	boolean thirdpair = false;
	    	int firstpairvalue;
	    	int secondpairvalue;
	    	int amountpairs = 0;
	    	
	    	for (int i = 1; i < organizearray.length; i++){
	    		for (int j = i +1; j < organizearray.length; j++) {
	    			
	    			if(organizearray[i] == organizearray[j]) {
	    			 if (!firstpair) {
	    				 firstpair = true;
	    				 firstpairvalue = organizearray[i];
	    				 amountpairs = 1;
	    				 }
	    				 else if(!secondpair && organizearray[i] == organizearray[j]) {
	    					 secondpair = true;
	    					 secondpairvalue = organizearray[i];
	    					 amountpairs = 2;
	    				 }
	    				 
	    			 }
	    			 
	    		
	    		
	    		if (firstpair && secondpair) {
	    			break;
	    		
	    	}
	       
	       

	    		}
	    		
	    		
	
		if ( firstone > 9 && secondone > 9 && thirdone > 9 && fourthone >9 && fifthone > 9 && (fifthone - 1 == fourthone) && (fourthone - 1 == thirdone)&& (thirdone - 1 == secondone)&& (secondone - 1 == firstone) && suitsrandom1 == suitsrandom2 && suitsrandom3 == suitsrandom4 && suitsrandom4 == suitsrandom5) {
			player1 = royalflush;
		}
		
		else if((fifthone - 1 == fourthone) && (fourthone - 1 == thirdone)&& (thirdone - 1 == secondone)&& (secondone - 1 == firstone) && suitsrandom1 == suitsrandom2 && suitsrandom3 == suitsrandom4 && suitsrandom4 == suitsrandom5) {
			player1 = straightflush;
		}
		
		else if (suitsrandom1 == suitsrandom2 && suitsrandom3 == suitsrandom4 && suitsrandom4 == suitsrandom5) {
			player1 = flush;
		}
		
		else if	((fifthone - 1 == fourthone) && (fourthone - 1 == thirdone)&& (thirdone - 1 == secondone)&& (secondone - 1 == firstone)){
			player1 = straight;
		}
		else if (amountpairs == 1) {
			player1 = pair;
		}
  	
		else if (amountpairs == 2) {
			player1 = twopair;
  		}
	
		
  		
	
		
		

	
	
	
	
	
	
		
	String firstcard2 = "";
	
	String secondcard2 = "";
	
	String thirdcard2 = "";
	
	String fourthcard2 = "";
	
	String fifthcard2 = "";
	
	
	
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
	
	
	firstcard = firstcardgenerator2(firstcard, firstone2, suitsrandom6 );
	secondcard = secondcardgenerator2(secondcard, secondone2, suitsrandom7);
	thirdcard = thirdcardgenerator2(thirdcard, thirdone2, suitsrandom8);
	fourthcard = fourthcardgenerator2(fourthcard, fourthone2, suitsrandom9);
	fifthcard = fifthcardgenerator2(fifthcard, fifthone2, suitsrandom10);
	
	
	



	 int[] organizearray1 = {firstone2, secondone2, thirdone2, fourthone2, fifthone2};

	

    
      int lowest1 = organizearray1[0];
      int highest1 = organizearray1[0];
      
      for (int i0 = 1; i0 < organizearray1.length; i0++) {
      	if (organizearray1[i0] < lowest1) {
      		 highest1 = lowest1;
      		lowest1 = organizearray1[i0];
      	}
      		else if (organizearray1[i0] > lowest1 && organizearray1[i0] != lowest1) {
      			 highest1 = organizearray1[i0];
      			
      	}
       
      	
	
      }
     
      	
      
      
      boolean firstpair2 = false;
      boolean secondpair2 = false;
      int amountpairs2 = 0;

      for (int i1 = 1; i1 < organizearray1.length; i1++){
      	for (int j1 = i1 +1; j1 < organizearray1.length; j1++) {
      		
      		if(organizearray1[i1] == organizearray1[j1]) {
      		 if (!firstpair2) {
      			 firstpair2 = true;
      			 
      			 amountpairs2 = 1;
      			 }
      			 else if(!secondpair2 && organizearray1[i1] == organizearray1[j1]) {
      				 secondpair2 = true;
      				
      				 amountpairs2 = 2;
      			 }
      			 
      		 }
      		 
      	}
      	
      	if (firstpair2 && secondpair2) {
      		break;
      	}}
	
	

      // royal flush
      if (firstone2 > 9 && secondone2 > 9 && thirdone2 > 9 && fourthone2 > 9 && fifthone2 > 9 && (fifthone2 - 1 == fourthone2) && (fourthone2 - 1 == thirdone2) && (thirdone2 - 1 == secondone2) && (secondone2 - 1 == firstone2) && suitsrandom6 == suitsrandom7 && suitsrandom8 == suitsrandom9 && suitsrandom9 == suitsrandom10) {
          player2 = royalflush;
      }
      // straight flush
      else if ((fifthone2 - 1 == fourthone2) && (fourthone2 - 1 == thirdone2) && (thirdone2 - 1 == secondone2) && (secondone2 - 1 == firstone2) && suitsrandom6 == suitsrandom7 && suitsrandom8 == suitsrandom9 && suitsrandom9 == suitsrandom10) {
          player2 = straightflush;
      }
      // flush
      else if (suitsrandom6 == suitsrandom7 && suitsrandom8 == suitsrandom9 && suitsrandom9 == suitsrandom10) {
          player2 = flush;
      }
      // four of a kind

      // straight
      else if ((fifthone2 - 1 == fourthone2) && (fourthone2 - 1 == thirdone2) && (thirdone2 - 1 == secondone2) && (secondone2 - 1 == firstone2)) {
          player2 = straight;
      }
      // two pairs
      else if (amountpairs2 == 2) {
          player2 = pair;
      }
      // pair
      else if (amountpairs2 == 1) {
          player2 = pair;
      }

      for (int i2 = 1; i2 < organizearray1.length; i2++) {
          for (int j2 = i2 + 1; j2 < organizearray1.length; j2++) {
              boolean firstpair3 = false;
              boolean secondpair3 = false;
              int firstpairvalue3 = -1;
              if (organizearray1[i2] == organizearray1[j2]) {
                  if (!firstpair3) {
                      firstpair3 = true;
                      firstpairvalue3 = organizearray1[i2];
                  } else if (!secondpair3 && firstpairvalue3 == organizearray1[j2]) {
                      player2 = threeofakind;
                      secondpair3 = true;
                  }
              }
          }
      }

      System.out.println(firstone + "" + secondone + thirdone + fourthone + fifthone);
      System.out.println(firstone2 + "" + secondone2 + thirdone2 + fourthone2 + fifthone2);
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






































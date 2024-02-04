package phonecompany;
import java.util.Scanner;
public class Phonecompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// questions being prompted to the user and creation of scanner 
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter maximum talk minutes needed: ");
		int talkMinutes = scanner1.nextInt();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter maximum text messages needed: ");
		int textMessages = scanner2.nextInt();
		
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("Enter maximum data needed: ");
		int dataGB = scanner3.nextInt();
		
		// closing scanners
		scanner1.close();
		scanner2.close();
		scanner3.close();
		
		
		// if statements to determine best plan for user
		 if (talkMinutes < 500 && textMessages == 0 && dataGB == 0) {
			 System.out.println("PLAN A - $49/MONTH");
		 }
		 else if (talkMinutes < 500 && textMessages > 0 && dataGB == 0) {
			 System.out.println("PLAN B - $55/MONTH");
		 }
		 else if(talkMinutes >= 500 && textMessages < 100 && dataGB == 0) {
			 System.out.println("PLAN C - $61/MONTH");
		 }
		 else if(talkMinutes >= 500 && textMessages >= 100 && dataGB == 0) {
			 System.out.println("PLAN D - $70/MONTH");
		 }
		 else if(dataGB > 0 && dataGB < 3) {
			 System.out.println("PLAN E - $79/MONTH");
		 }
		 else if(dataGB >= 3) {
			 System.out.println("PLAN F - $87/MONTH");
		 }
		 else {
			 System.out.println("We were unable to find a suitable plan for you");
		 }

	}

}

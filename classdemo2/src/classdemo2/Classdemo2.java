package classdemo2;

public class Classdemo2 {

	public static boolean trueMethod() {
		System.out.println("true method done");
		return true;
		
	}
	
public static boolean falseMethod() {
	System.out.println("false method done");
	return false;
		
	}
	
	public static void main(String[] args) {
		
		if(trueMethod()&& falseMethod())
			System.out.println("both are true");
			else 
				System.out.println("both are not true");
		// TODO Auto-generated method stub

	}

}

import java.util.Scanner;

public class StringReversal {

	// main method
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a String to be reversed: ");
		String phraseEntry = scan.nextLine(); // user-defined string (phraseEntry) that will be reversed
		scan.close();
		
		
		int left = 0;
		int right = phraseEntry.length()- 1;

		System.out.println("The reverse order of your input string is: " + StringReversal.reverseString(phraseEntry, left, right));
		
	}

	// static method (reverseString) for reversing phraseEntry input String
	public static String reverseString(String phraseEntry, int left, int right) { //method variables in parentheses

		if (phraseEntry.charAt(right) == phraseEntry.charAt(left))
			return "" + phraseEntry.charAt(left);  //Eclipse indicated an error in this line of code.... clicking on the "fix", double quotes were added. 
							       //Evidently double quotes specifies a String return.
		else
			return phraseEntry.charAt(right) + reverseString(phraseEntry.substring(left, right), left, right-1);
		
			//Substring(left, right) keeps track of the reverseString as it grows. 
			//CharAt(right) is added each time phraseEnty is applied to itself. 
			//"right-1" was necessary to increment ("left" is unchanging, =0) 
			
	}

}

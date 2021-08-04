import java.io.*;
import java.util.Scanner;

public class StringReader {

	public static void main(String[] args) throws IOException {
		
		String fileName = "userStrings.txt";
		PrintWriter outFile = new PrintWriter(fileName);
		String str, endProgram = "DONE";
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a string to add to our text file, or enter \"DONE\" to end the program.");
		str = scan.nextLine();
		
		while (!str.equals("DONE")) {
			outFile.println(str);
			System.out.println("Enter a string to add to our text file, or enter \"DONE\" to end the program.");
			str = scan.nextLine();
		
		}
		
		if (str.equals("DONE")) {
			System.out.println("Output file has been created: " + fileName); 
			System.exit(0);
		}
		
		outFile.close();
		scan.close();
		
		
	}
	

}

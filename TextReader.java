
import java.io.*;

public class TextReader {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("userStrings.txt");
			int character;
			
			while ((character = reader.read()) !=-1) { //a boolean eval
				System.out.print((char) character);  
			}
			reader.close();
		

	} catch (IOException e) {
		e.printStackTrace();
	}

	}
}

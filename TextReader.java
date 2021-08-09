

import java.io.*;

public class TextReader { //Week5 LabExercise1,b
	
	//the BufferedReader class construction employed below was taken from: https://www.javatpoint.com/how-to-read-csv-file-in-java

	public static void main(String[] args) throws Exception {
		
		String line = "";
		String splitBy = ",";
		int row = 1;
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("input.csv"));
			while ((line= br.readLine())!=null) { //boolean return

				String[]value = line.split(splitBy);  //comma separator between values
				
				
				//evaluate largest value in a given row (incomplete)
				int max = Integer.parseInt(value[0]);
				
				for (int i=0; Integer.parseInt(value[i])<= 5; i++) { //iterate across each row
					if (Integer.parseInt(value[i]) < Integer.parseInt(value [i+1])) 
					max = Integer.parseInt(value[i]);
					}
				System.out.println("Row 1: " +max);
			} 
			
		}
catch (IOException e) {
	e.printStackTrace();
	}
	}
}


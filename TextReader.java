

import java.io.*;

public class TextReader { //Week5 LabExercise1,b
	
	//the BufferedReader class construction employed below was taken from: https://www.javatpoint.com/how-to-read-csv-file-in-java

	public static void main(String[] args) throws Exception {
		
		String line = "";
		String splitBy = ",";
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("input.csv"));
			while ((line= br.readLine())!=null) { //boolean return

				String[]value = line.split(splitBy);  //comma separator between values
				
				
				//transfer csv file data to an array named "csv"
				int[][] csv = new int[3][5];
				for (int row =0; row <=csv.length; row++)
					for (int col =0; col <csv[row].length; col++)
						csv[row][col] = Integer.parseInt(value);  //not seeing how to grab the appropriate string in text file and assign to desired row/col location in array
				
				
				//evaluate largest value in a given row (incomplete)
				int max = Integer.parseInt(value[0]);
				
				for (int i=0; Integer.parseInt(value[i])<= 5; i++) {
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


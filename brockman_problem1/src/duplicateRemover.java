
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class duplicateRemover {

	//static String[] uniqueWords;
	static String uniqueWords = "";
	
	public duplicateRemover() {
				
	}
	
	//instance method called remove
		//take a single parameter called dataFile
		//type string (representing the path to a text file)
	public void remove(String dataFile) {

		
		//uses a set of strings to eliminate duplicate words from the file
		Set<String> Words = new HashSet<String>();
		try{
			Scanner scan = new Scanner(new File(dataFile));
			while(scan.hasNext()) {
				Words.add(scan.next());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found");
		}
		//unique words should be stored in an instance variable called uniqueWords
		//uniqueWords = new String[Words.size()];
		//int i = 0;
		for (String str : Words) {
			//uniqueWords[i] = str;
			//i++;
			uniqueWords = (uniqueWords +" " + str);
		}	
	}

	
	
	//instance method called write
		//take a single parameter called outputFile
		//type string (representing the path to a text file)
	public void write(String outputFile) {
		File output = new File (outputFile);
			if(output.exists()) {
				output.delete();
		}
		try {
			output.createNewFile();
			FileWriter writer = new FileWriter(outputFile);
				writer.write(uniqueWords);
				writer.close();
				}
		catch (IOException e) {
		}
		
	
		//writes the words contained in uniqueWords to the file
		//output file should be overwritten if it exists and created if it does not
	}
}

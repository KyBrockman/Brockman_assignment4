import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
	
	static String wordCounter = "";
	
	public DuplicateCounter() {
		
	}

	//Create an instance method called count 
		//take a single parameter called dataFile of type String
	public void count(String dataFile) {
		
		HashMap<String, Integer> dupeCount = new HashMap<String, Integer>();
		
		try{
			Scanner scan = new Scanner(new File(dataFile));
			while(scan.hasNext()) {
				String word = scan.next();
				//use a map of strings to count how many times each word occurs
				if (dupeCount.containsKey(word)) {
					int i = dupeCount.get(word);
					i++;
					dupeCount.replace(word, i);
				}
				else {
					dupeCount.put(word, 1);
				}
			}
		
			//the counts should be stored in an instance variable called wordCounter
			for (Map.Entry<String, Integer> copies : dupeCount.entrySet()){
				wordCounter = (wordCounter + "the word " + copies.getKey() + " was repeated " + copies.getValue() + " times." + "\r\n" );
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found");
		}
	}
		
		public void write(String outputFile) {
			File output = new File (outputFile);
				if(output.exists()) {
					output.delete();
			}
			try {
				output.createNewFile();
				FileWriter writer = new FileWriter(outputFile);
					writer.write(wordCounter);
					writer.close();
					}
			catch (IOException e) {
			}
		}
		
		
	//create an instance method called write that writes the contents of wordCounter to outputFile
		//output file should be overwritten if it already exist and created if it does not exist
	
	
	
}

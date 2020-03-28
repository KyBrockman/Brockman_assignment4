
public class Application {

	public static void main(String[] args) {
		duplicateRemover test = new duplicateRemover();
		test.remove("problem1.txt");
		test.write("unique_words.txt");
	}

}

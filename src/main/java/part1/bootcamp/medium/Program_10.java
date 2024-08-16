package part1.bootcamp.medium;

public class Program_10 {

	public static void main(String[] args) {

		// Write a Java program to count the number of words in a given string.

		String str = "The world is beautiful, charming and astonishing!";
		int wordCount = countWordsInAString(str);
		System.out.println("Number of words in the string: " + wordCount);
		
		int wordCount2 = countWordsMethod2(str);
		System.out.println("Number of words in the string: " + wordCount2);

	}

	// Method1 using string functions
	public static int countWordsInAString(String str) {

		if (str == null || str.isEmpty()) {
			return 0;
		}
		String[] words = str.split("\\s+"); // Split the string by whitespace
		return words.length;
	}
	
	
	// Method 2 - Without using In-Built string functions
	public static int countWordsMethod2(String str) {
		
		int count = 0;
		if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
			
			for (int i = 0; i < str.length(); i++) {
				
				if(str.charAt(i) == ' ')
					count++;
				
			}
			count = count + 1;
		}
		return count;
	}


}

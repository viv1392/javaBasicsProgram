

import java.util.HashMap;
import java.util.Map;

public class PrintingDuplicateCharWithItsCount {
	public static void main(String[] args) {
		 String str = "hello world";

	        // Create a HashMap to store characters and their counts
	        Map<Character, Integer> charCounts = new HashMap<>();

	        // Iterate through the characters of the string
	        for (char c : str.toCharArray()) {
	            // Check if the character is already present in the map
	            if (charCounts.containsKey(c)) {
	                // If present, increment the count
	                charCounts.put(c, charCounts.get(c) + 1);
	            } else {
	                // If not present, add it to the map with count 1
	                charCounts.put(c, 1);
	            }
	        }

	        // Iterate through the map to print duplicate characters and their counts
	        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
	            }
	        }
	    }
		
	}




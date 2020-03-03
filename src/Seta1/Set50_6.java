package Seta1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Set50_6 {

	static <K, V> ArrayList<K> getAllKeysForValue(Map<K, V> mapOfWords, V value) 
	{
		ArrayList<K> listOfKeys = null;
		 
		//Check if Map contains the given value
		if(mapOfWords.containsValue(value))
		{
			// Create an Empty List
			listOfKeys = new ArrayList<>();
					
			// Iterate over each entry of map using entrySet
			for (Map.Entry<K, V> entry : mapOfWords.entrySet()) 
			{
				// Check if value matches with given value
				if (entry.getValue().equals(value))
				{
					// Store the key from entry to the list
					listOfKeys.add(entry.getKey());
				}
			}
		}
		// Return the list of keys whose value matches with given value.
		return listOfKeys;	
	}
 
 
	public static void main(String[] args) {
		
		// Create a Map of words and thier frequency count
		HashMap<String, String> mapOfWords = new HashMap<String, String>() {
			{
				put("ram", "hari");
				put("sisco", "barfi");
				put("honeywell", "cs");
				put("cts", "hari");
				
			}
		};
 
		//Get the list of keys whose value matches with given value.
		ArrayList<String> listOfKeys = Set50_6.getAllKeysForValue(mapOfWords, "hari");
 
		System.out.println(listOfKeys);
 
	      }


}
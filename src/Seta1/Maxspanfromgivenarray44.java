package Seta1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Maxspanfromgivenarray44 {

	public static void main(String[] args) {
		 int maxspan = maxspan(3, 2, 1, 4, 3, 1);
		    System.out.println(maxspan);
		}

		public static int maxspan(int... ints) {
		    Map<Integer, Integer> first = new LinkedHashMap<Integer, Integer>(); 
		    int maxspan = 0;  
		    for (int i = 0; i < ints.length; i++) {
		        int num = ints[i];
		        if (first.containsKey(num)) {  
		            int span = i - first.get(num) + 1;  
		            if (span > maxspan) maxspan = span; 
		        } else {
		            first.put(num, i); 
		        }
		    }
		    return maxspan;
		}	}



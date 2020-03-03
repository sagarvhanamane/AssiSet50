package Seta1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Allvowelspresentornot33 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		
		String str = "education";
	      ArrayList<Character> vowelList = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
	      char [] ch1 = str.toCharArray();

	      HashMap<Character,Character> hMap = new HashMap();
		for(char ch : ch1) {
	         hMap.put(ch,'g');
	      }
	      if(hMap.keySet().containsAll(vowelList)) {
	         System.out.println("1");
	      } else {
	         System.out.println("-1");
	}

	}
	
}

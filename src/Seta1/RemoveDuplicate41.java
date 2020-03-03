package Seta1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate41 {

	public static void main(String[] args) {
		String str="this is sample test case";
		System.out.println(RemoveDuplicate41(str));
	}
	public static String RemoveDuplicate41(String str){
		Set<Character> set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		
		for(int i=0;i<str.length();i++){
			Character ch=str.charAt(i);
			if(!set.contains(ch)){
				set.add(ch);
				sf.append(ch);
			}
		}return sf.toString();
	
	}

}

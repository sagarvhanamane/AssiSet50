package Seta1;

import java.util.StringTokenizer;

public class CountNoofWord15 {

	public static void main(String[] args) {
		String str="i work in cognizant.";
          System.out.println(countword(str));
	}
	public static int countword(String str){
//		int wordcount=1;
//		for(int i=0;i<str.length();i++){
//			if(str.charAt(i)==' '&& i<str.length()-1 && str.charAt(i+1)!=' '){
//				wordcount++;
//			}
//		}
//		return wordcount;
		int count=0;
		StringTokenizer st=new StringTokenizer(str," ");
		while(st.hasMoreTokens()){
			
			System.out.println(st.nextToken());
			count++;
		}
		System.out.println(count);
		return count;
	}

}

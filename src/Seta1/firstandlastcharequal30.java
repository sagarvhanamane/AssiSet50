package Seta1;

public class firstandlastcharequal30 {

	public static void main(String[] args) {
		String str="this was grea";
		char[] ch=str.toCharArray();
		char first=ch[0];
		char last=ch[ch.length-1];
	if(first==last){
		System.out.println("1");
		
	}else{
		System.out.println("-1");
	}

}
}
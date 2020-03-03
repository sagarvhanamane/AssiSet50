package Seta1;

import java.util.Scanner;

public class StringEncryption35 {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String inputStr= sc.next();
		
		
		String encryptedStr = "";
		String pattern="[a-zA-Z0-9]+";
		char Ch = ' '; 
		if(inputStr.matches(pattern)){
			for(int i=0; i<inputStr.length(); i++){
				Ch = inputStr.charAt(i);
				if((i+1)%2!=0){
					
					switch(Ch){
					case 'z': Ch='a';break;
					case 'Z': Ch='A';break;
					default	: Ch++;
					
					}
					encryptedStr=encryptedStr+Ch;
					
				}
				else{
					encryptedStr=encryptedStr+Ch;
				}
				
			}
			System.out.println(encryptedStr);
		}
	}

}

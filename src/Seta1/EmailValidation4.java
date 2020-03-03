package Seta1;

import java.util.Scanner;

public class EmailValidation4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email:");	
		String patternRegex="^[a-zA-Z0-9._-]{3,20}+@([a-zA-Z0-9.-]{0,5})+[.com]$";
           while(true){
			String passStr = sc.next();
			if(passStr.matches(patternRegex)){
				System.out.println("Your password is valid");
			}
			else
			{
				System.out.println("Your password is invalid");
			}
          }

	}

}

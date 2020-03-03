package Seta1;

import java.util.Scanner;

public class PancardValidation28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pancard No:");	

		String patternRegex="^([A-Z]){3}([0-9]){4}([A-Z]){1}?$";
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

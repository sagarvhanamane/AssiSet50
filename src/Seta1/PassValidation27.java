package Seta1;

import java.util.Scanner;

public class PassValidation27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password:");	
		String patternRegex="^[A-Za-z](?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[@$!%*?&])[A-Za-z@$!%*?&].{8,}$";


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

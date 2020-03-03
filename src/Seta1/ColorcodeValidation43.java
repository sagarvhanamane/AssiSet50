package Seta1;

import java.util.Scanner;

public class ColorcodeValidation43 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Color code:");	
		String patternRegex="^#([A-Fa-f0-9]{10})$";

		while(true){
			String passStr = sc.next();
			if(passStr.matches(patternRegex)){
				System.out.println("1");
			}
			else
			{
				System.out.println("-1");
			}
          }

	}

}

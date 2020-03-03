package Seta1;

import java.util.Scanner;

public class Additionofdigits47 {

	public static void main(String[] args) {
		int sum=0,rem=0,rem1=0,sum1=0;
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();*/
		int num=2345;
		while(num>0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		while(sum>0){
			rem1=sum%10;
			sum1=sum1+rem1;
			sum=sum/10;
		}
		System.out.println("Sum of digit is: "+sum1);

	}

}

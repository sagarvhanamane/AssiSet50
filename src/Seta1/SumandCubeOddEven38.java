package Seta1;

import java.util.Scanner;

public class SumandCubeOddEven38 {

	public static void main(String[] args) {
		int [] a={2,3,4,5};
		int odd=0;int even=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
				odd +=a[i]*a[i];
			}
			else{
				even +=Math.pow(a[i], 3);
			}
			}

		System.out.println("Total: "+(odd+even));

	}

}

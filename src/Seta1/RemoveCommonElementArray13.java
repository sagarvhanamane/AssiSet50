package Seta1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCommonElementArray13 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 4, 6, 7));
		
		ArrayList<Integer> union = new ArrayList<Integer>(list1);
		union.addAll(list2);
		System.out.println("Common array: "+union);
		
		ArrayList<Integer> intersection = new ArrayList<Integer>(list1);
		intersection.retainAll(list2);
		System.out.println("Common Element in the Aray: "+intersection);
		
		union.removeAll(intersection);
		for (Integer n : union) {
		    System.out.println(n);
		}
		
	}

}

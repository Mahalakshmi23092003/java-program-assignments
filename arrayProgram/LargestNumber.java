package arrayProgram;

import java.util.Arrays;
import java.util.Iterator;

public class LargestNumber {

	public static void main(String[] args) {
		
//		int num[]= {10,20,50,100,120,150};
//		
//		//this method for find the largest number in array.
//		Arrays.sort(num);
//		
//		System.out.println(num[num.length-2]);
		
		//write a program for find the duplicate number in given arrays.
		
		int num1[]= {2,3,4,5,5,7,9,2,4,7};
		for(int i=0;i<num1.length-1;i++) {
			
			for(int j=i+1;j<num1.length;j++) {
				
				if(num1[i]==num1[j]) {
					System.out.println(num1[i]);
				}
			}
			
		
		}
		
		
	}
}

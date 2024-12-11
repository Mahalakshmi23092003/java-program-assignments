
//this is a package for store the entire classes.
package arrayProgram;

//It is scanner package for used to get the input from the user in runtime.
import java.util.Scanner;

//we supposed to that create class.
public class OddNumber {
	
	//main method is entry point of execution.
	public static void main(String[] args) {
		
		//scanner class syntax.
		Scanner sc = new Scanner(System.in);
		
		//This statement is user try to understand and enter input in console.
		System.out.println("enter the number");
		
		//only user can enter integer values.
		int num=sc.nextInt();
		
		//if the condition is true,"if" block will be execute.
		if(num%2!=0) {
			System.out.println("odd number");
		}
		//If the condition is false,"else" block will be execute.
		else {
			System.out.println("not a odd number");
		}
		
		
	}

}

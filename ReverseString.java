package arrayProgram;
//program for print all string in reverse format
public class ReverseString {
	public static void main(String[] args) {
		
		//first we need to declare the value.
		
		String title="Atomation Testing";
		
		//this is a string method for to get word to character.
		char[] charArray = title.toCharArray();
		
		//this is for loop condition how many times loop will run.
		for (int i = charArray.length-1; i>=0;i--) {
			
			System.out.print(charArray[i]);
			
		}
		
		
	}

}

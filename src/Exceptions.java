
public class Exceptions {

	public static void main(String[] args) {
		
		/*
		 * Checked Exceptions - explicitly checked for our code
		 * try catch block - handles checked exceptions
		 */
		try {
			System.out.println(numbers[3]);
			System.out.println("In the try");
		} (Exception e) {
			System.out.println(e.toString());
		}
		
		/*
		 * Unchecked Exception - index out of bound, something we have control over. Only occurs if we make mistakes in code.
		 */
	}
	
}


public class Practice {
	
	public static void main(String[] args) {

		public static boolean isAPalindrome(String word) {
			
			for (int index = 0; index < (word.length() / 2); index++) {
				if (index.charAt(word.length()) != word) {
					return true;
				}
			}
			return false;
		}
		
		
	}
}

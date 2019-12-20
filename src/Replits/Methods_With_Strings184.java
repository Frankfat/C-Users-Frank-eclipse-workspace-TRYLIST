package Replits;

public class Methods_With_Strings184 {
	/*
	 * Palindrome is a word, phrase, or sequence that reads the same backward as
	 * forward, e.g., madam or nurses run.
	 * 
	 * So method isPalindrome checks that and returns true if check is palindrome
	 * and false if it is not.
	 * 
	 * - make your conditions case insensitive. ex: Civic and civic are both
	 * palindromes - make your conditions space insensitive. Race car is a
	 * palindrome even though there is space in between.
	 * 
	 * Examples:
	 * 
	 * isPalindrome("Noon") ==> true
	 * 
	 * isPalindrome("I am not palindrome") ==> false
	 * 
	 * isPalindrome("wooden") ==> false
	 * 
	 * isPalindrome("Nurses Run") ==> true
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(isPalindrome("Kazako"));
	}

	public static boolean isPalindrome(String check) {
		String add = "";

		for (int i = 0; i < check.length(); i++) {
			if(check.charAt(i)==' ')
				continue;
			add += check.charAt(i);

		}
		String add1 = "";

		for (int j = check.length() - 1; j >= 0; j--) {
			if(check.charAt(j)==' ')
				continue;
			add1 += check.charAt(j);

		}
		if (add.equalsIgnoreCase(add1)) {
			return true;
		} else {
			return false;
		}

	}
}

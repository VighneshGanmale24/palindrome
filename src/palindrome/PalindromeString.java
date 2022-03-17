package palindrome;

public class PalindromeString {

	static boolean isPalindrome(String s) {

		int i = 0, j = s.length() - 1;

		while (i < j) {

			if (s.charAt(i) != s.charAt(j))
				return false;

			i++;
			j--;
		}

		return true;
	}

	public static void main(String[] args) {

		String s = "mom";

		s = s.toLowerCase();

		if (isPalindrome(s))

			System.out.print("String is Palindrome ");
		else

			System.out.print("String is not Palindrome");
	}
}

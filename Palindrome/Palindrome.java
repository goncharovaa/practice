
// Palindrome
public class Palindrome {		
	
	public static void main(String[] args) {
		String s = "";
		for (int i = 0; i < args.length; i++)
            s = args[i];
		
		if (isPalindrome(s))
			System.out.println("yes");
		else
			System.out.println("no");
	}
	
	// Reverse a string
	public static String ReverseString(String s) {
		String a="";
		for(int i=s.length()-1;i>=0;i--)
			a+=s.charAt(i);
		return a;
	}

	// This string is a palindrome?
	public static boolean isPalindrome(String s) {
		String h=ReverseString(s);
		return s.equals(h);
		
	}
}
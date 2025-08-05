class PalindromeNumber{
	public static void main(String[] args) {
		System.out.println(isPalindrome(123));
	}
	// By using string
	public static boolean isPalindrome(int x){
		if(x<0) return false;

		String str = x + "";
		String rev = "";
		for(int i =0;i<str.length();i++)
			rev = str.charAt(i) + rev;
		return rev.equals(str);
	}


	// public static boolean isPalindrome(int x){
	// 	if(x<0) return false;
 	// 	int rev = 0;

	// 	for(int i=x;i>0;i/=10)
	// 		// int remainder = i % 10;
	// 		rev = rev * 10 + (i%10);
	// 	return (rev==x);
	// }
}
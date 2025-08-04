class ReverseInteger{
	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}
	public static int reverse(int x){
		long rev = 0;
		for(int i=x;i!=0;i/=10)
			rev = rev * 10 + (i%10);

		return (rev > Integer.MAX_VALUE) || (rev < Integer.MIN_VALUE) ? 0 : (int) rev;
	}
}
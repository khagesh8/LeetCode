class LeetCode58{
	public static void main(String[] args) {
		String str = " luffy is still j    ".trim();
		System.out.println(lengthOfLastWord(str));

		// method 2
		// String str = "  luffy is still joyboy       ".trim();
		// // str = str.trim();
		// int cnt = 0;
		// for(int i=str.length()-1;i>=0;i--){
		// 	if(str.charAt(i)==' ')
		// 		break;
		// 	cnt++;
		// }		
		// System.out.println(cnt);

	}
	public static int lengthOfLastWord(String s) {
        s=s.trim();
        return (s.length()-1)-s.lastIndexOf(' ');
    }

}
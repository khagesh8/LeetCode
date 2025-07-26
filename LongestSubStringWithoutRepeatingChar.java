class LongestSubStringWithoutRepeatingChar{
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
    public static int lengthOfLongestSubstring(String s) {
        int cnt = 0;
        String subStr = "";
        int maxCnt = 0;
        for(int i=0;i<s.length();i++){
        	subStr = ""+s.charAt(i);
            cnt =1;
            for(int j=i+1;j<s.length();j++){
                if(!(subStr.contains(""+s.charAt(j)))){
                    subStr= subStr+ s.charAt(j);
                    cnt++;
                }
                else{
                    break;
                }
            }
            if(cnt>maxCnt)
                maxCnt = cnt;
        }
        return maxCnt;
	}
}
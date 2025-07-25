class ValidAnagram{
	public static void main(String[] args) {
		System.out.println(isAnagram("anagram","nagaram"));
	}
	public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;	// length unequal so not anagram
        int [] arr = new int[26];					// creates an array of size 26 with 0 as default value for int
        for(int i=0;i<s.length();i++){				
            arr[s.charAt(i)-'a']++;			// increments the val at charAt(i)-'a' index (index of the current element of String s) 
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;			// decrements the val at charAt(i)-'a' index (index of the current element of String t) 
            if(arr[t.charAt(i)-'a']<0)		
                return false;
        }
        return true;
    }
}
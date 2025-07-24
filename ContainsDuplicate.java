import java.util.Arrays;
class ContainsDuplicate{
	public static void main(String[] args) {
		int nums [] = {1,2,3,1};
		System.out.println(containsDuplicate(nums));
	}
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0,j=i+1;j<nums.length;i++,j++)
            if(nums[i]==nums[j])return true;
        return false;
    }
}
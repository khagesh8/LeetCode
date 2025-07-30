class ThirdLargestElementGFG{
	public static void main(String[] args) {
		int[] arr = {855, 450 ,132 ,359 ,233, 825, 604, 481 ,262 ,337 ,720 ,
		525, 652 ,300 ,906 ,219, 926, 906, 293, 864, 817, 498, 30, 639, 661};
		System.out.println(getThirdLargest(arr));
	}
	public static int getThirdLargest(int[] arr) {
		int indx = 0;
        int largestEle = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largestEle){
				largestEle = arr[i];
				indx = i;
			}
		}
		arr[indx] = 0;
		indx =0;
		int secondLargest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>secondLargest){
				secondLargest= arr[i];
				indx = i;
			}
		}
		arr[indx] = 0;
		int thirdLargest = Integer.MIN_VALUE;
		for(int ele : arr){
			// if(ele==largestEle || ele==secondLargest) continue;
			if(ele>thirdLargest)
				thirdLargest= ele;
		}
		if(thirdLargest<0)
			return -1;
		else 
			return thirdLargest;  
    }
}
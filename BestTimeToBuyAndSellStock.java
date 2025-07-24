// The below code gives executes for all test cases, but has O(n^2) time complexity
class BestTimeToBuyAndSellStock{
	public static void main(String[] args) {
		int prices [] = {7,6,4,3,1};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++)
            for(int j=i+1;j<prices.length;j++)
                if((prices[j]-prices[i])>maxProfit)
                    maxProfit = prices[j] - prices[i];
        return maxProfit;
    }
}
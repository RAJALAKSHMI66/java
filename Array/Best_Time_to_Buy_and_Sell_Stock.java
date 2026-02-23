package Array;
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.


public class Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[]prices){
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int profit=prices[j]-prices[i];
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }
    public static void main(String[]args){
        int[]prices={7,1,5,3,6,4};
        int result=maxProfit(prices);
        System.out.println(result);
    }
}

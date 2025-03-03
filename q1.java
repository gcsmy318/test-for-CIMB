public class MaxProfit {
    
	public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4}; // 1
        System.out.println(maxProfit(prices1));
        
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices2));
    }
	public static int maxProfit(int[] prices) {
        int minPrice = 8;
        int maxProfit = 0;
        
        for (int price : prices) {
			//System.out.println("price"+ price);
            if (price < minPrice) { // find lowest
                minPrice = price; 
            } else if (price - minPrice > maxProfit) { // find best profit
                maxProfit = price - minPrice;
            }
        }
        
        return maxProfit;
    }

  
}

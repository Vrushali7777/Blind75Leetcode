public class StockSellandBuy121 {
    public int maxProfit(int[] prices){
        int l = 0;
        int r = 1;
        int maxP = 0;

        while (r < prices.length){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            }
            else{
                l = r;
            }
            r += 1;
        }
        return maxP;
    }

    public static void main(String[] args) {
        StockSellandBuy121 sb = new StockSellandBuy121();
        int[] prices = {7,1,5,3,6,4,0,9};

        System.out.println(sb.maxProfit(prices));
    }
}

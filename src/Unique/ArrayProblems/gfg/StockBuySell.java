package Unique.ArrayProblems.gfg;

public class StockBuySell {
    public static void main(String[] args) {
        int[] arr={7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] arr)
    {
        int minSoFar=arr[0];
        int maxProfit=0;

        for (int i = 1; i < arr.length; i++) {
            //Here we are getting lowest market day price 7<10
            minSoFar= Math.min(arr[i],minSoFar);

            //Here we are getting max value between maxProfit and diff between current day and minSoFar
            //0<(10-7)
            maxProfit=Math.max(maxProfit,arr[i]-minSoFar);
        }
        return maxProfit;
    }
}

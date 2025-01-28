public class Stock {
    public static void main(String[] args) {
        int arr[]={3,1,5,3,1,6};
        if (arr == null || arr.length == 0) {
            System.err.println(0);
        }

        int minPrice = arr[0];  
        int maxProfit = 0;     

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            } else {
                int profit = arr[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);  
            }
        }

        //return maxProfit;
        System.out.println(maxProfit);
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        twoSum(arr, target);
    }
    public static void twoSum(int[] arr, int target) {
        int ans[]=new int[2];
        int num1=0;
        int a=0;
        int b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+arr[num1]==target){
               a=i;
               b=num1;
               break;
            }
            else{
                num1++;
            }
        } 
        System.out.println(a);
        System.out.println(b);
    }
}

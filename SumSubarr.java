public class SumSubarr{
    public static void main(String args[]){
        int arr[]={10,20,30,40};
        sumsub(arr);
    }
    public static void sumsub(int arr[]){

        int  max=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                System.out.println(sum);
                if(sum>max){
                    max=sum;
                }
                }            
        }
        System.out.println(max);
    }
}
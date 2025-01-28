public class Twoloopsumsub {
    public static void main(String args[]){
         int arr[]={10,20,30,40};
         sum(arr);
    }
    public static void sum(int arr[]){
        int max=arr[0];
        
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                System.out.println(sum);
                 if(sum>max){
                    max=sum;
                 }
               
            }
        }
        System.out.println(max);
    }
}

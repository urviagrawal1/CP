public class L31 {
    public static void main(String[] args) {
        int arr[]={4,3,1,5,6};
        int pivot=-1;
        int j=arr.length-1;
        while(j>0){
            if(arr[j-1]<arr[j]){
               pivot=j-1;
               break;
            }
            j--;
        }
        System.out.println(pivot);
    }
}

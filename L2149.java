public class L2149 {
    public static void main(String[] args) {
       int arr[]={3,1,-2,-5,2,-4};
       int left[]=new int[arr.length/2];
       int right[]=new int[arr.length/2];
       
       int l=0;
       int r=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>=0){
            left[l]=arr[i];
            l++;
        }
        else{
            right[r]=arr[i];
            r++;
        }
       }

       for(int a=0;a<left.length;a++){
        System.out.print(left[a]);
       }
       for(int b=0;b<right.length;b++){
        System.out.print(right[b]);
       }

}
}
// n/2 and 1 index 
// n/2 + 1  and 3 idx
// n/2 +2   and  5 idx
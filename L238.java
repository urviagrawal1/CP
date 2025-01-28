public class L238 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int prod=1;
        int prod1=1;
        int ans[]=new int[arr.length];
        int i=0;
        //int j=arr.length;
        for( i=0;i<arr.length;i++){
            ans[i]=prod*arr[i];
            prod = prod * arr[i];  
        }
        for(int k=arr.length-1;k>=0;k--){
            ans[k]=prod*arr[k];
            prod = prod * arr[k];
        }
    
        for(int j=0;j<ans.length;j++){
            System.out.println(ans[j]);
        }
}
}



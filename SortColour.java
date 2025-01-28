public class SortColour {
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        int cnt1=0;
        int cnt2=0;
        int cnt3=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                cnt1++;
            }
            else if(arr[i]==1){
                cnt2++;
            }
            else{
                cnt3++;
            }
        }
        int temp=0;
        while(temp<cnt1){
            arr[temp]=0;
            temp++;
        }
        while(temp<cnt2+cnt1){
            arr[temp]=1;
            temp++;
        }
        while(temp<cnt3+cnt2+cnt1){
            arr[temp]=2;
            temp++;
        }
    
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

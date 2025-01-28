public class Circmasxsumsub {
    public static void main(String[] args) {
        int arr[]={-10,20,30,40};
        sol(arr);
    }
    public static void sol(int arr[]){
        int temp=arr[arr.length-1];
        int rot=0;
        int sum=0;
        while(rot<arr.length){
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
            
        }
        rot++;
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
}

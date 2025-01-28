public class MoveZeroesToEnd{

    public static void move(int arr[]){
        int j=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j++;
               count++;
            }
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,3,4,0};
        move(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
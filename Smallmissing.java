import java.util.*;
public class Smallmissing {
    public static void main(String[] args) {
        int arr[]={1,2};
        int ans=sol(arr);
        System.out.println(ans);
    }
    public static int sol(int arr[]){
        Arrays.sort(arr);
        int res=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==res){
                res++;
            }
            else if(arr[i]>res){
                break;
            }
        }
        return res;
    }
}

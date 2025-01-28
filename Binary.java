import java.util.Scanner;

public class Binary {
    public static int paratha(int[] arr, int para, int chef) {
        //Arrays.sort(arr);
        int low=1;
        int high=(arr[arr.length-1])*para;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,para,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean possible(int arr[],int para,int mid){
        int paratha=1;
        int time=0;
        int j=1;
        for(int i=0;i<arr.length;i++){
            time=arr[i];
            if(time<=mid){
                paratha++;
                time=time*j;
                j++;
            }
            else{
                i++;
            }
        }
        if(paratha>=para){
            return true;
        }
        return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int not=sc.nextInt();        // no of testcase
		int nop=sc.nextInt();        // no of parathas
		int noc=sc.nextInt();        // no of chefs
		
		int arr[]=new int[noc];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int ans=paratha(arr,nop,noc);
		System.out.println(ans);
	}
}

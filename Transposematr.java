public class Transposematr {
    public static void main(String[] args) {
        int arr[][] = { { 5,1,9,11},
                      {2,4,8,10 },
                      { 13,3,6,7 },
                      {15,14,12,16}
                       };
        //  for(int i=0;i<arr.length;i++){
        //      for(int j=i+1;j<arr.length;j++){
        //          int temp=arr[i][j];
        //          arr[i][j]=arr[j][i];
        //           arr[j][i]=temp;
        // }
        // }
        
        
        for(int i=0;i<arr.length;i++){
            int idx=arr[0].length-1;
            for(int j=0;j<(arr[0].length)/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][idx];
                arr[i][idx]=temp;
                idx--;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

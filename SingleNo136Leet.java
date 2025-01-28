public class SingleNo136Leet {
    public static int ans(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            int count = 0;
            
            for (int j = 0; j < arr.length; j++) { 
                    if (arr[j] == ele) {
                        count++;
                    }
            }
            if (count == 1) {
                return ele;
            }
        }
        return -2;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, -1, 1, 2};  
        int result = ans(arr);
        System.err.println(result);  
    }
}


public class ContainsDup {
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j] && Math.abs(i-j)<=k && Math.abs(i-j)!=0){
            return true;
            }
        }
    }
    return false;
}

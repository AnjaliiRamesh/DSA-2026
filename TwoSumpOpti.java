public class TwoSumpOpti {
    public static void main(String[] args) {
    int arr[] = {2,5,7,11,15};
    int tar = 13;
    int n = arr.length;
   
    int i =0;
    int j = arr.length-1;
        while(i<j){
            int currSum = arr[i]+arr[j];
            if(currSum == tar){
                System.out.println(i + "," +j);
                break;
            }
            else if(currSum < tar){
                i++;
            }
            else{
                j--;
            }
            
        }
    }
}



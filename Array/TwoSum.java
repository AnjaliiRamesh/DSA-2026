public class TwoSum{
public static void main(String[] args) {
    int arr[] = {3,3};
    int tar = 6;

    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i]+arr[j] == tar){
                System.out.println(i + " "+j);
            }
        }
        
}
}
}
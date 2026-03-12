public class TwoSum{
public static void main(String[] args) {
    int arr[] = {2,7,11,15};
    int tar = 9;
    int n = arr.length;
    
    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i]+arr[j] == tar){
                System.out.println(i + " "+j);
            }
        }
        //add sum
        

}
}
}
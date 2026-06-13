package Hashing;

import java.util.Scanner;

public class countFreq {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,3,4,5,5,5,5,6};

        Scanner sc = new Scanner(System.in);
    
        for(int i =0; i<arr.length; i++){
        int count = 0;
        if(i > 0 && arr[i] == arr[i-1]) {
        continue;
        }
        for(int j = i; j<arr.length; j++){
            
            if(arr[i] == arr[j] ){
                count++;
            }
        }
        System.out.println("count of " +arr[i] + " is: " +count);
        count = 0;
    }
    }
}

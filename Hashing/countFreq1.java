package Hashing;

public class countFreq1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4, 5, 6};

        int count = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println("count of " + arr[i - 1] + " is: " + count);
                count = 1;
            }
        }

        // Print frequency of last element
        System.out.println("count of " + arr[arr.length - 1] + " is: " + count);
    }
}


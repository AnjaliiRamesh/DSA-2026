
class Concatenation {
public static void main(String[] args) {
    int[] nums = {1,4,1,2};

    int[] ans = new int [nums.length*2]; 

    for(int i =0; i<nums.length; i++){
        ans[i] = nums[i];
        ans[i+nums.length] = nums[i];
    }
    for(int i=0; i<ans.length; i++){
        System.out.println(ans[i]);
    }
}
}
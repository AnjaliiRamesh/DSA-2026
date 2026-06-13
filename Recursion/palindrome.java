package Recursion;
public class palindrome{
    public static void main(String[] args) {
        String s = "A man, a plban, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

    while(left < right){
        char l = s.charAt(left);
        char r = s.charAt(right);

        if (!isAlphaNum(l)){
            left++;
        }
        else if( !isAlphaNum(r)){
            right--;
        }
        else{
               if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                return false;
            }
            left++;
            right--;
        }
        
    }
        return true;

    }
    private static boolean isAlphaNum(char c){
            return (c >='a' && c<= 'z')||
            (c >='A' && c<= 'Z')||
            (c >='0' && c<= '9');

    }
}
public class AnagramOpti {
    public static void main(String[] args) {
        int[] count = new int[26];  
        String s = "carrace";
        String t = "racecar";

        if(s.length() != t.length()){
            System.out.println("Not Anagram");
            return;
        }

        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;

        }
        for(int i=0; i<26; i++){
            if(count[i] !=0){
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}

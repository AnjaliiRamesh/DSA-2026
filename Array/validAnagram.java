class validAnagram{
    public static void main(String[] args) {
        String s = "carracez";
        String t = "racecarz";
         if(s.length() != t.length()){
            System.out.println("Not Anagram");
            return;
        }
        

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        java.util.Arrays.sort(s1);
        java.util.Arrays.sort(t1);

       

        for(int i =0; i<s1.length; i++){
            if(s1[i] != t1[i]){
                System.out.println("not anagram");
                return;
            };
            // break;
        
        }
            System.out.println("Anagram");

    }
    
}
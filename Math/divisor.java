class divisor{
    public static void main(String[] args) {
        int n = 20;
        if(n==1){
            System.out.print(n);
        }
         if(n > 1){
            if(n%2!=0){
            System.out.print( 1 + " " + n);
        }
        else{
            for(int i = 1; i<=n/2;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
        System.out.print(n);
        }
        }
        
        
        
    }
}
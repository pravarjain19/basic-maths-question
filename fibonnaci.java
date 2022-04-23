public class fibonnaci {
    
    public static void main(String[] args) {
        int a = 0 ; 
        int b =1;
        int n = 10;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < n; i++) {
            int sum = a+b;
            a= b; 
            b =sum ;
            System.out.print(sum + " ");
        }
    }
}

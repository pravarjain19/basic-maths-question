import java.util.Scanner;

public class prime {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        for(int i = 2 ; i < n/2 ; i++){
            if(n%i == 0){
                isprime = false;
            break;
            }
          
        }
        System.out.println(isprime);
        
    }
}

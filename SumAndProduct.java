import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int sum =0;
        int mul = 1;
        while(n!=0){
            int dig = n%10 ;
             sum = sum+dig;
            mul*=dig;

            n/=10;
        }
        System.out.print( mul + " " + sum);
    }
    
}

// basicllay we need to 453 first multiple  =  4*5*3  =60
//  4+5+3 = 12
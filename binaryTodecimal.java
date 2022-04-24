import java.util.Scanner;
import java.lang.Math;

class binaryTodecimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int i =0  , ans =0 ;
        while( n !=0){
            int bit = n%10;
            if(bit == 1){
            // ans =    Math.pow(a, b) + ans;
            i++;
            }
            n = n/10;
        }
        System.out.println(ans);
    }
}
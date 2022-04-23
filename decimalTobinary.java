// import java.lang.FdLibm.Pow;
import java.util.Scanner;
import java.lang.Math;

public class decimalTobinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<0){
            x = x*(-1);
        }
        int n = x;
        int ans = 0 ; 
        int  i = 0;
        while(n!=0){
            int bit = n&1;
            ans = (int) (bit* Math.pow(10, i) + ans);
            n = n >>1;
            i++;

        }
        System.out.println(ans);
    }
    
}

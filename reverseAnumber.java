import java.util.Scanner;
import java.lang.Math;

public class reverseAnumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int ans = reverseno(n);
            System.out.println(ans);
        }
    }

    static int reverseno(int n) {
        int temp = n ;
        int num = 0;
         while(temp!=0){

            if( temp> Integer.MAX_VALUE/10 || temp<Integer.MIN_VALUE/10){   //for the out of range value 
                return 0;
            }
            int lastnum = temp%10; 
            num = num *10 + lastnum;
            temp/=10;
         }
         return num;
    }
    
}

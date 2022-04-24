import java.util.Scanner;

public class complementOfANumber {

    public static void main(String[] args) {
        ///aPPROCH 1 
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int mask = 0 ; 
        int m = n ;
        while(m!=0){
            mask = (mask<<1)| 1 ;
            m = m >>1;
        }
        int ans = mask & (~n); 
        System.out.println(ans);

    }
    
}

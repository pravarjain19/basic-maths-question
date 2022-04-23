import java.util.Scanner;

public class noOf1bits {

    private static int setbits(int n) {
        int count  = 0;
        while(n!=0){
            
                count+= n&1;
            
            n = n>>1;
        }
       return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  6;
        int ans = setbits(n);
        System.out.println(ans);
        System.out.println(Integer.toBinaryString(n));
    }
    
}

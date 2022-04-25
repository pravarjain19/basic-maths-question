import java.util.Scanner;

class NumberOfBitinTwoNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        bits(a,b);
    }

    public static void bits(int a, int b) {
        int count  = 0;
    //    int tot = 0;
        while(a!=0){
            
                count+= a&1;
            
            a = a>>1;
        }
        // int count  = 0;
        while(b!=0){
            
                count+= b&1;
            
            b = b>>1;
        }
        System.out.println(count);
    }
}
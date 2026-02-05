import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성

        Scanner scan = new Scanner(System.in);

        int total = scan.nextInt();

        int num = scan.nextInt();

        int realPrice =0;
        for(int i = 0; i<num;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            realPrice = realPrice+ a*b;
        }
        
        if(total==realPrice)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}
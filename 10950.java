import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 0;i<num;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println(a+b);
        }
    }
}
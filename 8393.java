import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int total=0;
        for(int i=1;i<=num;i++){
            total= total+i;
        }
        System.out.println(total);

    }
}
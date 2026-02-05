import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        Scanner scan = new Scanner(System.in);

        int dan = scan.nextInt();

        for(int i = 1; i<10; i++ ){
            System.out.printf("%d * %d = %d\n",dan,i,dan*i);
        }

    }
}
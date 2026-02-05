import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        Scanner scan = new Scanner(System.in);

        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = a/b;
        System.out.print(c);
    }
}
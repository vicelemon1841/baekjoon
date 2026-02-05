import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a>b)
            System.out.print(">");
        else if(a<b)
            System.out.print("<");
        else
            System.out.print("==");
    }
}
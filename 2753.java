import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        if(a%400==0)
            System.out.println("1");
        else if(a%100==0)
            System.out.println("0");
        else if(a%4==0)
            System.out.println("1");
        else
            System.out.println("0");
        
    }
}
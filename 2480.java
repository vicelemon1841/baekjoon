import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int reward = 0;
        if( a==b && b==c)
            reward = 10000+a*1000;
        else if (a==b || a==c)
            reward = 1000+a*100;
        else if (b==c)
            reward = 1000+b*100;
        else
            reward = Math.max(a,Math.max(b, c))*100;

        System.out.print(reward);
    }
}
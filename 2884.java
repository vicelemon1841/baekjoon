import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int m = scan.nextInt();

        int m45 = m - 45;

        if(m45 <0){
            m45 = m + 15;
            h = h-1;
            if(h<0)
                h=23;
        }

        System.out.printf("%d %d",h,m45);
    }
}
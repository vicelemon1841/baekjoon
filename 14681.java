import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        if(x*y>0){
            // 1,3 사분면
            if(x>0)
                System.out.print("1");
            else 
                System.out.print("3");
        }
        else{
            // 2,4 사분면
            if(x>0)
                System.out.print("4");
            else 
                System.out.print("2");
        }
    }
}
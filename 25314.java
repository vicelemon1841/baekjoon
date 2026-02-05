import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

    
        StringBuffer sb = new StringBuffer();

        for(int i =0; i<num/4;i++){
            sb.append("long ");
        }
        sb.append("int");

        System.out.println(sb.toString());
    }
}
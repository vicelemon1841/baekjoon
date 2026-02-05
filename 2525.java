import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성

        Scanner scan = new Scanner(System.in);

        int startH = scan.nextInt();
        int startM = scan.nextInt();
        int duration = scan.nextInt();
        
        // 분 계산
        int resultM = startM + duration;

        if(resultM>59){
            int addH = resultM/60;
            resultM = resultM%60;
            startH = startH+addH;
            if(startH>23){
                startH = startH-24;
            }
        }

        System.out.printf("%d %d",startH,resultM);

    }
}
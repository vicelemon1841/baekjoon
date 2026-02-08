import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        String[] ar1 = line.split(" ");

        //바구니 갯수
        int[] basket = new int[Integer.parseInt(ar1[0])];
        // 횟수
        int time = Integer.parseInt(ar1[1]);

        for(int i=0;i<time;i++){
            String lineN = br.readLine();
            String[] ar2 = lineN.split(" ");
            int start = Integer.parseInt(ar2[0])-1;
            int end = Integer.parseInt(ar2[1])-1;
            int num = Integer.parseInt(ar2[2]);
            for(int j = start;j<=end;j++){
                basket[j] = num;
            }
        }

        for(int a:basket){
            bw.write(String.valueOf(a));
            bw.write(" ");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
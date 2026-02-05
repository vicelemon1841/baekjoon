import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //첫 번째 줄 받기
        String fLine = br.readLine();
        String[] ar = fLine.split(" ");

        // 총 갯수랑 비교 숫자 받아두기
        int a = Integer.parseInt(ar[0]);
        int b = Integer.parseInt(ar[1]);

        //2번째 줄 읽기
        StringTokenizer nums = new StringTokenizer(br.readLine());

        for(int i =0; i<a;i++){
            int num = Integer.parseInt(nums.nextToken());
            if(num<b)
                bw.write(String.valueOf(num)+" ");

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
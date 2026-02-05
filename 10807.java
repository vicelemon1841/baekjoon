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

        int t = Integer.parseInt(br.readLine());
        StringTokenizer nums = new StringTokenizer(br.readLine());
        int v =Integer.parseInt(br.readLine());
        int cnt=0;
        for(int i=0; i<t;i++){
            int num = Integer.parseInt(nums.nextToken());
            if(num==v)
                cnt++;
        }

        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
        br.close();
    }
}
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

        String line = br.readLine();
        for(int i =1; i<=Integer.parseInt(line);i++){
            String num = br.readLine();
            StringTokenizer nums = new StringTokenizer(num);
            int cnt = nums.countTokens();
            int sum = 0;
            for(int j =0; j<cnt;j++){
                sum = sum + Integer.parseInt(nums.nextToken());
            }
            StringBuilder sb = new StringBuilder("Case #").append(i).append(": ").append(sum);

            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
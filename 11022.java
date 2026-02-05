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
        for(int i=1; i<=Integer.parseInt(line);i++){
            String testCase = br.readLine();
            StringTokenizer nums = new StringTokenizer(testCase);

            int a=Integer.parseInt(nums.nextToken());
            int b=Integer.parseInt(nums.nextToken());
            

            StringBuilder sb = new StringBuilder("Case #").append(i).append(": ")
            .append(a).append(" + ").append(b).append(" = ").append(a+b);
            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
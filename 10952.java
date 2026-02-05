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

        while(true){
            String line = br.readLine();
            if("0 0".equals(line))
                break;
            StringTokenizer nums= new StringTokenizer(line);
            int cnt = nums.countTokens();
            int sum=0;
            for(int i =0; i<cnt ; i++){
                sum = sum + Integer.parseInt(nums.nextToken());
            }
            bw.write(String.valueOf(sum));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
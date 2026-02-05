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

        //최초 1줄 읽기
        String num = br.readLine();
        for(int i =0;i<Integer.parseInt(num);i++){
            String nums = br.readLine();
            StringTokenizer st = new StringTokenizer(nums);
            int sum= 0;
            int cnt = st.countTokens();
            for(int j =0; j<cnt;j++){
                sum= sum + Integer.parseInt(st.nextToken());
            }
            
            bw.write(String.valueOf(sum));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
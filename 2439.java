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

        String t = br.readLine();
        int num = Integer.parseInt(t);
        for(int i =1; i<=num;i++){
            StringBuilder sb= new StringBuilder();
            for(int j= 1; j<=num;j++){
                if(j<=num-i)
                    sb.append(" ");
                else
                    sb.append("*");
            }
            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
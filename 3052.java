import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        Set ar = new HashSet<>();

        while((line = br.readLine())!=null){
            ar.add(Integer.parseInt(line)%42);
        }
        bw.write(String.valueOf(ar.size()));

        bw.flush();
        bw.close();
        br.close();
    }
}
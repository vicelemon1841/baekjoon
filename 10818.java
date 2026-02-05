import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String fLine= br.readLine();

        int t = Integer.parseInt(fLine);

        String nums = br.readLine();
        String[] numAr = nums.split(" ");
        TreeSet numSet = new TreeSet<>();
        
        for(int i = 0; i<t; i++){
            numSet.add(Integer.parseInt(numAr[i]));
        }

        StringBuilder sb = new StringBuilder();
        sb.append(numSet.first()).append(" ").append(numSet.last());

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
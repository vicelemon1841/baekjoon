import java.io.BufferedInputStream;
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

        int[] ar = new int[29]; 

        int i =1;
        String line;
        while(( line= br.readLine())!=null){
            int num = Integer.parseInt(line);

            ar[i] = num;
            i++;
        }

        for(int j = 1; j<31;j++){
            boolean chk = true;
            for(int k =1;k<ar.length;k++){
                if(ar[k]==j){
                    chk =false;
                    break;
                }
            }
            if(chk){
                bw.write(String.valueOf(j));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
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

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] ar = new double[num];
        double max =0;

        double sum = 0;
        for(int i =0; i<num;i++){
            ar[i] = Integer.parseInt(st.nextToken());
            
            if(i==0)
                max = ar[i];
            else
                if(max<ar[i])
                    max= ar[i];

            sum=sum+ar[i];
        }
        
        double reScore = 0;
        reScore = sum/max*100;
        /* for(int i=0; i<ar.length;i++){
            reScore = reScore + ar[i]/max*100;

        } */

        bw.write(String.valueOf(reScore/num));
        bw.flush();
        bw.close();
        br.close();

    }
}
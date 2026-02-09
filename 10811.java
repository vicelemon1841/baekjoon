import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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

        StringTokenizer line = new StringTokenizer(br.readLine());

        int busketSize = Integer.parseInt(line.nextToken());
        int time = Integer.parseInt(line.nextToken());

        int[] ar = new int[busketSize+1];

        for(int i=1; i<=busketSize;i++){
            ar[i]=i;
        }

        for(int i =0; i<time;i++){
            line = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(line.nextToken());
            int end = Integer.parseInt(line.nextToken());
            
            for(int j = start, k = end;k-j>0 ;j++,k--){
                int space = ar[j];
                ar[j] = ar[k];
                ar[k] = space;
            }
        }

        for(int i=1; i<ar.length;i++){
            bw.write(String.valueOf(ar[i])+" ");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
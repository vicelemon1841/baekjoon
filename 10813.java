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

        String line = br.readLine();
        String[] ar1 = line.split(" ");
        

        int totalBasket = Integer.parseInt(ar1[0]);
        int time = Integer.parseInt(ar1[1]);

        int[] basket = new int[totalBasket];

        for(int i=1;i<=totalBasket;i++){
            basket[i-1]=i;
        }

        for(int i =0; i<time; i++){
            String line2 = br.readLine();
            String[] ar2 = line2.split(" ");
            
            int first = Integer.parseInt(ar2[0])-1;
            int second = Integer.parseInt(ar2[1])-1;

            int space = basket[first];

            basket[first] = basket[second];
            basket[second] = space;
        }

        for(int i:basket){
            bw.write(String.valueOf(i)+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
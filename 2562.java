import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        List<Integer> ari = new ArrayList<>();

        // String 배열을 Integer 배열로 변경
        String line;
        while((line=br.readLine())!=null){
            ari.add(Integer.parseInt(line));
        }

        // 숫자를 하나씩 비교해서 이 숫자가 Max인지 비교
        int maxNum = 0;
        int maxSpace = 0;
        for(int i = 0; i<ari.size(); i++){
        
            if(checkMax(ari.get(i), ari)){
                maxNum = ari.get(i);
                maxSpace = i+1;
            }

        }

        bw.write(String.valueOf(maxNum));
        bw.newLine();
        bw.write(String.valueOf(maxSpace));
        bw.flush();
        bw.close();
        br.close();
      

    }

      public static boolean checkMax(int a,List<Integer> ar){
        boolean chk = true;
            for(int i : ar){
                if(a<i)
                    chk = false;
            }

            return chk;
        }
}
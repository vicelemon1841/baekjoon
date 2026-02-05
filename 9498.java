import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        if(a>89&& a<101)
            System.out.println("A");
        else if(a>79)    
            System.out.println("B");
        else if(a>69)
            System.out.println("C");
        else if(a>59)
            System.out.println("D");
        else
            System.out.println("F");        

    }
}
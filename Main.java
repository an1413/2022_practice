import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        int Aa = Integer.parseInt(A);
        int Bb = Integer.parseInt(B);
        int Cc = Integer.parseInt(C);

        System.out.println((Aa+Bb)%Cc);
        System.out.println((Aa+Bb)%Cc);
        System.out.println((Aa+Bb)%Cc); 

    }
}

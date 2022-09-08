import java.util.*;
import java.io.*;


public class Main {
public static void main(String args[]){
    
    Scanner sc1 = new Scanner(System.in);

    int A,B;

    A = sc1.nextInt();
    B = sc1.nextInt();


    System.out.println(A*(B%10));
    System.out.println(A*((B%100)/10));
    System.out.println(A*(B/100));
    System.out.println(A*B);


 }
}

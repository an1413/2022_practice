import java.util.Scanner;

public class 윤년 {
    public static void main(String[] args){
        int yoonyear;
        boolean result;

        Scanner sc1 = new Scanner(System.in);
        yoonyear = sc1.nextInt();
        

        if((yoonyear%4==0)&& ((yoonyear%100!=0)||(yoonyear%4==0)) ){
            result = true;
        }
        else result = false;

        if (result == true){
            System.out.println(1);
        }
        else System.out.println(0);

    }
}

import java.util.Scanner;


public class ex4_1 {
    public static void main(String[] args){

        Scanner sc1 = new Scanner(System.in);
        int scores[];
        scores = new int[100];

        int Cntscores = 0;

        System.out.println(" o 점수를 입력(중단하려면 -1 입력) > 55");

        while(scores[Cntscores] != -1){
            scores[Cntscores] = sc1.nextInt();
            Cntscores++;
            if(Cntscores == 5){
                break;
            }
        }

        for(int i =0; i<Cntscores; i++){
            System.out.println(" 점수 " + i + " = " + scores[i]);
        }

       


    }
}

/*
 * [ 프로그램의 이해 및 실행 ]
 *   
 *   1) 주어진 프로그램 살펴보고 프로그램의 내용 파악하라.     
 *     
 *   2) 점수 55, 59, 60, 93, -1 입력하여 결과 확인하라
 *    o 점수들 입력(중단하려면 -1 입력) > 55
59
60
93
-1

  * 입력된 점수 개수 = 4
  * 입력된 점수 합 = 267
  * 입력된 점수 평균 = 66.75
  * 점수 평균이 80 미만임
 *   
 *
 * [ 실습과제 ]
 * 
 *   1) 문장의 종류를 스스로 파악해보라.
 *   
 *   2) 이 프로그램에서 빈도가 가장 많은 문장 종류 3가지를 차례대로 나열해보라.     
 */
public class practice_5_4 {
    public static void main(String[] args){
        //1부터 99까지의 합을 구하는 프로그램을 작성하되 while문을 이용해서 작성해보자.
        int i = 1;

        while(i<=100){
            System.out.print(" "+i);
            i++;
        }

        System.out.println();
        // 1부터 100까지 출력하고 이어서 거꾸로 100에서 1까지 출력하는 프로그램을 작성해보자 단 가급적 while문과 do ~ while문을 한 번씩 사용해서 구현하자 .
        int j = 1;
        while(j <= 100){
            System.out.print(" "+j);
            j++;
        }

        j = 100;
        do {
            System.out.print(" "+j);
            j--;
        } while( j>=1);
            
            


        }
    }


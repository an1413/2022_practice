public class practice_5_5 {
    public static void main(String[] args){
        int sum = 1;
        // 1부터 10까지의 곱의 결과를 출력!
        for(int i = 1; i<=10; i++){
            sum *= i;
        }
        System.out.println(sum);

        //구구단 중 5단을 출력하는 프로그램을 for문을 이용해서 작성해보자.
        int ii;
        int sumsum = 0;
        for(ii= 1; ii<=9;ii++){
            System.out.println("5 * "+ii+" = " + (ii*5));
        }
    }
}

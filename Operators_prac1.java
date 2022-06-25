public class Operators_prac1 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        num1 = num2 = num3;
        System.out.println(num1);
        System.out.println(num2);

        int num = 3;
        int result = 0;
        for(int i = 2; i <= 4; i++){
            num += (3*i); 
            System.out.println(num);
        }

    }
}

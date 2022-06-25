public class TwosComp {
    public static void main(String[] args){
        int num = 7;
        num = ~num;
        num += 1;
        System.out.println(num);

        int num2 = 15678;
        System.out.println((num2 >>2) & 1);
        System.out.println((num2 >>4) & 1);
    }
}

public class prac_6_1 {
    public static void main(String[] args){

        int x, y;
        x = 5;
        y = 3;
        how(x,y);
        inf(5,8);
    }

    public static void how(int x, int y){
        System.out.println(x + " + " + y + " = " +(x+y));
        System.out.println(x + " - " + y + " = " +(x-y));
        System.out.println(x + " * " + y + " = " +(x*y));
        System.out.println(x + " / " + y + " = " +(x/y));
        System.out.println(x + " % " + y + " = " +(x%y));
    }

    public static void inf(int x, int y){
        int result = 0;
        System.out.println(x + " - " + y + " = " +Math.abs(x-y));
    }
}

class Trianglee{
    int alxqus;
    int high;
    public Trianglee(int alx,int highh){
        alxqus = alx;
        high = highh;
    }

    public int change(int alx){
        alxqus = alx;
        return alxqus;
    }
    public int change_high(int highh){
        high = highh;
        return high;
    }
    public void print_Triangle(){
        System.out.println("삼각형의 높이는 " + (alxqus*high/2));
    }
}

public class Triangle {
    public static void main(String[] args){
        Trianglee tri1 = new Trianglee(20,30);

        tri1.print_Triangle();

        tri1.change(30);
        tri1.print_Triangle();
    }
}


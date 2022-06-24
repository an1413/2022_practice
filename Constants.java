public class Constants {
    /*상수는 '값이 변하지 않는 수'를 의미한다. 하지만 자바에서는 한번 그 값이 정해지면 이후로는 변경이 불가능한 변수도 상수라 한다.
     * 변수를 선언할 때 그 앞에 final이라는 선언 추가하면 그 변수는 '상수'가 된다. 그리고 다음 두 가지 특징을 지니게 된다.
     * 값을 딱 한 번만 할당할 수 있다.
     * 한번 할당된 값은 변경이 불가능하다.
     * 상수의 이름을 지을 때는 모두 대문자로 짓는다.
     * 이름이 둘 이상의 단어로 이뤄질 경우 단어 사이에 언더바를 넣는다.
     * 리터럴..에 대한 이해.
     * 10진수로 int 형 정수 표현
     * int num = 11 + 22 + 33; (10진수)
     * int num = 011 + 022 +033;  (8진수)
     * int num = 0x11 + 0x22 + 0x33; (16진수)
     * 
     */
    public static void main(String[] args){
        final int MAX_SIZE = 100;
        final char CONST_CHAR = '상';
        final double CONST_ASSIGED = 3.4e6;
        System.out.println("상수1 : " + MAX_SIZE);
        System.out.println("상수2 : " + CONST_CHAR);
        System.out.println("상수3 : " + CONST_ASSIGED);
    }
}

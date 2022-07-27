class TemperatureConversion_CtoF{
    int C;
    int F;
    int result_CtoF;
    public void C(int c){
        this.C =c;
    }


    public int getC() {
        return C;
    }


    public int getResult_CtoF() {
        return result_CtoF;
    }

    void printtemper(){
        System.out.println("화씨 온도 : " + F);
    }
}

public abstract class ex3_4_2 {
    public static void main(String[] args){
        TemperatureConversion_CtoF f1 = new TemperatureConversion_CtoF();
        f1.getc(33);
    }
}


/*[ 실습과제 ]
 *
 *   1) 이 프로그램은 화씨온도를 섭씨온도로 변환하여 출력한다. 
 *      반대로 섭씨온도를 입력하여 화씨온도로 변환하여 출력하는 프로그램을
 *      Pr3_4_1_TemperatureConversion_CtoF 클래스로 작성하라. 
 *       
 *      (섭씨온도 C를 화씨온도 F로 변환하는 공식: F = C * 9 / 5  + 32)
 *   
 *   2) 이 프로그램은 화씨온도를 섭씨온도로 변환하여 출력한다. 
 *      화씨온도를 캘빈온도로  변환하여 출력하는 프로그램을 
 *      Pr3_4_1_TemperatureConversion_FtoK 클래스로 작성하라.  
 *      
 *      (섭씨온도 C를 캘빈온도 K로 변환하는 공식은 K = C + 273.15이며, 
 *       화씨온도에서 섭씨온도를 구한 후 다시 섭씨온도에서 캘빈온도를 구해 출력하면 됨) 
 *       
 *   3) 체질량 지수(體質量指數, body mass index, BMI)는 비만도를 나타내는 지수이며 
 *      체중과 키의 관계로 계산된다.
 *      
 *      키가 h 미터, 체중이 w 킬로그램일 때, BMI = w / (h * h)이다.
 *      (키의 단위가 센티미터가 아닌 미터임에 유의해야 한다.)
 *      
 *      몸무게와 키를 저장할 변수를 선언하고 몸무게와 키를 입력받아 BMI를 계산하여 
 *      출력하는 프로그램을 Pr3_4_1_BMI_InOut 클래스로 작성하라. 
 *      몸무게는 Kg, 키는 cm로 입력받도록 한다. 
 * 
 *      
 * [ 스스로 생각하고 고민할 과제 ]  
 *   
 *    o 이 프로그램에서는 변환된 결과를 출력하는 양식이 4가지로 다르게 작성되어 있다.
 *      4가지 중에서 가장 좋다고 생각되는 양식을 선정해보라. 그 이유는 무엇인가?
 *      옆의 학생과 선정된 양식에 대해 비교해보라. 혹시 더 좋은 양식을 디자인할 
 *      수 있으면 해보라.
 *                       
 * 
 * [ 참고사항 ]
 * 
 *   1) 실습과제를 할 때에는 이 클래스의 프로그래밍 스타일과 동일한 스타일의 프로그램을 
 *      작성하여야 한다.
 *     
 *   2) 실수를 SkScanner.getDouble() 메소드로 입력할 때에는 정수, 소수형 실수, 
 *      지수형 실수 모두 입력이 가능하다. 그러므로 77, 77.7, 77.7e10 등도 화씨온도로 입력할 수 있다. 
 *      
 *   3) 프로그램은 한번 실행된 후 종료된다. 주어진 프로그램을 계속 반복하는 가장 쉬운 방법이 
 *      main() 메소드의 끝에 문장 < main(args); > 을 추가하는 것이다.
 *      
 *      이 경우 프로그램은 계속 반복 실행된다. 
 */

public class ex5_2{
    public static void main(String[] args){

        drawRightTriangle_BaseStar2();
    }

    private static void drawRightTriangle_BaseStar2() {
        
    }

}



/*[ 실습과제 ]
 * 
 *   1) 밑변이 '*' 2, 3, 4, 5, 6, 7, 8, 9, 10개인 직각 삼각형들을 모두 그리도록 프로그램을 수정하라.
 *      이 작업을 위해서 필요한 메소드를 더 작성하고 main() 메소드에서 이를 호출하면 된다.
 *      이미 작성한 메소드들과 아주 비슷하므로 어렵지 않을 것이다.
 *    
 *   2) 이 프로그램의 스타일대로 밑변이 '*' 1개부터 50개인 직각 삼각형을 모두 그리려면 
 *      몇 개의 메소드가 필요한가를 계산해보라.      
 *      
 *   3) 밑변이 '*' 3개인 직각 삼각형 그리는 static void drawRightTriangle_BaseStar3() 메소드는
 *      drawRightTriangle_BaseStar2()를 이용하여 다음과 같이 작성할 수 있다.
 *      
 *	      static void drawRightTriangle_BaseStar3() { 
 *		     System.out.println("\n  * 밑변이 '*' 3개인 직각 삼각형  * "); 
 *		
 *		     drawRightTriangle_BaseStar2()  // 밑변이 '*' 2개인 직각 삼각형 그리는 메소드 호출
 *           printStar3InLine();            // printStar3InLine() 메소드 호출
 *	      }
 *
 *      drawRightTriangle_BaseStar4()와 void drawRightTriangle_BaseStar5() 메소드도
 *      마찬가지로 직각 삼각형 그리는 메소드 호출로 보다 간단하게 작성될 수 있다. 
 *      
 *      직각 삼각형 그리는 메소드 호출로 메소드들을 변경하고 실행하여 결과를 확인하라. public class ex5_2 {
    
 }
 */
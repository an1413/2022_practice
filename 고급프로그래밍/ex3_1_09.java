public class ex3_1_09 {
    public static void main(String[] args)  {
    String name = "홍길동"; 
		
		System.out.println("\n  ** 문자열 동등 비교 연산(==) 및 equals(), compareTo() 메소드 **\n");

		System.out.println("  * 변수 초기값: name = " + name); 
		System.out.println(); 

		// 문자열 상수와 문자열 상수의 동등 비교
		System.out.println("  * \"홍길동\" == \"홍길동\"      := " + ( "홍길동" == "홍길동" )); 
		System.out.println("  * \"홍길동\".equals(\"홍길동\") := " + ( "홍길동".equals("홍길동") )); 
		System.out.println(); 
		
		// 문자열 변수와 문자열 상수의 동등  비교
		System.out.println("  * name == \"홍길동\"      := " + ( name == "홍길동" )); 
		System.out.println("  * name.equals(\"홍길동\") := " + ( name.equals("홍" + "길동") )); 
		System.out.println(); 

		// 문자열 변수와 문자열 상수의 동등 비교
		System.out.println("  * name == \"홍길서\"      := " + ( name == "홍길서" )); 
		System.out.println("  * name.equals(\"홍길서\") := " + ( name.equals("홍길서") )); 
		System.out.println(); 

		// 문자열 사전 순서상 크기 비교
		System.out.println("  * \"홍길동\".compareTo(\"홍길동\") := " + ( "홍길동".compareTo("홍길동") )); // 크기가 같으므로 0
		System.out.println("  * \"홍길동\".compareTo(\"홍길서\") := " + ( "홍길동".compareTo("홍길서") )); // "홍길동"이 "홍길서"보다 작으므로 음수
		System.out.println("  * name.compareTo(\"홍길남\")    := " + ( name.compareTo("홍길남") ));  // "홍길동"이 "홍길남"보다 크므로 양수
		System.out.println(); 

		System.out.println("  * \"Java\".compareTo(\"C\"))        := " + ( "Java".compareTo("C") )); // "Java"가 "C"보다 크므로 양수
		System.out.println("  * \"JDK1.7\".compareTo(\"JDK1.8\")) := " + ( "JDK1.7".compareTo("JDK1.8") )); // "JDK1.7"가 "JDK1.8"보다 작으므로 음수
    }
}

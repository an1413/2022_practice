class Person{
    String name; int age;  String currentLocation;

    Person(String name, int age){
        this.name = name;  this.age = age;
    }

    void goTo(String location){
        this.currentLocation = location;
    }
}

class Employee extends Person{
    String empType;
    int empno;
    String dateHired;

    Employee(String name, int age, String empType, int empno, String dateHired) {
		super(name, age);   // 상위 클래스 객체 생성자 이용하여 초기화
		this.empType = empType;   this.empno = empno; 
		this.dateHired = dateHired; 
	}

    void goToWork(){
        goTo("회사");
    }

    void output(){
        System.out.println("\n  * 사원 - 이름:" + this.name + ", 나이:" + this.age + 
				", 현위치:" + this.currentLocation + ", 사원타입:" + this.empType +
				", 사원번호:" + this.empno + ", 입사일:" + this.dateHired);
	}
}
// 정규직 사원을 나타내는 클래스
class RegularEmployee extends Employee {
	int annualSalary;  // 연봉(단위: 만원)
	int bonus;        // 보너스(단위: 만원)

	// 정규직 사원 정보가 주어지면 필드에 저장하는 객체 생성자
	RegularEmployee(String name, int age, int empno, String dateHired, int annualSalary, int bonus) {
		super(name, age, "정규직", empno, dateHired);  

		this.annualSalary = annualSalary;  this.bonus = bonus;
	}

	// getSalary(): 월급여를 구하여 반환하는 메소드 
	int getSalary() {
		return (this.annualSalary + bonus) / 12  * 10000;  // 월급여 = (연봉 + 보너스 ) /12
	}

	// output(): RegularEmployee 객체의 모든 필드 값 출력하는 메소드
	void output() {
		System.out.println("\n  * 정규직 사원 - 이름:" + this.name + ", 나이:" + this.age + 
				", 현위치:" + this.currentLocation + ", 사원타입:" + this.empType +
				", 사원번호:" + this.empno + ", 입사일:" + this.dateHired +
				"\n            연봉: " + this.annualSalary + "만원, 보너스:" + this.bonus +
				", 월급 : " + this.getSalary() + "원" );   
	}
}

class PartTimeEmployee extends Employee {
	int payPerHour;		// 시간당 수당(단위: 원)
	int hoursWork;  	// 근무시간

	// 시간제 사원 정보가 주어지면 필드에 저장하는 객체 생성자
	PartTimeEmployee(String name, int age, int empno, String dateHired, int payPerHour) {
		super(name, age, "시간제", empno, dateHired);  

		this.payPerHour = payPerHour; 
	}

	// setHoursWork((): 근무시간을 저장하는 메소드
	void setHoursWork(int hours) {
		this.hoursWork = hours;
	}

	// getSalary(): 월급여를 구하여 반환하는 메소드:  
	int getSalary() {
		return this.payPerHour * this.hoursWork; // 월급여 = 시간당 수당 * 근무시간
	}

	// output(): PartTimeEmployee 객체의 모든 필드 값 출력하는 메소드
	void output() {
		System.out.println("\n  * 시간제 사원 - 이름:" + this.name + ", 나이:" + this.age + 
				", 현위치:" + this.currentLocation + ", 사원타입:" + this.empType +
				", 사원번호:" + this.empno + ", 입사일:" + this.dateHired +
				"\n            시간당 수당: " + this.payPerHour + "원, 근무시간:" + this.hoursWork +
				", 월급 : " + this.getSalary() + "원" );  
	}
}

// 인턴 사원을 나타내는 클래스
class Intern extends Employee {
	int monthsIntern;  // 인턴 개월수
	int payIntern;     // 인턴수당(단위: 만원)

	// 인턴 사원 정보가 주어지면 필드에 저장하는 객체 생성자
	Intern(String name, int age, int empno, String dateHired, int monthsIntern, int payIntern) {
		super(name, age, "인턴", empno, dateHired);  

		this.monthsIntern = monthsIntern;    this.payIntern = payIntern; 
	}

	// getSalary(): 월급여를 구하여 반환하는 메소드 
	int getSalary() {
		return this.payIntern / this.monthsIntern * 10000;// // 월급여 = 인턴수당 / 인턴월수
	}

	// output(): PartTimeEmployee 객체의 모든 필드 값 출력하는 메소드
	void output() {
		System.out.println("\n  * 인턴 사원 - 이름:" + this.name + ", 나이:" + this.age + 
				", 현위치:" + this.currentLocation + ", 사원타입:" + this.empType +
				", 사원번호:" + this.empno + ", 입사일:" + this.dateHired +
				"\n            인턴월수: " + this.monthsIntern + ", 인턴수당:" + this.payIntern +
				"만원, 월급 : " + this.getSalary() + "원" );  
	}
}


public class Ex7_1_4_EmployeeMgmt {
    public static void main(String[] args) {
		RegularEmployee rEmp;   // 정규직 사원 박문수를 참조할 참조변수
		PartTimeEmployee pEmp;  // 시간제 사원 허생을 참조할 참조변수
		Intern iEmp;            // 인턴 사원 김철수를 참조할 참조변수

		// 28세인 박문수는 사원번호 1035, 입사일이 20140301, 연봉 4000만원, 보너스 800만원인 정규직 사원임
		rEmp = new RegularEmployee("박문수", 28, 035, "20140301", 4000, 800);
		rEmp.goToWork();       // 상위 클래스에 선언된 메소드 호출: 박문수가 출근함

		// 26세의 허생은 사원번호 1044, 입사일이 20150301, 시간당 수당 12000원인 시간제 사원임
		pEmp = new PartTimeEmployee("허생", 26, 2023, "20140301", 12000);
		pEmp.setHoursWork(200); // 고유 메소드 호출: 허생이 이번 달에 200시간 일함

		// 23세의 김철수는 사원번호 3018, 입사일이 20160101, 인턴개월수 2개월, 인턴수당 200만원인 인턴 사원임
		iEmp = new Intern("김철수", 23, 3018, "20160101", 2, 200);
		
		// 박문수, 허생, 김철수의 필드 값을 모두 출력
		rEmp.output();
		pEmp.output();
		iEmp.output();
	}
}

class Person{
    String name; int age; String currentLocation;

    Person(String name, int age){
        this.name = name;  this.age = age;
    }

    void goTo(String Location){
        this.currentLocation = Location;
    }

    void output(){
        System.out.println("\n * 사람 - 이름 : " +this.name + ", 나이 : " +this.age+", 현 위치 : " + this.currentLocation);

    }

}

class Student extends Person{
    String schoolname;
    int grade;

    Student(String name, int age){
        super(name, age);
    }

    Student(String name, int age, String schoolname , int grade){
        super(name, age);
        this.schoolname = name;  this.grade = grade;
    }

    void goToSchool(){
        goTo(this.schoolname);
    }

    void output(){
        System.out.println(" \n * 학생 - 이름 : " +this.name + ", 나이 : "+this.age+ ", 현위치 : " +this.currentLocation+", 학교명 : " +this.schoolname+ ", 학년 : " +this.grade);
    }
}

class UniversityStudent extends Student {
    int sno;       //학번
    String dept;   //학과
    Course enrolledCourses[] = new Course[100];
    int cntCourses = 0;

    UniversityStudent(String name, int age, String schoolname, int grade, int sno, String dept){
        super(name, age, schoolname, grade);
        this.sno = sno; this.dept = dept;
    }

    void enrolCourse(Course course){
        enrolledCourses[cntCourses++] = course;
    }

    void output(){
        System.out.println("\n * 대학생 - 이름 : "+this.name+"\n 나이 : " +this.age);
    }
}
// 대학생들이 수강해서 과목들을 담을 수 있는 수강 테이블!
class Course{
    String courseNo;
    String coursename;
    int credit;

    Course(String cno, String cname, int credit){
        this.courseNo = cno; this.coursename = cname; this.credit = credit;
    }
}



public class Ex7_2_5_StudentMgmt {
    public static void main(String[] args){
        Person p1 = new Student("안나별", 24, "한신대학교", 4);
        if(p1 instanceof Student)
        ((Student)p1).goToSchool();

        Person p2 = new UniversityStudent("김철수",23,"한국대학교",3,201611001,"컴퓨터");

        if(p2 instanceof Student)
        ((Student)p2).goToSchool();

        if(p2 instanceof UniversityStudent)
        ((UniversityStudent)p2).enrolCourse(new Cource("CS201","Java프로그래밍",3));

    }
}

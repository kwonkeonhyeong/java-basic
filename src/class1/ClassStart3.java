package src.class1;

import java.util.ArrayList;
import java.util.List;

public class ClassStart3 {
    public static void main(String[] args) {

        Student student1;
        student1 = new Student(); // 1. Student 객체 생성
        // Student student = x001; // 2. new Student() 의 결과로 x001 참조값 반환
        // student = x001; // 3. 최종 결과
        System.out.println(student1);

        student1.name = "학생1"; // 1. student1 객체의 name 멤버 변수에 값 대입
        //x001.name = "학생1"; // 2. 변수에 있는 참조 값을 통해 실제 객체에 접근, 해당 객체의 name 멤버 변수에 값 대입
        student1.age = 15;
        student1.grade = 84;


        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 90;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);

//        List<Student> students = new ArrayList<>();
//
//        Student student1 = new Student("학생1", 19, 90);
//        Student student2 = new Student("학생2", 15, 89);
//
//        students.add(student1);
//        students.add(student2);
//
//        for (int i = 0; i < students.size(); i++) {
//            Student student = students.get(i);
//            System.out.println("이름 : " + student.getName() + " 나이: " + student.getAge() + " 성적: " + student.getGrade());
//        }
    }
}

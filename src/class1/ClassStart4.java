package src.class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 84;


        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 90;

        Student[] students = new Student[2];

        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
        /*
        student1, student2 에는 참조 값이 보관되어 있다. 따라서 이 참조 값이 배열에 저장된다.
        또는 student1, student2에 보관된 참조 값을 읽고 복사해서 배열에 대입한다고 표현한다.
        */

        students[0] = student1;
        students[1] = student2;

        /*
        자바에서 변수의 대입(=)은 모두 변수에 들어있는 값을 복사해서 전달하는 것이다.
        이 경우 오른쪽 변수인 student1, student2 에는 참조 값이 들어있다.
        그래서 이 값을 복사해서 왼쪽에 있는 배열에 전달한다.
        따라서 기존 student1, student2 에 들어있던 참조 값은 당연히 그대로 유지된다.

        주의!!
        변수에는 인스턴스 자체가 들어있는 것이 아니다!
        위치를 가리키는 참조 값이 들어있을 뿐이다!
        따라서 대입(=)시에 인스턴스가 복사되는 것이 아니라 참조 값만 복사된다.
        */

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }
    }
}

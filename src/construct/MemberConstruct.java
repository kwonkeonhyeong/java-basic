package src.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가 (생성자 오버로딩)
    MemberConstruct(String name, int age) {
        this(name,age,50);
    }
    /*
    this 규칙
    this()는 생성자 코드의 첫 줄에만 작성할 수 있다. 위반 시에는 컴파일 오류가 발생한다.
    */

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

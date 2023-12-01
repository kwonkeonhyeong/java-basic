package src.final1;

public class FieldInit {

    static final int CONST_VALUE = 10;
    final int value = 10;
    // 위 같은 경우 모든 인스턴스가 같은 값을 사용하기 때문에 결과적으로 메모리를 낭비하게 된다.
    // 물론 JVM에 따라서 내부 최적화를 시도할 수 있다.
    // 또 메모리 낭비를 떠나서 같은 값이 계속 생성되는 것은 개발자가 보기에 명확한 중복이다.
    // 이럴 때 사용하면 좋은 것이 바로 static 영역이다.

//    public FieldInit(int value) {
//        // this.value = value; // 컴파일 오류
//    }
}

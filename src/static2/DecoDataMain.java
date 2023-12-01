package src.static2;

import static src.static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData decoData = new DecoData();
        decoData.instanceCall();

        System.out.println("2. 인스턴스 호출");
        DecoData decoData1 = new DecoData();
        decoData1.instanceCall();

//        DecoData.staticCall(decoData1);

        //추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); // 이렇게 사용하면 마치 인스턴스 메서드 쓰는 것 처럼 오해할 수 있다.

        // 클래스를 통한 접근
        staticCall();
    }
}

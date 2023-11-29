package src.construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 12, 96);

        // 생성자 등장 전
        MemberInit2 member = new MemberInit2();
        member.initMember("user1", 16, 40);

        // 생성자 등장 후
        MemberConstruct member3 = new MemberConstruct("user1", 15, 90);
        /*
        - 생성자 장점
        중복 호출 제거
        생성자가 없던 시절에는 생성 직후에 어떤 작업을 수행하기 위해 다음과 같이 메서드를 직접 한번 더 호출해야 했다.
        생성자 덕분에 객체를 생성하면서 동시에 생성 직후에 작업을 한번에 처리할 수 있게 되었다.
        */

        // MemberConstruct member4 = new MemberConstruct();
        /*
        제약 - 생성자 호출 필수
        생성자의 진짜 장점은 객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야 한다는 점이다.
        */
    }
}

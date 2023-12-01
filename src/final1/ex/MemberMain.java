package src.final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "Kim");
        member.print();
        member.changeData("112","ddd");
        member.print();
    }
}

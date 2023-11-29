package src.construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit1 member1 = new MemberInit1();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit1 member2 = new MemberInit1();
        member2.name = "user2";
        member2.age = 15;
        member2.grade = 95;

        MemberInit1[] members  = {member1, member2};

        for (MemberInit1 member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}

package src.construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit2 member3 = new MemberInit2();
        member3.initMember("user1",15,90);
        MemberInit2 member4 = new MemberInit2();
        member4.initMember("user2",16,95);

        MemberInit2[] members  = {member3, member4};

        for (MemberInit2 member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}

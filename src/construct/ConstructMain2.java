package src.construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user1", 15);

        MemberConstruct[] members = {member, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

    }
}

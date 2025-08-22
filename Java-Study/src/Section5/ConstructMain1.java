package Section5;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 10 , 30);
        MemberConstruct member2 = new MemberConstruct("user2", 20);

        MemberConstruct[] members = {member1,member2};
        for (MemberConstruct member : members) {
            System.out.println("이름 : " + member.name + " 나이: " + member.age + " 성적: "+ member.grade);
        }
    }
}

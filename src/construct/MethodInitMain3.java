package construct;

public class MethodInitMain3 {

    public static void main(String[] args) {

        // 객체 생성 후 객체에서 제공하는 메소드로 초기값 설정 (객체지향)
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit m : members) {
            System.out.println("이름:" + m.name + " 나이:" + m.age + " 성적:" + m.grade);
        }

    }

}

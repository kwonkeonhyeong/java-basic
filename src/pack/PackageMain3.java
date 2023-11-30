package src.pack;


import src.pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User user = new User();
        src.pack.b.User userB = new src.pack.b.User();
        // 같은 이름의 클래스가 있다면 import는 둘중 하나만 선택할 수 있다.
        // 이때는 자주 사용하는 클래스를 import하고 나머지를 패키지를 포함한 전체 경로를 적어주면 된다.
        // 이름이 겹쳤을 때는 자주 사용하는 클래스만 import 한다.
    }
}

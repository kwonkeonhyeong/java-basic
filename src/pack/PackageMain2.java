package src.pack;

import src.pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
    }
    /*
    - 사용자와 같은 위치 => 같은 패키지에 있는 경우에는 패키지 경로를 생략해도 된다.
    - 사용자와 다른 위치 => 패키지가 다르면 src.pack.a.User와 같이 패키지 전체 경로를 포함해서 클래스를 적어주어야 한다.
    */
}

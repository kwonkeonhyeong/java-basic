package src.extends1.overriding;

public class GasCar extends Car {
    @Override
    public void move() {
        System.out.println("LPG차를 빠르게 이동합니다.");
    }
    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}

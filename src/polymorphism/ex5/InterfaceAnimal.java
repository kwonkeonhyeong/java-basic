package src.polymorphism.ex5;

public interface InterfaceAnimal {
    public abstract void sound(); // public abstract 생략 가능
    void move();

    // 인터페이스는 보통 여러군데에서 사용하는 목적으로 쓰기 때문에 접근 제어자를 public을 쓴다.
}

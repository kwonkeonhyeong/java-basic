package src.static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil1.deco(s);
        System.out.println("before: " + s);
        System.out.println("before: " + deco);
    }
}

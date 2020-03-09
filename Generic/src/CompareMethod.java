import javafx.util.Pair;

public class CompareMethod {
    public static void main(String[] args) {
        Pair <Integer, String> p1 = new Pair<>(1, "apple");
        Pair <Integer, String> p2 = new Pair<>(1, "apple");

        boolean result = Util.<Integer, String>compare(p1, p2);

        if (result) {
            System.out.println("논리적으로 동등한 객체 입니다.");
        }
    }

} 

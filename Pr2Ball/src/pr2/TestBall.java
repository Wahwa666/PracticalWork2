package pr2;

public class TestBall {

    public static void main(String[] args) {
        Ball b1 = new Ball(101, 198);
        System.out.println(b1);
        b1.move(80, 62);
        System.out.println(b1);
    }
}

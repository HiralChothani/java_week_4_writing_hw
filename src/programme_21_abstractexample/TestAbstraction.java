package programme_21_abstractexample;

public class TestAbstraction {
    public static void main(String[] args) {
        // In real scenario. object is provided through method, e.g. getShape() method
        Shape s = new Circle();
        s.draw();
    }
}

package WritingTestsInJUnit;

public class Geometry {
    public double calcCircleArea(double radius) {
        if(radius>0) {
            return Math.PI*radius*radius;
        } else {
            throw new RuntimeException("The radius must be a positive value!");
        }
    }

    public void throwException() {
        throw new IllegalArgumentException();
    }
}

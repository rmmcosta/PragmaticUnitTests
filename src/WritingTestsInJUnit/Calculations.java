package WritingTestsInJUnit;

public class Calculations {
    public int add(int a, int b) {
        return a+b;
    }
    public int sub(int a, int b) {
        if(a>=b) {
            return a-b;
        } else {
            throw new RuntimeException("a must be greater or equal then b!");
        }
    }
}

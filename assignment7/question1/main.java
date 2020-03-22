package question1;

public class main {
    public static void main(String[] args) {
        final int LOWER = 2;
        final int UPPER = 5;
        Test obj = new Test();
        try {
            System.out.println(obj.testMethod(new int[10], LOWER, UPPER, 1));
        } catch (MyIndexOutOfBoundException e) {
            System.out.println(e);
        }
        System.out.println("Test finish");
    }

}


/***
 * Test class
 */
class Test{
    public String testMethod(int[] arr, int lowerBound, int upperBound, int index) throws MyIndexOutOfBoundException{
        if (index < lowerBound || upperBound > index) {
            throw new MyIndexOutOfBoundException(lowerBound, upperBound, index);
        } else {
            return "No Exception Happends";
        }
    }
}

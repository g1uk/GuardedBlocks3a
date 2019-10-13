public class IncrementPrintTest {
    private static int myInc = 0;
    private static final int AMOUNT_OF_ITERATIONS = 1000000;

    public static void main(String[] args) {
        Runnable inc = () -> {
            while (myInc < AMOUNT_OF_ITERATIONS) {
                myInc++;
            }

        };
        Thread increment = new Thread(inc);
        increment.start();

        Runnable incPrint = () -> {
            while (myInc < AMOUNT_OF_ITERATIONS) {
                System.out.println(myInc);
            }
        };
        Thread incrementPrint = new Thread(incPrint);
        incrementPrint.start();
    }
}

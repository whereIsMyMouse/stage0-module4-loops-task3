package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
int actualFib = 0;
int nextFib = 1;
        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(actualFib);
            int previousFib = actualFib;
            actualFib = nextFib;
            nextFib = previousFib + actualFib;
        }
    }
}

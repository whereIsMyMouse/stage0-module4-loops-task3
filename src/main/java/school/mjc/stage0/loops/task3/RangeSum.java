package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sumNumbers = 0;
        for (int i = firstBoarder; i <= secondBoarder; i++) {
            sumNumbers = sumNumbers + i;
        }
        System.out.println(sumNumbers);
    }
}
